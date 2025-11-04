public class Car{
    int noOfwheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String noOfModels;
    String Company;
    public Car(int noOfwheels, int noOfDoors, int maxSpeed, String name, String noOfModels, String company) {
        this.noOfwheels = noOfwheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.noOfModels = noOfModels;
        this.Company = company;
    }
    
    @Override
    public String toString() {
        return "Car [noOfwheels=" + noOfwheels + ", noOfDoors=" + noOfDoors + ", maxSpeed=" + maxSpeed + ", name="
                + name + ", noOfModels=" + noOfModels + ", Company=" + Company + "]";
    }
    
    public static void main(String[] args) {
        Car swift = new Car(4,4,120,"Swift","SW86","Maruti");
        System.out.println(swift);
    }
}
