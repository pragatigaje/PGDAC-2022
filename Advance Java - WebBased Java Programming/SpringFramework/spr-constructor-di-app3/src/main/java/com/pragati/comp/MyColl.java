package com.pragati.comp;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class MyColl {
	private String myArr[];
	private List<String> myList;
	private Set<String> mySet;
	private Map<String, String> myMap;
	private Properties myProps;
		
	
	public MyColl(String[] myArr, List<String> myList, Set<String> mySet, Map<String, String> myMap,
			Properties myProps) {
		System.out.println("param constructor called =====");
		this.myArr = myArr;
		this.myList = myList;
		this.mySet = mySet;
		this.myMap = myMap;
		this.myProps = myProps;
	}

	public String[] getMyArr() {
		return myArr;
	}
	
	public List<String> getMyList() {
		return myList;
	}
	
	public Set<String> getMySet() {
		return mySet;
	}
	
	public Map<String, String> getMyMap() {
		return myMap;
	}
	
	public Properties getMyProps() {
		return myProps;
	}
	
	
}
