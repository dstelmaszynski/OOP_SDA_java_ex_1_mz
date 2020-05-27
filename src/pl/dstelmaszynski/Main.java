package pl.dstelmaszynski;

public class Main {

    public static void main(String[] args) {
        Address address = new Address("Lipowa", "Kunowo",
                "Poland", 14, 1);
        Person person = new Person("Michał", "Kowalski", 32, address);
//        System.out.println(person.toString());

//        System.out.println(person.introduce());

//        System.out.println(person.getName());
//        person.setName("Wacław");
//        System.out.println(person.getName());
//        System.out.println(person.getSurname());
//        person.setSurname("Pikadorowicz");
//        System.out.println(person.getSurname());

        Address address1 = new Address("Gogolewska", "Oborowo",
                "Holand", 15, 2);
        System.out.println(person.toString());
        person.setAddress(address1);
        System.out.println(person.toString());

//        System.out.println(address);

        Engine engine = new Engine(2.0, 150, 6.9);
        System.out.println("\n" + engine.toString());

        engine.setCapacity(4.0);
        System.out.println("\n" + engine.getCapacity());

        SportCar sportCar = new SportCar("Audi", " R8 ", " red ",  4, engine);
        System.out.println(sportCar.toString());


    }
}

// 2h 32 min