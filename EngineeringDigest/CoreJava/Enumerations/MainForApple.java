package EngineeringDigest.CoreJava.Enumerations;

public class MainForApple {

    public static void main(String[] args) {
        Apple ap ;


        //So I want to extract the price of a2 apple
        System.out.println("The price Of a2 apple is = "+ Apple.A2.getPrice());


        //so now I want to change the price of A2 apple
        Apple.A2.setPrice(100);
        System.out.println("Now The price Of A2 apple is = "+ Apple.A2.getPrice());

        //To Display all apples variety along with their price

        for(Apple a : Apple.values()){
            System.out.println("Variety Name = " + a + " Price = " + a.getPrice() + "rs Per Kg");
        }


    }
}
