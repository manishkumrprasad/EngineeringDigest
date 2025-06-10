package EngineeringDigest.Abstraction;

public interface Engine {
    //int engine_capacity = 0;
    //int oil_capacity = 10;

//    default int get_engine_capacity() {
//        return 0;
//    }

    void eat();
    int get_engine_capacity();
}
