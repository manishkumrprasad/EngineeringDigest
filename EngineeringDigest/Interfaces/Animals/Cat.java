package EngineeringDigest.Interfaces.Animals;

public class Cat implements Animal{
    @Override
    public void sayHello() {

    }

    @Override
    public void run() {
        Animal.super.run();
    }
}
