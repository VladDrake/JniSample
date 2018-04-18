package com.jnisample;

public class Main {

	static {
		LibraryLoader.loadLibrary("JniSample");
	}

	public static native String sayHello();

	public static void main(String[] args) {
		System.out.println(sayHello());
	}
}
