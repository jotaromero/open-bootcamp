package topic3;

public class Car {
    int doors = 2;

    public void incrementDoors(int increment){
        doors += increment;
    }

    public int getDoors() {
        return doors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                '}';
    }
}