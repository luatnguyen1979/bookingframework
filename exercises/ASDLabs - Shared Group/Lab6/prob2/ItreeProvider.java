package com.asd.lab6.prob2;

import java.util.Collection;

public interface ItreeProvider {

	void addChild(Component child);
	void addParent(Component parent);
	Component getParent();
	Collection<Component> getChildren();
	void print();
}
