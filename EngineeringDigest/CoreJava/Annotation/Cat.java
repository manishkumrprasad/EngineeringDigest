package EngineeringDigest.CoreJava.Annotation;


@VeryImportant
public class Cat{
    void meow(){
        System.out.println("Meow Meow");
    }

    @RunImmediately(times = 3)
    void eat(){
        System.out.println("Eating....");
    }
}