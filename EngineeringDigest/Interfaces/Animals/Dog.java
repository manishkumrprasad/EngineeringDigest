package EngineeringDigest.Interfaces.Animals;

public class Dog implements Animal{
    @Override
    public void sayHello() {
        System.out.println("The Dog Says Hello");
    }

    public void sayBye(){
        System.out.println("The Dog Is Saying Bye");
    }

    public static void main(String[] args) {
        //interface class can act as an object reference
        Animal d1 = new Dog();

        d1.sayHello();
        System.out.println("The Age Of The Dog Is = "+ Animal.age);
        Animal.info();
        d1.run();
        //d1.sayBye(); error animal reference object cannot access unoverride methods
    }
}
