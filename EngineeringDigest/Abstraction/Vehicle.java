package EngineeringDigest.Abstraction;

abstract class Vehicle {

    long price;
    long distance_traveled;

    abstract void run();
    abstract void getprice();
    abstract void getdistance();
    //final abstract void stop(); //final along with abstract keyword are not allowed together

    abstract void Info();
}
