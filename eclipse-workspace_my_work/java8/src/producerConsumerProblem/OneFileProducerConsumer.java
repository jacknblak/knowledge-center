package producerConsumerProblem;

import java.util.LinkedList;
import java.util.Queue;

public class OneFileProducerConsumer {
	/*
	 * This class is to implement producer consumer in single file with all class
	 * and methods in one file
	 */
	public static void main(String[] args) throws InterruptedException{
		Buffer buffer = new Buffer(5);
		Thread producerThread = new Thread(() ->{
			try{
				buffer.produce();
			}catch(InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {
			try {
				buffer.consume();
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		});
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
		

	}

	static class Buffer {
		int queueSize;
		/*
		 * Above variable is to determine size
		 */

		Queue<Integer> bufferQueue;
		/*
		 * Above queue is used by both producer and consumer
		 */

		public Buffer(int size) {
			this.bufferQueue = new LinkedList<Integer>();
			this.queueSize = size;
		}

		/**
		 * This method is to produce value in buffer
		 * 
		 * @throws InterruptedException
		 */
		public void produce() throws InterruptedException {
			int value = 0;
			while (true) {
				synchronized (this) {
					while (bufferQueue.size() >= queueSize) {
						/*
						 * Let this wait for consumer to consume from buffer
						 */
						wait();
					}
					bufferQueue.add(value);
					System.out.println("Adding value to buffer : " + value);
					value++;
					/*
					 * Once value is added to queue then notify consumer about update
					 */
					notify();
					Thread.sleep(1000);
				}
			}
		}

		/**
		 * This method will consume from common buffer
		 * 
		 * @throws InterruptedException
		 */
		public void consume() throws InterruptedException {
			while (true) {
				synchronized (this) {
					while (bufferQueue.size() == 0) {
						/*
						 * Consumer needs to wait for producer to produce if queue is empty
						 */
						wait();
					}
					int value = bufferQueue.poll();
					System.out.println("Consumed value : "+value);
					notify();
					Thread.sleep(1000);
				}
			}
		}
	}

}
