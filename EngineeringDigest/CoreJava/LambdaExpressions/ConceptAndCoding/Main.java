package EngineeringDigest.CoreJava.LambdaExpressions.ConceptAndCoding;

public class Main{


    public static void main(String[] args) {


        //This Is Called Anonymous Class
        Cat c1 = new Cat() {
            @Override
            public void introduce() {
                System.out.println("Hello My Name Is xyz And my age is 8");
            }
        };

        c1.introduce();

        //Using Lambda Expression
        Cat c2 = () -> { System.out.println("Hello My Name is abc and my age is 09");};
        //by using lambda expression the code gets more compact when makes  it look good then previous

        c2.introduce();

        Cat c3 = () -> {
            System.out.println("Hello I am the 3rd cat, and my name is yushi and i live with the brother");
            System.out.println("Only This Thing I want to introduce about myself");
        };


        c3.introduce();

        System.out.println("-------------------------------------------------------------------");

        CatPara cp1 = (String name) -> {
            System.out.println("Hello My Name Is = " + name +" My age Is xyz ");
        };

        
        cp1.speak("yusuf");


    }


}
