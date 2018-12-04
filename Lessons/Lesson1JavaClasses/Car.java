public class Car {

    private String make;
    private String model;
    private int year;
    private int numPassengers;

    public Car(String myMake, String myModel, int myYear) {
        make = myMake;
        model = myModel;
        year = myYear;
        numPassengers = 0; // we don’t specify this!
    }

    public void incPassengers() {
        // increment numPassengers by 1
        numPassengers = numPassengers + 1;
    }

    public String getMake() {
        // return car make
        return make;
    }
    
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 1997);
        System.out.println(car.getMake());
    }
}
