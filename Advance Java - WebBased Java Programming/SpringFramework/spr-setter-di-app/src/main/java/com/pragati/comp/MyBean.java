package com.pragati.comp;

public class MyBean {
	private int msgId;
	private String msg;
	public int getMsgId() {
		return msgId;
	}
	public void setMsgId(int msgId) {
		System.out.println("setMsgId() called");		
		this.msgId = msgId;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		System.out.println("setMsg() called");		
		this.msg = msg;
	}
	
	
	
	
}
