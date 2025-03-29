class Solution {
    public boolean isPalindrome(String s) {
      int i =0;
      int j =s.length()-1;
      int n =s.length()-1;
        
      while(i<j){
        while(i<n&&i<j&&!Character.isLetterOrDigit(s.charAt(i)))
        i++;
         while(j>0&&i<j&&!Character.isLetterOrDigit(s.charAt(j)))
        j--;
        
        // System.out.println("s["+i+"]="+s.charAt(i)+" == "+s.charAt(j)+"=s["+j+"]");
        if(i<j&&Character.toLowerCase(s.charAt(i++))!=Character.toLowerCase(s.charAt(j--)))
        return false;
      }
      return true;
    }
}
