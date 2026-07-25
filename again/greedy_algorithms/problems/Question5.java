



/**
 * 

*                                                           *Indian Coins

We are given an infinite supply of denominations [1, 2, 5, 10, 20, 50, 100, 500, 2000].
Find min no. of coins/notes to make change for a value V.

V= 121
ans = 3 (100+20+1)

V = 590
ans = 4 (500+50+20+20)

GREEDY
 */

class Question5 {
    public static void main(String[] args) {
        int value = 290;
        int[] denominations = {1,2,5,10,20,50,100,200,500,2000};

            
            int ans = 0;
            
            int i = 0;
            int j = denominations.length -1;

            while( i <= j) {
                int temp = denominations[i];
                denominations[i] = denominations[j];
                denominations[j] = temp;
                i++;
                j--;
            }

            int remain_value = value;

            for(int k = 0; k < denominations.length; k++) {

                if(value  == 0) {
                    break;
                }
                while(remain_value >= denominations[k]) {
                    remain_value -= denominations[k];
                    ans++;
                }
            }
        System.out.println("the minimum coins/note requires are : " + ans);
    }
}