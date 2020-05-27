package pl.dstelmaszynski;

//dziedziczy po Car - przez zapis extends
public class SportCar extends Car {


    public SportCar(String producer, String model, String color, Integer seatNumbers, Engine engine) {

        // komenda super służy do wykonania konstruktora, z ktorego dziedziczymy
        super(producer, model, color, seatNumbers, engine);
    }

    @Override
    public String toString() {
        return "SportCar{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", seatsNumber=" + seatsNumber +
                ", engine=" + engine +
                '}';
    }
}
