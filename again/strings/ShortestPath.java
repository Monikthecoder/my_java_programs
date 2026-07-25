class ShortestPath {

    public static int getPath(String path) {
        double x = 0 , y = 0;

        for(int index = 0; index < path.length(); index++) {
            char direction = path.charAt(index);

            if(direction == 'W') {
                x--;
            }
            else if(direction == 'E') {
                x++;
            }
            else if(direction == 'N') {
                y++;
            }
            else {
                y--;
            }
        }
        double x2 = x * x;
        double y2 = y * y;
        return  (int) Math.sqrt(x2 + y2);
    }
    public static void main(String[] args) {
        String path = "WSWSWSWSWS";
        System.out.println(getPath(path));
    }
}