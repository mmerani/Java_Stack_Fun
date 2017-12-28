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
public class StackWithMin extends Stack<NodeWithMin> {
    public void push(int value) {
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }
    
    public int min() {
        if(this.isEmpty()){
            return Integer.MAX_VALUE; //error value
        } else {
            return peek().min;
        }
    }
}

class NodeWithMin {
    public int value;
    public int min;
    public NodeWithMin(int v, int min){
        value = v;
        this.min = min;
    }
}