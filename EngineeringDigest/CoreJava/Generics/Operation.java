package EngineeringDigest.CoreJava.Generics;

public enum Operation {
    ADD , SUBTRACT, MULTIPLY , DIVIDE ;



//    <T> Operation(T n1 , T n2){
//        System.out.println("check check");
//
//    }



    public <T extends Number> double apply(T n1, T n2){

      //

        switch (this){
            case ADD:
                return n1.doubleValue() + n2.doubleValue();
            case SUBTRACT:
                return n1.doubleValue() - n2.doubleValue();
            case DIVIDE:
                return n1.doubleValue() / n2.doubleValue();
            case MULTIPLY:
                return n1.doubleValue() * n2.doubleValue();

        }
        return 0;
    }

    public static void main(String[] args) {

        System.out.println(Operation.ADD.apply(10,20));

    }

}

