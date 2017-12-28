/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_practice;

/**
 *
 * @author michaelmerani
 */
public class Stack_Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack newStack = new MyStack();
        newStack.push(5);
        newStack.push(6);
        newStack.push(3);
        newStack.push(9);
      
        
        StackWithMin minStack = new StackWithMin();
        minStack.push(5);
        System.out.println("Minimum of Stack is " + minStack.min());
        minStack.push(6);
        System.out.println("Minimum of Stack is " + minStack.min());
        minStack.push(3);
        System.out.println("Minimum of Stack is " + minStack.min());
        minStack.push(7);
        System.out.println("Minimum of Stack is " + minStack.min());
        minStack.pop();
        System.out.println("Minimum of Stack is " + minStack.min());
        minStack.pop();
        System.out.println("Minimum of Stack is " + minStack.min());
        System.out.println();
        StackWithMin2 minStack2 = new StackWithMin2();
        minStack2.push(5);
        System.out.println("Minimum of Stack is " + minStack2.min());
        minStack2.push(6);
        System.out.println("Minimum of Stack is " + minStack2.min());
        minStack2.push(3);
        System.out.println("Minimum of Stack is " + minStack2.min());
        minStack2.push(7);
        System.out.println("Minimum of Stack is " + minStack2.min());
        minStack2.pop();
        System.out.println("Minimum of Stack is " + minStack2.min());
        minStack2.pop();
        System.out.println("Minimum of Stack is " + minStack2.min());
    }
    
}


