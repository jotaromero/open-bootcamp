package topic3;

public class Core {

    public static void main(String[] args) {
        // Exercise 1
        int[] values = {10, -20, 50};
        int sum = add(values[0], values[1], values[2]);
        String result = String.format("%s + %s + %s = %s",
                integerToString(values[0]), integerToString(values[1]),
                integerToString(values[2]), integerToString(sum));
        System.out.println(result);

        // Exercise 2
        Car myCar = new Car();
        System.out.println("After car object created: " + myCar);

        myCar.incrementDoors(1);
        myCar.incrementDoors(1);
        int totalDoors = myCar.getDoors();
        System.out.println("After the door number was increased 2 times adding 1 door each time, " +
                           "my car has now " + totalDoors + " doors! The same result is: " + myCar);
    }

    private static int add(int a, int b, int c) {
        return a + b + c;
    }

    private static String integerToString(int value){
        return value<0 ? "(" + value + ")" : "" + value;
    }
}