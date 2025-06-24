package EngineeringDigest.CoreJava.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InterruptedException {
        Cat c1 = new Cat();
        for(Method method : c1.getClass().getDeclaredMethods()){
            if(method.isAnnotationPresent(RunImmediately.class)){
                //System.out.println("Invoking The Annotated Method");

                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0 ; i < annotation.times() ; i++){
                    method.invoke(c1);

                }
            }else{
                System.out.println("Didn't Get The Annotated Method");
            }
        }

    }


}
