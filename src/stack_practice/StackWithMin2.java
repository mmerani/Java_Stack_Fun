/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stack_practice;

import java.util.Stack;

/**
 *
 * @author michaelmerani
 */
public class StackWithMin2 extends Stack<Integer> {
    Stack<Integer> storageStack;
    
    public StackWithMin2() {
        storageStack = new Stack<Integer>();
    }
    
    public void push(int value) {
        if(value <= min()){
            storageStack.push(value);
        }
        super.push(value);
    }
    
    public Integer pop(){
        int value = super.pop();
        if (value == min()){
            storageStack.pop();
        }
        return value;
    }
    
    public int min(){
        if(storageStack.isEmpty()){
            return Integer.MAX_VALUE;
        } else {
            return storageStack.peek();
        }
    }
}
