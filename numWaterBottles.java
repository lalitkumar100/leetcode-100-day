class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
      int drink =numBottles;

      while(numBottles>=numExchange){
        int newbottle =numBottles/numExchange;
        int rembottle =numBottles%numExchange;
        drink +=newbottle;
        numBottles=newbottle+rembottle;

      }

        return drink;
    }
}
