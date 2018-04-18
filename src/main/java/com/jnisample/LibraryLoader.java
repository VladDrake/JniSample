package com.jnisample;

import org.scijava.nativelib.NativeLoader;

public class LibraryLoader {

	public static void loadLibrary(String name) {
		System.setProperty("java.library.tmpdir", System.getProperty("java.io.tmpdir"));
		try {
			NativeLoader.loadLibrary(name);
		} catch (Exception e) {
			System.loadLibrary(name);
		}
	}
}
