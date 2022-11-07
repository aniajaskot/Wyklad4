public class PersonTester {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.show();

        Person person2 = new Person("Jan", "Nowak");
        person2.show();

        Person person3 = new Person("Karol", 20);
        person3.show();

        Person person4 = new Person("Jan", "Kowalski", "Wrocław", 23);
        person4.show();
    }
}
