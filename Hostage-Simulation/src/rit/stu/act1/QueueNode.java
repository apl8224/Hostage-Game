/*
 * QueueNode.java
 */

package rit.stu.act1;
import rit.cs.Node;
import rit.cs.Queue;

/**
 * A queue implementation that uses a Node to represent the structure.
 * @param <T> The type of data the queue will hold
 * @author Sean Strout @ RIT CS
 * @author YOUR NAME HERE
 */
public class QueueNode<T> implements Queue<T> {
    /**
     * Create an empty queue.
     */
    private Node<T> front;
    private Node<T> back;

    public QueueNode() {
    }

    @Override
    public T back() {
        assert !empty();
        return back.getData();
    }

    @Override
    public T dequeue() {
        assert !empty();
        T temp = front.getData();
        if(front.equals(back)){
            back = null;
        }
        front = front.getNext();
        return temp;
    }

    @Override
    public boolean empty() {
        if(front == null){
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(T element) {
        Node<T> temp = new Node<T>(element, null);
        if (back != null) {
            back.setNext(temp);
            back = temp;
        } else{
            back = temp;
            front = temp;
        }
    }

    @Override
    public T front() {
        assert !empty();
        return front.getData();
    }
}
