
/**
 *  *                                   REST STOPS
 * * Farmer John and his personal trainer Bessie are hiking up Mount Vancowver. For their purposes (and yours), the mountain can
 * be represented as a long straight trail of length L meters (1 < L < 106). Farmer John will hike the trail at a constant travel rate of
 * TF seconds per meter (1 < TF ≤ 106). Since he is working on his stamina, he will not take any rest stops along the way.

 *  *Bessie, however, is allowed to take rest stops, where she might find some tasty grass. Of course, she cannot stop just anywhere!
 * There are N rest stops along the trail (1 < N < 105); the i-th stop is zi meters from the start of the trail (0 < xi < L) and has a
 * tastiness value ci (1 ≤ ci < 106). If Bessie rests at stop i for t seconds, she receives ci . t tastiness units.
 * When not at a rest stop, Bessie will be hiking at a fixed travel rate of rp seconds per meter (1 ≤ TB ≤ 106). Since Bessie is young
 * and fit, rB is strictly less than rF.

 *  *Bessie would like to maximize her consumption of tasty grass. But she is worried about Farmer John; she thinks that if at any
 * point along the hike she is behind Farmer John on the trail, he might lose all motivation to continue!
 * Help Bessie find the maximum total tastiness units she can obtain while making sure that Farmer John completes the hike.

 *  *INPUT FORMAT (file reststops.in):

 *  *The first line of input contains four integers: L, N, TF, and rB. The next N lines describe the rest stops. For each i between 1
 * and N, the i + 1-st line contains two integers &i and ci, describing the position of the i-th rest stop and the tastiness of the grass
 * there.

 *  *It is guaranteed that rF > TB, and 0< x1 <...< EN < L. Note that rF and rB
 * are given in seconds per meter!

 *  *OUTPUT FORMAT (file reststops.out):

 *  *A single integer: the maximum total tastiness units Bessie can obtain.

 *  *SAMPLE INPUT:

 *  *10 243 72 8 1

 *  *SAMPLE OUTPUT:

 *  *15

 *  *In this example, it is optimal for Bessie to stop for 7 seconds at the x = 7
 * rest stop (acquiring 14 tastiness units) and then stop for an additional 1
 * second at the x = 8 rest stop (acquiring 1 more tastiness unit, for a total
 * of 15 tastiness units).
 */
class RestStops {

    public static void main(String[] args) {
        
        int length = 10;
        int start = 0;
        int[][] stops = {{7,2},{8,1}};
        for(int i = 0; i < stops.length;i++) {
            System.out.println("stops : " + stops[1][i]);
        }
        int i = 0;
        int maximumTestiness = 0;
        while(start <= length) {
            if(start == stops[i][0]) {
                int restTime = (stops[i][0] * 4) - (stops[i][0] * 3);
                maximumTestiness += restTime * stops[i][1];
            }
            if(i != stops.length - 1) {
                i++;
            }
            start++;
        }

        System.out.println("maximum difference is : " + maximumTestiness);

    }
}
