package EngineeringDigest.CoreJava.MultiThreading.Synchronization;

public class Counter {
    public int count = 0;

    public  void increment() {
        synchronized(this){ //synchronized block
            this.count += 1; //this is critical section, a critical section is the part of the program which is being accessed  by multiple thread
        }
    }

    public int getCount(){
        return count ;
    }
}

//Mutual Exclusion is the condition where Only one thread/process can access the critical section at a time
//The Purpose Of Mutual Exclusion Is To prevent race conditions and data corruption

//exclusion means prevent