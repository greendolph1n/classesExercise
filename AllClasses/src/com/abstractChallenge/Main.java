package com.abstractChallenge;

public class Main {
	public static void main(String[] args) {
		myLinkedList list=new myLinkedList(null);
		String stringData="derek kolby kaden sara henry mark john hannah derek zebara";
		String[]data=stringData.split(" ");
		for(String s:data) {
			list.addItem(new Node(s));
		}
	//	list.removeItem(new Node("john"));
		list.traverse(list.getRoot());
		System.out.println();
		System.out.println(list.getRoot().next().next().next().previous().value);
		Object o =new Object();
		o.equals(o);
		
	}

}
