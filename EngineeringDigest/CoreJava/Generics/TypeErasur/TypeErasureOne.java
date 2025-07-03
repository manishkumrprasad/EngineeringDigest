package EngineeringDigest.CoreJava.Generics.TypeErasur;

public class TypeErasureOne <T> {
    T obj ;

    void setObj(T value){
        this.obj = value;
    }

    public T getObj(){
        return this.obj ;
    }

    public static void main(String[] args) {
        TypeErasureOne<Integer> t1 = new TypeErasureOne<>();
        //Now The TypeErasur will operatte for Integre data type


        t1.setObj(1000);
        System.out.println(t1.getObj());


    }


}

//For Integer Data type
//
//public class TypeErasureOne <Integer> {
//    Integer obj ;
//
//    void setObj(Integer value){
//        this.obj = value;
//    }
//
//    public Integer getObj(){
//        return this.obj ;
//    }
//
//
//"""


