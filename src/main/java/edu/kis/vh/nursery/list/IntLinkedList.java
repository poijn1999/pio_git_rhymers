package edu.kis.vh.nursery.list;

class IntLinkedList { //5

	private Node last; //6
	int i;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
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
			return -1;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return -1;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
