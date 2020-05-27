package pl.dstelmaszynski;

public class Person {
    private String name;
    private String surname;
    private Integer age;
    private Address address;


//    public Person(){
//    }

    public Person(String name, String surname, Integer howOld, Address address) {
        this.name = name;
        this.surname = surname;
        this.age = howOld;
        this.address = address;
    }

    public String getName(){
      return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname(){
        return this.surname;
    }

    public void setSurname (String surname){
        this.surname = surname;
    }
    public Integer getAge (){
        return this.age;
    }

    public void setAge (Integer age){
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address1) {
        this.address = address1;
    }

    public String introduce() {
        return "my name is: " + this.name + " my surname is: " + this.surname;
    }

    @Override
    public String toString() {
        return "name: " + this.name +
                " surname: " + this.surname +
                " age: " + this.age +
                " address: " + address.toString();
    }
}
