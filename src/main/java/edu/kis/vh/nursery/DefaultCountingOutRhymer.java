package edu.kis.vh.nursery;

/**default counting out rhymer
 * @author Maciek
 * Klasa służy do grania w gry wyliczankowe
 */

public class DefaultCountingOutRhymer {

	private static final int FULL = 11;
  
  private static final int COUNTER = -1;

	private int total = COUNTER; //1

	public int getTotal() {
		return total;
	}

	private static final int SIZE = 12;


	private final int[] numbers = new int[SIZE];


	public int total = COUNTER;
	/**countIN
	 * @author Maciek
	 *Funkcja sprawdza czy tablica jest pełna, jezeli nie, to wpisuje wartość IN do tablicy
	 */
	public void countIn(int in) {
		if (!isFull())
			numbers[++total] = in;
	}

	/**
	 * @author Maciek
	 * Funkcja wywołuje sprawdzenie tablicy
	 */
	public boolean callCheck() {
		return total == COUNTER;
	}

	/**
	 * @author Maciek
	 * Funkcja sprawdza czy tablica jest pełna
	 */
	public boolean isFull() {
		return total == FULL;
	}

	/**
	 * @author Maciek
	 * Funkcja zwraca elementy z tablicy
	 */
	protected int peekaboo() {

		if (callCheck())
			return COUNTER;
		return numbers[total];
	}
	/**
	 * @author Maciek
	 * Funkcja zwraca poprzedni element tablicy
	 */
	public int countOut() {
		if (callCheck())
			return COUNTER;
		return numbers[total--];
	}

}
