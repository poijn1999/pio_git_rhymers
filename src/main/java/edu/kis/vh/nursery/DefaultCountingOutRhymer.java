package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

	private static final int FULL = 11;
  
  private static final int COUNTER = -1;

	private int total = COUNTER; //1

	public int getTotal() {
		return total;
	}

	private static final int SIZE = 12;

	private final int[] numbers = new int[SIZE];

	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	public boolean callCheck() {
		return total == COUNTER;
	}

	public boolean isFull() {
		return total == FULL;
	}

	int peekaboo() { //2
		if (callCheck())
			return COUNTER;
		return numbers[total];
	}

	public int countOut() {
		if (callCheck())
			return COUNTER;
		return numbers[total--];
	}

}
