package EngineeringDigest.CoreJava.LambdaExpressions.Youtube;

interface MathOperation {

        int operate(int a, int b);

        MathOperation add = (a, b) -> a + b;
//        System.out.println(add.operate(10,20));


}
