package EngineeringDigest.CollectionFramework.List.Stack;

import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {
        //Stack Extends Vector

        Stack<Integer> stack = new Stack<>();
        stack.push(1);

        stack.push(2);
        stack.push(3);
        stack.push(4);

        stack.pop();

        Integer removed_element = stack.pop();
        System.out.println(stack);
        Integer peekElement = stack.peek();
        System.out.println("The Peek element is = " + peekElement);
        System.out.println("Is Stack Empty : "+stack.isEmpty());
        System.out.println("Stack Size : "+stack.size());

        stack.add(1 , 10); //since stack extends vector we can use vector method
        System.out.println(stack);

        int searchElement = stack.search(10); //passing elements
        System.out.println("Searched Element Index : " + searchElement);


        //Using Linked List As Stack
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(10); // adding to the last
        linkedList.addLast(20); // adding to the last
        linkedList.addLast(30);
        linkedList.addLast(40);
        linkedList.addLast(50);

        linkedList.removeLast(); //removing the last element from the list
        linkedList.size(); //returns the size the list
        linkedList.isEmpty();

    }



}
