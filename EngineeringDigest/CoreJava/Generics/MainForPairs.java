package EngineeringDigest.CoreJava.Generics;

public class MainForPairs {
    public static void main(String[] args) {
        Pair<Integer , String> p1 = new Pair<>();
        Pair<String , String> p2 = new Pair<>();
        Pair<String , Integer> p3 = new Pair<>();

        p1.setKey(1);
        p1.setValue("One");

        int i = p1.getKey();
        String str = p1.getValue();




    }
}
