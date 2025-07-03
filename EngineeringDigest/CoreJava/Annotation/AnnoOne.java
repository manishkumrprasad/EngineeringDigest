package EngineeringDigest.CoreJava.Annotation;

@VeryImportant
public class AnnoOne {

    @Deprecated
    void fun(){
        System.out.println("Hello World");
    }

    //@VeryImportant //giving error as because this annotation is not applicable to methods

    void name(){
        System.out.println("My Name Is Manish Kumar Prasad");
    }


    public static void main(String[] args) {
        AnnoOne a1 = new AnnoOne();
        a1.fun();
        AnnoOne a2 = new AnnoOne();
        //a2. //fun method is no more because it has been deprecated by the deprecated keyword

        @SuppressWarnings("unused")
        int num = 10; //suppressing the unused variable

        System.out.println("Do You Even Know My Name");
//        System.out.println(num);

        //Use annotation right before the code which you want to annotate
        Cat myCat = new Cat();
        if(myCat.getClass().isAnnotationPresent(VeryImportant.class)){
            System.out.println("This Annotation Is Present For This Class");
        }else{
            System.out.println("This Annotation Is Not Present For This Class");
        }

    }
}



