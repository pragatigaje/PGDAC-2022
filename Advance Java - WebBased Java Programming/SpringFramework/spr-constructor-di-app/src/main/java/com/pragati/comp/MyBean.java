package com.pragati.comp;

public class MyBean {
	private int msgId;
	private String msg;
	public MyBean() {
		super();
		System.out.println("Constructor called :");
	}
	public MyBean(int msgId, String msg) {
		System.out.println("Constructor called : int,string");
		this.msgId = msgId;
		this.msg = msg;
	}
	public int getMsgId() {
		return msgId;
	}
	public String getMsg() {
		return msg;
	}
	
}
