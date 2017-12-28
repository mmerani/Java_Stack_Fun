package stack_practice;

import java.util.NoSuchElementException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author michaelmerani
 */
public class MyQueue<T> {
    private static class QueueNode<T>{
        private T data;
        private QueueNode<T> next;
        
        public QueueNode(T data) {
            this.data = data;
        }
    }
    
    private QueueNode<T> first;
    private QueueNode<T> last;
    
    public void add(T item) {
        QueueNode<T> t = new QueueNode<T>(item);
        if(last != null) {
            last.next = t;
        }
        last = t;
        if (first == null){
            first = last;
        }
    }
    
    public T remove() {
        if(first == null) throw new NoSuchElementException();
        T data = first.data;
        first = first.next;
        if (first == null) {
            last = null;
        }
        return data;
    }
    
    public T peek() {
        if(first == null) throw new NoSuchElementException();
        return first.data;
    }
    
    public boolean isEmpty() {
        return first == null;
    }
}
