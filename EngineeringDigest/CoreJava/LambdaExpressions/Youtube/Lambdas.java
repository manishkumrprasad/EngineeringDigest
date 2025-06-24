package EngineeringDigest.CoreJava.LambdaExpressions.Youtube;

public class Lambdas {

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Dog myDog = new Dog();
//        myCat.print();
//        printThing(myCat); //this is long process other way to do the same thing using lambda

//        printThing(
//            () -> {
//            System.out.println("Meow for the 2nd time");
//            }
//        );

        //More Simplified From
        //printThing(() -> System.out.println("Meow for the 3rd time"));

        //Other Technique
        Printable meowPrint = (s) -> System.out.println("Meow For The 4th Time" + s);

        //System.out.println(meowPrint.print("Hello"));
    }

    static void printThing(Printable thing){
        thing.print(" ! "); //here we will give the argument
    }


}
