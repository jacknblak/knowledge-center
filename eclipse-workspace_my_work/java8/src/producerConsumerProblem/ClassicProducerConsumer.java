package producerConsumerProblem;



public class ClassicProducerConsumer {

	/*
	 * There are two processes, a producer and a consumer, that share a common
	 * buffer with a limited size. The producer “produces” data and stores it in the
	 * buffer, and the consumer “consumes” the data, removing it from the buffer.
	 * Having two processes that run in parallel, we need to make sure that the
	 * producer will not put new data in the buffer when the buffer is full and the
	 * consumer won’t try to remove data from the buffer if the buffer is empty.
	 * 
	 * Problem statement copied from https://dzone.com/articles/the-evolution-of-producer-consumer-problem-in-java
	 */
	
	public static void main(String[] args) throws InterruptedException{
		Buffer buffer = new Buffer(2);
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		Thread producerThread = new Thread(() -> {
			try{
				producer.produce(buffer);
			} catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		});
		
		Thread consumerThread = new Thread(() -> {
			try{
				consumer.consume(buffer);
			}catch (InterruptedException interruptedException) {
				interruptedException.printStackTrace();
			}
		});
		
		producerThread.start();
		consumerThread.start();
		
		producerThread.join();
		consumerThread.join();
		
	}

}
