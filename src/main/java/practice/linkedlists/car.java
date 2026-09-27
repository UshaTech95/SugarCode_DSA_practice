package practice.linkedlists;

public class car {

    String engine;
    int noOfSeats;
    String Model;
    long make;
    String Brand;

    public car(String engine, int noOfSeats,String Model,long make,String Brand){
        this.engine = engine;
        this.noOfSeats= noOfSeats;
        this.Model= Model;
        this.make=make;
        this.Brand=Brand;
    }

    public static void main(String[] args) {
        car car1= new car("1498CC", 5, "city", 2025, "Honda");
        car car2= new car("1197cc", 6, "Baleno", 2023, "maruti");

        System.out.println(car1.engine + "|" + car1.noOfSeats + "|" +  car1.Model + "|" +  car1.make + "|"+ car1.Brand );

    }
}
