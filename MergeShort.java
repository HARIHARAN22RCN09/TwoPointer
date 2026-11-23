package TwoPointer;
import java.util.ArrayList;
public class MergeShort{
     public static void main(String[] args){
	 int [] arr = {3,2,1,4,3};
	 int low = 0, high = arr.length-1;
	 for(int i =0; i <=high;i++){
		 System.out.println(arr[i]);
	 }
	 mergeSort(arr,low,high);
	 for(int i =0; i <=high;i++){
		 System.out.println(arr[i]);
	 }
	 }
	 
	 public static void mergeSort(int arr[],int low,int high){
	  if(low==high) return;
   	 int mid = low+(high-low)/2;
	  mergeSort(arr,low,mid);
	  mergeSort(arr,mid+1,high);
	  merge(arr,low,mid,high);
	
	 }
	 
	 public static void merge(int arr[],int low,int mid,int  high){
	 
	 ArrayList<Integer> al = new ArrayList<>();
	 int left = low, right = mid+1;
	  while(left<=mid&&right<=high){
	    if(arr[left]<=arr[right]){
		al.add(arr[left]);
		left++;
		}
		else{
		al.add(arr[right]);
		right++;
		}
	  }
	  while(left<=mid){
	   al.add(arr[left]);
	   left++;
	  }
	  while(right<=high){
	   al.add(arr[right]);
	   right++;
	  }
	  for(int i = low ; i<=high;i++){
	    arr[i] = al.get(i-low);
		
	  }
	 
	
	 }
 
 }
