package TwoPointer;

public class StringPolindrome {
   
    public boolean isPalindrome(String c) {
        c = c.toLowerCase();
        int left = 0, right = c.length()-1;
			while(left<right){
				int ch = c.charAt(left), hc = c.charAt(right);
			if( ch >=97&& ch <=122 ||ch>= 48 && ch <= 57  ){
				if( hc >=97&&hc<=122|| hc >= 48 &&hc <= 57 ){
					if(c.charAt(left)==c.charAt(right)){
						left++;
						right--;
						
					}
					else{
						return false;
					}
					
				}
				else{
					right -- ;
					continue;
				}
			}
			else{
				left++;
				continue;
			}
		  } // while
			return true;
    }

}
