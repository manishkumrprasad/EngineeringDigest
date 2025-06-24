package EngineeringDigest.CoreJava.Generics;

import EngineeringDigest.CoreJava.LambdaExpressions.Youtube.Printable;

public class MyNumber extends Number implements Printable {
    @Override
    public void print(String suffix) {
        System.out.println("I am printing");
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}
