package java8.streams;

import java.util.stream.IntStream;

public class Stream_1 {
	public static void main(String[] args) {
		IntStream
		.range(1, 10)
		.forEach (System.out :: print);
		System.out.println();
	}

}
