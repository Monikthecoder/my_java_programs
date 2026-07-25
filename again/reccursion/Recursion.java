
class Recursion {

    public static void print(int number) {
        System.out.println(number);
        if (number <= 0) {
            return;
        }
        print(number - 1);
    }

    public static void main(String[] args) {
        int number = 10;
        print(number);
    }
}
