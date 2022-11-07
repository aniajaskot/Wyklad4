public class Person {
    String firstName;
    String lastName;
    String city;
    int age;

//    Person(String fn, String ln, String c, int a){
//        firstName = fn;
//        lastName = ln;
//        city = c;
//        age = a;
//    }

    public Person(String firstName, String lastName, String city, int age) {
//        this.firstName = firstName;
//        this.lastName = lastName;
        this(firstName, lastName);
        this.city = city;
        this.age = age;
    }

    //
//    Person(String fn, int a){
//        firstName = fn;
//        age = a;
//    }
    Person(String firstName, int age){
        this.firstName = firstName;
        this.age = age;
    }

//
//    Person(String fn, String ln){
//        firstName = fn;
//        lastName = ln;
//    }
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    Person(){

    }


    void show(){
        System.out.println(firstName + " " + lastName + " " + age + " " + city);
    }
}
