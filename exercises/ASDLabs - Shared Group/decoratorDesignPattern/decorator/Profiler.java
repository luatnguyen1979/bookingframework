package decoratorDesignPattern.decorator;

public interface Profiler {

	public boolean add(Object e);
	public boolean remove(Object o) ;
	public boolean contains(Object o);
	public int size();
		
}
