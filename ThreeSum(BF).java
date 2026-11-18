import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class ThreeSum{


   public static void main(String[] args){
    int[] arr ={ -1,-1,1,0,2,-4};
    Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	System.out.println(temp(arr));
    }
	
	public static List<List<Integer>> temp(int arr[]){
		List<List<Integer>> al = new ArrayList<>(); 
		for(int i=0;i<arr.length-2;i++){
		
		 if(i>0&&arr[i]==arr[i-1]){
			 
			 continue;
		 }
	    for(int j=i+1;j<arr.length-1;j++){
			if(j+1>1&&arr[j]==arr[j-1]){
				continue;
			}
		for(int k=j+1;k<arr.length;k++){
			if(k+1>2&&arr[k]==arr[k-1]){
				continue;
			}
		 if(arr[i]+arr[j]+arr[k]==0){
			ArrayList<Integer> a = new ArrayList<Integer>();
		 a.add(arr[i]);
		 a.add(arr[j]);
		 a.add(arr[k]);
		 al.add(a);
		 }
		
		}
   }
  
    }//1st for
	return al;
	}
}