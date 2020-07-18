package gr.codehub.JavaExercise1;

import java.util.ArrayList;


public class MyStack {

    public MyStack() {
        this.myStack = myStack;
    }

    private ArrayList myStack = new ArrayList();

    public void push(Object obj) {
        myStack.add(obj);
    }

    public Object pop() {
        if (myStack.isEmpty())
        System.out.println("The stack is empty!");
        return  myStack.remove(myStack.size()-1);
    }

    public boolean isEmpty() {

        return myStack.isEmpty();
    }
    public static void main(String[] args) {
MyStack ms= new MyStack();
        ms.push(4);
        ms.push(5);
        ms.push(7);
        ms.push(9);
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());
        System.out.println(ms.pop());




    }
}