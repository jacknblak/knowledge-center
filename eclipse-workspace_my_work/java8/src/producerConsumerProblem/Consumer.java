package producerConsumerProblem;

public class Consumer {
	/*
	 * This class is to consume from buffer
	 */
	
	public void consume(Buffer buffer) throws InterruptedException{
		while(true) {
			synchronized (buffer) {
				while(buffer.getCommonList().size() ==0) {
					
					/*
					 * Let consumer wait for producer to produce there is nothing to consume
					 */
					buffer.wait();
				}
				int value = buffer.getCommonList().poll();
				System.out.println("Consumed value from buffer : "+value);
				buffer.notify();
				Thread.sleep(1000);
			}
		}
	}

}
