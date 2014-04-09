import java.util.*;
import java.io.*;

public class LinkIterator<E> implements Iterator<E>{
	private Node head;
	private Node at;

	public LinkIterator(Node head){
		head = head;
		at = head;
	}
	public boolean hasNext(){
		return !(at.getNext()==null);
	}
	public E next(){
		Node temp = at;
		at = at.getNext();
		return temp.getData();
	}
	public void remove(){
	}
}