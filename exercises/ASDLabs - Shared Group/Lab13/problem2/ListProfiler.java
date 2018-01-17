package com.asd.lab13.prob2;

import java.util.List;

public abstract class ListProfiler<T> implements List<T> {
	protected List<T> list;
	public abstract boolean add(T item);
	public abstract boolean remove(Object o);
	public abstract boolean contains(Object o);
	public abstract int size();

}
