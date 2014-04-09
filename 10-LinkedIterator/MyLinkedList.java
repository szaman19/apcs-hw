import java.util.*;
import java.io.*;

public class MyLinkedList<E> implements Iterable<E>{

    private Node head;

    public MyLinkedList() {
	head = null;
    }
    
    public void add(E d) {
	Node tmp = new Node(d);
	tmp.setNext(head);
	head=tmp;

    }
    public String toString() {
	String s= "";
	return s;
    }

    public LinkIterator Iterator(){
        return LinkIterator(head);
    }
}