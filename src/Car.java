public class Car {
    String name;
    int currentSpeed;
    int power;

    Car(String n, int cs, int p){
        name = n;
        currentSpeed = cs;
        power = p;
    }

    public void turbo(){
        power = (int)(power*1.1);
    }

    public void increaseSpeed(int speed){
        currentSpeed += speed;
    }

    public void decreaseSpeed(int speed){
        currentSpeed -= speed;
    }

    void show(){
        System.out.println(name + " " + power + " " + currentSpeed);
    }
}
