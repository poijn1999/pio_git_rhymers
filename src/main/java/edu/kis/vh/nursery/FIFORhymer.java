package edu.kis.vh.nursery;

public class FIFORhymer extends DefaultCountingOutRhymer {


	private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer(); //3


	@Override
	public int countOut() {
		while (!callCheck())

			temp.countIn(super.countOut());

		int ret = temp.countOut();

		while (!temp.callCheck())

			countIn(temp.countOut());

		return ret;
	}
}
