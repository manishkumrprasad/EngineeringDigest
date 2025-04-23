package EngineeringDigest.Abstraction;

public class Dog extends Animal{
    @Override
    public void sayHello() {
        System.out.println("Hello From Dog");
    }

    @Override
    public void sayBye() {
        System.out.println("Bye From Dog");
    }

    public void eat(){
        System.out.println("The Dog is eating");
    }

    public static void main(String[] args) {

        //Animal a1 = new Animal(); abstract class can not be instantiated
        //the reason why we are not able to create animal instance because methods in animal class is not fully defined
        Dog d1 = new Dog();
        d1.sayBye();

        Animal d2 = new Dog();
        // d2.eat(); // eat method is not defined in animal class thats why giving an error
    }
}
