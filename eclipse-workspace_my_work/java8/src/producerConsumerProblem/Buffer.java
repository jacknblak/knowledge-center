package producerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {

	private Queue<Integer> commonList;
	/*
	 * Above list is commonly used by both producer and consumer
	 */

	private int commonListSize;

	/**
	 * Constructor takes size of Buffer and sets size for list
	 * 
	 * @param size
	 */
	public Buffer(int size) {
		this.setCommonListSize(size);
		this.setCommonList(new LinkedList<Integer>());
	}

	public Queue<Integer> getCommonList() {
		return commonList;
	}

	public void setCommonList(Queue<Integer> commonList) {
		this.commonList = commonList;
	}

	public int getCommonListSize() {
		return commonListSize;
	}

	public void setCommonListSize(int commonListSize) {
		this.commonListSize = commonListSize;
	}

}
