package com.stringbuffer;

public class BufferCapacity {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		System.out.println("Initial capacity of String Buffer is: " + sb.capacity()); // Initial capacity of
																						// StringBuffer is 16 characters
		sb.append("Hola Hola ! Guys Lets have a party");
		System.out.println(sb.capacity());// automatically StringBuffer increases the capacity
	}

}
