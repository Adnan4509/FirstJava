
public class Demo {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.sayBye();
        dog.sayHello();
    }
} 

abstract class Animal{
   abstract void sayHello();
   abstract void sayBye();

   void sleep(){
    System.out.println("ghur");
   }
}


class Dog extends Animal {
    
    void sayHello(){
        System.out.println("woof");
    }

    void sayBye(){
        System.out.println("Hoof");
    }
}