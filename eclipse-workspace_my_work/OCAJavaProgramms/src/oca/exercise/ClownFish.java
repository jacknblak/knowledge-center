package oca.exercise;

public final class ClownFish extends Fish {
	public final ClownFish getFish() {
		throw new RuntimeException("Clown Fish");
	}
	public static void main(String[] args) throws BubbleException {
		final Fish f=  new ClownFish();
		f.getFish();
		
	}
	

}
