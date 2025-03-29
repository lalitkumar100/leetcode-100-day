class Solution {
    public int minAddToMakeValid(String s) {

       int open=0;
       int move=0; 
      int n =s.length();
    for(char t : s.toCharArray())
    {
        if(t=='(')
         open++;

        else{
            if(open>0){
                open--;
            }
            else{
                move++;
            }

        }
      
    }

         move+=open;
    
    return move;
        
    }
}
