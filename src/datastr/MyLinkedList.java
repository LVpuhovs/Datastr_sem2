package datastr;

import java.util.EmptyStackException;

public class MyLinkedList<Ttype> {
	private MyListNode<Ttype> first = null;
	private MyListNode<Ttype> last = null;
	private int counter = 0;
	
	//pec noklusejuma jau ir beznosacijuma konstruktors  -> MyLinkedList()
	
	public boolean IsEmpty() {
		return (counter == 0);
	}
	public int howManyElements() {
		return counter;
	}
	
	public void add(Ttype element) throws Exception {
		if (element == null) throw new Exception("Problems with element");
		if (IsEmpty()) {
			MyListNode newNode = new MyListNode(element);
			first = newNode;
			last = newNode;
		}
		else {
			MyListNode newNode = new MyListNode(element);
			newNode.setPrevious(last);
			last.setNext(newNode);
			last = newNode;
			counter++;
		}
	}
	
	public void print() throws Exception {
		if ( IsEmpty()) throw new Exception("List is empty");
		
		MyListNode temp = first;
		
		for (int i = 0; i < counter; i++) {
			System.out.print(temp+ " ");
			temp = temp.getNext();
		}
		System.out.println();
	}
}
