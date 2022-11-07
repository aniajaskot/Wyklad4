public class TimeTest {
    public static void main(String[] args) {
        Person person1= new Person("John", "Kowalski", "Wrocław", 20);
        TimeMachine timeMachine = new TimeMachine();
        timeMachine.timeTravel(person1, 5);
        person1.show(); //25
        timeMachine.backInTime(person1);
        person1.show();
        timeMachine.backInTime(person1);
        timeMachine.backInTime(person1);
        timeMachine.backInTime(person1);
        timeMachine.backInTime(person1);

        person1.show();
    }
}
