
/**
 *                      * Goldman_Sachs
 * *Problem 13

  ****   *Friends Pairing Problem
 * *Given n friends, each one can remain single or can be paired up with some other
 * *friend. Each friend can be paired only once. Find out the total number of ways in
 * *which friends can remain single or can be paired up.
 */
class FriendsPair {

    public static int friendspair(int n) {

        if (n == 1 || n == 2) {
            return n;
        }

        int single = friendspair(n - 1);

        int pair = friendspair(n - 2);

        int pairways = (n - 1) * pair;

        return single + pairways;
    }

    public static int friendspairing(int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        // int fnm1 = friendspair(n - 1);

        // int fnm2 = friendspair(n - 2);

        // int pairways = (n - 1) * fnm2;

        // int totalways = fnm1 + pairways;

        return friendspair(n-1) + (n-1) * friendspair(n-2);
    }

    public static void main(String[] args) {
        System.out.println("total ways are : " + friendspairing(3));
    }
}
