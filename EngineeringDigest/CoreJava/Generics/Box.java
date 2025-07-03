package EngineeringDigest.CoreJava.Generics;

public class Box<T> {
    //Box class will Work according to the parameter passed
        private T value;

        public T getValue(){
            return value;
        }

        public void setValue(T value){
            this.value = value;
        }
}
/*

bounded type parameter applied here

only those Data type can be passed as generic parameter which extends Number class for ex - float,int , integer ,double
public class Box<T extends Number> {
    //Box class will Work according to the parameter passed
    private T value;


    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }
}
*/