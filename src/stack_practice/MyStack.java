package stack_practice;


import java.util.EmptyStackException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmerani
 */
public class MyStack<T> {
    private static class StackNode<T>{
        private T data;
        private StackNode<T> next;
    
     public StackNode(T data) {
           this.data = data;
      }
    }
    private StackNode<T> top;

    public T pop() {
        if (top == null) throw new EmptyStackException();
        T item = top.data;
        top = top.next;
        return item;
    }
    
    public void push(T item ){
        StackNode<T> t = new StackNode<T>(item);
    }
    
    public T peek() {
        if (top == null) throw new EmptyStackException();
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
}


