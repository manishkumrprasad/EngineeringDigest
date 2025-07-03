package EngineeringDigest.CoreJava.ObjectClass;

public class DemoOne {

    String Name = null ;
    int age = 0 ;

    @Override
    public String toString() {

        return Name + " : " +  age ;

    }
    //toString method is called when you try to print with the Instance Name

    public static void main(String[] args) {
        DemoOne d1 = new DemoOne();

        d1.Name = "Manish";
        d1.age = 10 ;

        DemoOne d2 = new DemoOne();
        d2.Name = "Karan";
        d2.age = 20 ;

        boolean result = d1 == d2 ;

        
        System.out.println(d1.Name);
        System.out.println(d1);


    }






}
