public class RevString {
    public static String rev(String s){
      char ar[] = s.toCharArray();
	  
	  for(int left =0; left <=(ar.length)/2;left++){
	       char c =ar[left];
	       ar[left] = ar[(ar.length-1)-left];
		   ar[(ar.length-1)-left] = c;
	  }
	  return new String(ar);
    }
}
