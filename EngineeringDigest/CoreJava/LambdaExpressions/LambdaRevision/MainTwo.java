package EngineeringDigest.CoreJava.LambdaExpressions.LambdaRevision;

public class MainTwo {


    static int a =10 ;


    public static void doSomething() {
//        int a = 10;
        Employee e1 = () -> {
            //a = 21; //giving error : variable used in lambda expression should be final or effectively final
            //To remove this error we have to simply declare the variable outside the method

            a  = 19;
            return "20,000";
        };
    }



}
//
//✅ Let’s understand **local variables in lambda expressions**, when they’re needed, and why it’s important to learn them clearly.
//
//        ---
//
//        ## 💡 **What is a local variable in a lambda?**
//
//When you write a lambda expression in Java, you can **access variables defined outside the lambda**, such as local variables from the enclosing method.
//
//Example:
//
//        ```java
//public class Test {
//    public static void main(String[] args) {
//        String greeting = "Hello";
//
//        Runnable r = () -> {
//            System.out.println(greeting);
//        };
//
//        r.run();
//    }
//}
//```
//
//Here, `greeting` is a **local variable** used inside the lambda expression.
//
//---
//
//        ## ⚡ **What is the rule? (Effectively final)**
//
//        ✔️ **Java requires that local variables used inside a lambda must be *effectively final*.**
//
//This means:
//
//        * The variable is **not reassigned after its first assignment**.
//        * Even if you don’t explicitly mark it `final`, it should behave as if it is final.
//
//Example:
//
//        ```java
//String msg = "Hi";
//msg = "Hello"; // ❌ Now `msg` is not effectively final, so you cannot use it inside lambda
//
//Runnable r = () -> {
//    System.out.println(msg); // Compilation error
//};
//```
//
//        ---
//
//        ## 💡 **Why this restriction exists?**
//
//        1️⃣ **Captured by value**:
//When a lambda captures a local variable, it **copies its value**, it does not capture a reference like instance fields.
//
//2️⃣ **Memory safety**:
//Local variables live on the stack and disappear after the method exits. If lambda could freely capture them and modify them, it would cause undefined behavior or errors.
//
//3️⃣ **Thread safety**:
//Restricting to final or effectively final variables makes it easier to reason about code and avoid race conditions when lambdas run in separate threads.
//
//        ---
//
//        ## 🟢 **When is it needed?**
//
//You need local variables in lambdas when:
//
//        * You want to pass some local state or context into the lambda.
//        * You want to reuse local data inside a callback or functional operation (e.g., `forEach`, `map`).
//
//Example in streams:
//
//        ```java
//String suffix = "!";
//List<String> names = List.of("Alice", "Bob");
//names.forEach(name -> System.out.println(name + suffix));
//        ```
//
//Here, `suffix` is used inside the lambda and must be effectively final.
//
//        ---
//
//        ## 💪 **Why learn this concept?**
//
//        ✅ Writing clean, correct lambda code.
//        ✅ Avoiding common compilation errors ("variable must be final or effectively final").
//        ✅ Understanding closures and variable scope in modern Java.
//        ✅ Using lambdas confidently in streams, event listeners, asynchronous tasks, etc.
//
//---
//
//        ## 💬 **Summary**
//
//        * ✔ Local variables used in lambdas **must be effectively final**.
//        * ✔ This is needed for safety and simplicity.
//* ✔ Important for using lambdas in modern Java features (Streams, concurrency, callbacks).
//
//        ---
//
//If you'd like, I can also draw a diagram showing how variables are captured, or show an example of incorrect usage that causes an error. Want me to? 🌟

