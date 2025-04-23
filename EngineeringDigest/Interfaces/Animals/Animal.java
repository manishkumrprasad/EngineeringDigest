package EngineeringDigest.Interfaces.Animals;

public interface Animal {

    //variable in interface must be initialized, variables in interfaces are implicitly declared as public,static and final
    final static String Name = "Puppy";
    public final static int age = 12;


    //return-type method-name();
    void sayHello();

    //We can define static methods in interface class

    public static void info(){
        System.out.println("I Am Animal");
    }

    //this method doesn't require implementation and can directly accessible through class object
    public default void run(){
        this.sayHello(); //accessing other methods using this keyword
        System.out.println("Animal Is Running");
    }
}
