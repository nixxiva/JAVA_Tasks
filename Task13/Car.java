class Car extends Vehicle{
    int numberOfDoors;
    
    Car(String make, String model, int year, int numberOfDoors){
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }
    
    String displayDetails(){
        return (
        "Car Details                : " + "\n" +
        "Make                       : " + make + "\n" +
        "Model                      : " + model + "\n" +
        "Year                       : " + year + "\n" +
        "NumberOfDoors              : " + numberOfDoors +"\n"
    );
}

    public static void main(String[] args) {
        
        Car c1 = new Car("Chevrolet", "216",1997,4);
        Car c2 = new Car("Mazda", "155", 2012,2);
        Car c3 = new Car("Ford", "215", 2020, 5);

        System.out.println(c1.displayDetails());
        System.out.println(c2.displayDetails());
        System.out.println(c3.displayDetails());

    }
}