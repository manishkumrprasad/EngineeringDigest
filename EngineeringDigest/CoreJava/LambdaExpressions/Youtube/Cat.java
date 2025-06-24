package EngineeringDigest.CoreJava.LambdaExpressions.Youtube;

public class Cat implements Printable {

    String name ;
    public int age;

    @Override
    public void print(String suffix) {
        System.out.println("Meow" + suffix);
    }
}
