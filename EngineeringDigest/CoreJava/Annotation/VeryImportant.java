package EngineeringDigest.CoreJava.Annotation;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//specifying the target is important as it target only to the specified field
@Target(ElementType.TYPE) //if you want to target the method, variable etc then you can leave this
@Retention(RetentionPolicy.RUNTIME)
public @interface VeryImportant {
}
