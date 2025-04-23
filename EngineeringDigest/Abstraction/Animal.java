package EngineeringDigest.Abstraction;

public abstract class Animal {
    protected Animal(){

    }
    public final double PI = 3.14 ;

    public abstract void sayHello();

    public abstract void sayBye();


    //Abstract class can contain concrete class
    public void sleep(){
        System.out.println("zzzzz");
    }
}
