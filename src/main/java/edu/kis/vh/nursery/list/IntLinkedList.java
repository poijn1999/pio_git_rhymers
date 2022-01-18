package edu.kis.vh.nursery.list;


class IntLinkedList { //5


	private static final int EMPTY = -1;
	Node last;
	int i;

	private Node last; //6
	private int i;
	
	int getI() {
		return i;
	}
	
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.setNext(new Node(i));
			last.getNext().setPrev(last);
			last = last.getNext();
		}
	}

	private boolean isEmpty() {//7
		return last == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
      return EMPTY;
		return last.getValue();
			

	}

	public int pop() {
		if (isEmpty())
			return EMPTY;
		int ret = last.getValue();
		last = last.getPrev();
    
		return ret;
	}

}
