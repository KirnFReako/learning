package ArrayProblems;

public class BestTimeToBUYSELL {
    public static int stock(int[] prices){
        int minprice = Integer.MAX_VALUE, maxprice = 0;

        for( int i =0 ;i<prices.length;i++){
            minprice =  Math.min(minprice, prices[i]);
            maxprice = Math.max(maxprice,prices[i] -minprice);
        }
        return maxprice;
    }

    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};

        System.out.println(stock(prices));
    }


}
