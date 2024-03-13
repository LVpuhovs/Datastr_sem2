package datastr;

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
}
