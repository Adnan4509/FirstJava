
public class Demo {
    public static void main(String[] args){
        int[] a = new int[5];
        a[4] = 34;
        for(int i=0; i<a.length; i++){        //for loop to print array element
            System.out.println(a[i]);
        }
        for (int i : a) {
            System.out.println(i);          //for each loop print array elements
        }
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

interface Mobile{
    void makeCall();
    
}

class SmartPhone implements Mobile{

   public void makeCall(){                        // cannot declare method without public keyword
        System.out.println("making call");
    }
}