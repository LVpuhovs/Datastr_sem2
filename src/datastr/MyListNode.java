package datastr;

public class MyListNode<Ttype> {
	//TODO
	// variables 
	private Ttype element;
	private MyListNode<Ttype> next = null;
	private MyListNode<Ttype> previous = null;
	
	//get and set
	public Ttype getElement() {
		return element;
	}
	public void setElement(Ttype element) {
		if (element != null)
			this.element = element;
		else
			this.element = (Ttype)new Object();
	}
	public MyListNode<Ttype> getNext() {
		return next;
	}
	public void setNext(MyListNode<Ttype> next) {
		this.next = next;
	}
	public MyListNode<Ttype> getPrevious() {
		return previous;
	}
	public void setPrevious(MyListNode<Ttype> previous) {
		this.previous = previous;
	}
	//constructors
	public MyListNode(Ttype element) {
		setElement(element);
	}
	//tostring
	public String toString() {
		return " " + element;
	}
}
