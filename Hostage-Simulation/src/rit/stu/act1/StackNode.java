/*
 * StackNode.java
 */

package rit.stu.act1;

import rit.cs.Node;
import rit.cs.Stack;

/**
 * A stack implementation that uses a Node to represent the structure.
 * @param <T> The type of data the stack will hold
 * @author Sean Strout @ RIT CS
 * @author Alex Laureyns
 */
public class StackNode<T> implements Stack<T> {

    /**
     * Create an empty stack.
     */
    private Node<T> top;

    public StackNode(){
    }

    @Override
    public boolean empty() {
        if (this.top == null){
            return true;
        };
        return false;
    }

    @Override
    public T pop() {
        assert !empty();
        T temp = top.getData();
        top = top.getNext();
        return temp;
    }

    @Override
    public void push(T element) {
        top = new Node<T>(element, top);
    }

    @Override
    public T top() {
        assert !empty();
        return top.getData();
    }
}
