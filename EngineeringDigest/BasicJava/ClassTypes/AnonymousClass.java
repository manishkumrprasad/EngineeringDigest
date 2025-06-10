package EngineeringDigest.BasicJava.ClassTypes;

class A{
    void show(){
        System.out.println("Hello I Am A");
    }
    void show2(){
        System.out.println("A");
    }
}

class B extends A{
    @Override
    void show() {
        System.out.println("Hello I Am B");
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        A obj = new A();
        //A is a class or interface – It’s the reference type.
        obj.show(); //print the statement written inside the class A

        A obj2 = new B();
        //B is a subclass of A – That means B extends A or implements A if A is an interface
        //obj2 is a reference variable of type A, but it actually refers to an instance of B.

        A obj3 = new A(){
            @Override
            void show() {
                System.out.println("This Time I Am Different A");
            }
            //In this case we are trying to change the statement of the show method
        };
        obj3.show();

        A obj4 = new B(){
            @Override
            void show() {
                System.out.println("This Time I Am Different B");
            }
        };
        obj4.show();

        A obj5 = new A(){
            void show2() {
                System.out.println("This Time I Am Different A");
            }
        };
        obj5.show2();

    }

}
//NOTE
//A obj = new B(); is legal if B is a subclass or implements A.


