package service;

import datastr.MyLinkedList;

public class MainService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyLinkedList<Integer> mylist = new MyLinkedList<Integer>();
		try {
			mylist.add(23);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
