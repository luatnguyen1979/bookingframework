package com.asd.lab13.prob2;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListProfiler<T> extends ListProfiler<T>{

	public LinkedListProfiler(List<T> list){
		this.list = list;
	}
	@Override
	public boolean add(T item) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.add(item);
		System.out.println("LinkedList: add method" + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public boolean remove(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.remove(o);
		System.out.println("LinkedList: remove method " + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public boolean contains(Object o) {
		long startTime = System.currentTimeMillis();
		boolean result = this.list.contains(o);
		System.out.println("LinkedList contains method: " + (System.currentTimeMillis() - startTime));
		return result;
	}

	@Override
	public int size() {
		long startTime = System.currentTimeMillis();
		int result = this.list.size();
		System.out.println("LinkedList  size method: " +  (System.currentTimeMillis() - startTime));
		return result;
	}
	
	
	@Override
	public void add(int index, T element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean addAll(Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addAll(int index, Collection<? extends T> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int indexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int lastIndexOf(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ListIterator<T> listIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ListIterator<T> listIterator(int index) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public boolean removeAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public T set(int index, T element) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> subList(int fromIndex, int toIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object[] toArray() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> T[] toArray(T[] a) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public T remove(int index) {
		// TODO Auto-generated method stub
		return null;
	}



}
