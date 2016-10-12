package com.szjlxh.jlxh;

import io.goeasy.GoEasy;

public class goEasyDemo {

	public static void main(String[] args) {
		GoEasy goEasy =new GoEasy("29ab7c33-df22-4129-a800-d1540b0d2049");
		goEasy.publish("77993df8-bdc3-4fbe-b7b7-74526acc0302", "this is a test message!");
	}

}
