class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {

        List<Integer> no = new ArrayList<>();
        int carry =0;
        int numval=0;
        int val;
        int i=num.length-1;
      while(i>=0||k>0){
        numval=0;
        if(i>=0){
            numval =num[i];
        }
        int d =k%10;
        int sum = d +numval+carry;
        carry=sum/10;
        no.add(sum%10);
        k=k/10;
        i--;
      }  
       Collections.reverse(no);
       return no;   
    }
}
