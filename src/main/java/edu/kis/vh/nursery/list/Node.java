package edu.kis.vh.nursery.list;

public class Node {


	private int value;
	private Node prev;
	private Node next;

	public int getValue() {
		return value;
	}
	
	public Node getPrev() {
		return prev;
	}

	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public Node(int i) {
		value = i;
	}
}

//Uzywanie kombinacji alt+strzałki przełączają między otwartymi plikami w ECLIPSE IDE