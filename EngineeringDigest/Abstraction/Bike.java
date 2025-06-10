package EngineeringDigest.Abstraction;

public class Bike extends Vehicle implements Engine {
    int engine_capacity = 0;
    int oil_capacity = 10;
    String Name = "";
    Bike(String Name , long price , int cc , int oil_capacity){
        this.Name = Name;
        this.price = price;
        this.distance_traveled = 0;
        this.engine_capacity = cc;
        this.oil_capacity = oil_capacity;
    }
    @Override
    void run() {
        System.out.println("I Am Running");
        this.distance_traveled += 10 ;
    }

    @Override
    void getprice() {
        System.out.println("The Price Of The Bike Is = " + this.price + " rs");
    }

    @Override
    void getdistance() {
        System.out.println("You Have Travel " + this.distance_traveled + " Km Yet");
    }

    @Override
    void Info() {
        System.out.println();
    }

    @Override
    public void eat() {
        System.out.println("Don't Eat While Driving");
    }

    @Override
    public int get_engine_capacity() {
        return this.engine_capacity;
    }

    public static void main(String[] args) {
        Bike b1 = new Bike("Honda H1",50000 , 30 , 23);
        b1.getprice();
        b1.run();
        b1.getdistance();

    }
}
