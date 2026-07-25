/***
 *                      * NOTE :- this type of ques.  ASKED 3-4 times  IN THE INTERVIEWS   
 *                      * FLIPCART , MORGAN , MICROSOFT ,  FACEBOOK
Activity Selection
You are given n activities with their start and end times. Select the maximum number of activities
that can be performed by a single person, assuming that a person can only work on a single
activity at a time. Activities are sorted according to end time.

start = [10, 12, 20]
end = [20, 25, 30]

ans = 2 (A0 & A2)
 ***/

class Question1 {

    public static int Maximum_activity(int[] start , int[] end) {


        int result = 1;
        int current_end = end[0];
        for(int i = 1; i < start.length;i++) {
            
            if(start[i] >= current_end) {
                result++;
                current_end = end[i];
            }
            
        }
        

        return  result;
    }

    public static void main(String[] args) {
        int[] start = {10, 12, 20};
        int[] end = {20, 25, 30};
        System.out.println("total actvity can preform by single person : " + Maximum_activity(start, end));
    }
}