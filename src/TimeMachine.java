public class TimeMachine {
    void backInTime(Person person){
        person.age -= 1;
    }

    void timeTravel(Person person, int year){
        person.age += year;
    }
}
