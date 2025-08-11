
public class Demo {
    public static void main(String[] args) {
        Dog dog = new Dog("black");
        dog.speed = 110;

        System.out.println(dog.speed);
        System.out.println();
    }
}

abstract class Animal {
    abstract void sayHello();

    abstract void sayBye();

    void sleep() {
        System.out.println("ghur");
    }
}

class Dog extends Animal {
    private String colour;
    int speed;

    public Dog(String colour){                  //here we are using a constructor to access private value for once
        this.colour = colour;
    }

    void sayHello() {
        System.out.println("woof");
    }

    void sayBye() {
        System.out.println("Hoof");
    }
}

interface Mobile {
    static final int batteries = 2;             // we should not be able to use "static" and "final" keywords
    void makeCall();


}
interface MusicPlayer {
    void playMusic();
    
}

class SmartPhone implements Mobile, MusicPlayer {

    public void makeCall() { // cannot declare method without public keyword
        System.out.println("making call");
    }

    @Override
    public void playMusic() {
        System.out.println( "playing music");
    }
}