package com.asd.lab14.prob2;

import java.util.ArrayList;

public class Collection implements Notifier {
	ArrayList<String> names;
	private CollectionObserver observer;
	
	public Collection(ArrayList<String> names, CollectionObserver o){
		this.names = names;
		this.observer = o;
	}
	
	@Override
	public void notifyObservers() {
		observer.update(names);
	}
	
	public void addName(String name){
		names.add(name);
		notifyObservers();
	}
	
	public void removeName(int index){
		names.remove(index);
		notifyObservers();
	}

}
