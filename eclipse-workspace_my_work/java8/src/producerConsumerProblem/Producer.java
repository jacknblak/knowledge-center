package producerConsumerProblem;

import java.util.LinkedList;

public class Producer {

	/*
	 * This class will produce elements to shared queue
	 */

	/**
	 * This method takes Buffer as input and keeps adding value to it and consumer
	 * object to wait and notify
	 * 
	 * @param buffer
	 */
	public void produce(Buffer buffer) throws InterruptedException {
		int value = 0;
		while (true) {
			synchronized (buffer) {
				while (buffer.getCommonList().size() >= buffer.getCommonListSize()) {
					/*
					 * Thread will wait for consumer to consume from buffer
					 */
					buffer.wait();
				}
				/*
				 * If buffer has some space then add value to buffer
				 */
				buffer.getCommonList().add(value);
				System.out.println("Value added to buffer : " + value);
				value++;
				/*
				 * Once you have added value notify consumer that value is added
				 */
				buffer.notify();
				Thread.sleep(1000);
			}
		}
	}

}
