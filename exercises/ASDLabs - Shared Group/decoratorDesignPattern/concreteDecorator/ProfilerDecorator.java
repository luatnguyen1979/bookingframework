package decoratorDesignPattern.concreteDecorator;

import decoratorDesignPattern.abstractDecorator.ListDecorator;
import decoratorDesignPattern.decorator.Profiler;

public class ProfilerDecorator extends ListDecorator {

	public ProfilerDecorator(Profiler decoratedList) {
		super(decoratedList);
	}

}
