
class Basics {

    public static boolean isRoomAllocated(int roomNO) {
        if (roomNO < 0 && roomNO > 1000) {
            return false;
        }
       return true;
    }

    public static void main(String[] args) {
        int[] rooms = {10, 20, 30, 40, 50};
        int roomNo = 80;

        boolean isRoomAllocated = isRoomAllocated(roomNo);



        for (int i = 0; i < rooms.length; i++) {


            if (!isRoomAllocated) {
                System.out.println("No rooms registered");
                break;
            }

            if (rooms[i] == roomNo) {
                System.out.println("the room  is " + i + " rooms away");
            }

        }

    }
}
