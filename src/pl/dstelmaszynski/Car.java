package pl.dstelmaszynski;

//klasa abstrakcyjna, nie mozna stworzyc konstruktorow
//w klasie abstarkcyjnej protected lub nic
public abstract class Car {
    protected String producer;
    protected String model;
    protected String color;
    protected Integer seatsNumber;
    protected Engine engine;

    public Car(){
        this.seatsNumber = 2;
    }

    public  Car(String producer, String model, String color, Integer seatNumbers, Engine engine) {
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.seatsNumber = seatNumbers;
        this.engine = engine;
    }
}
