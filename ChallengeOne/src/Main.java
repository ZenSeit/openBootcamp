public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        System.out.println(addingNumber(5, 2, 3));

        Car myCar = new Car("Ford", 3);
        myCar.increaseNumSeats();
        myCar.increaseNumSeats();
        System.out.println("My car has "+myCar.numSeats+" seats");

    }

    public static int addingNumber(int a, int b, int c) {
        return a + b + c;
    }

    static class Car {
        String brand;
        int numSeats;

        public Car(String brand, int numSeats) {
            this.brand = brand;
            this.numSeats = numSeats;
        }

        void increaseNumSeats() {
            numSeats++;
        }

    }

}