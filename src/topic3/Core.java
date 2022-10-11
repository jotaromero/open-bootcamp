package topic3;

public class Core {

    public static void main(String[] args) {
        int result = add(10, 20, 50);
        System.out.println(result);

        Car myCar = new Car();
        myCar.incrementDoors(1);
        int totalDoors = myCar.getDoors();
        System.out.println(totalDoors);
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }
}