package com.asd.lab15;

public interface Component {
	public Side getSide();
	public void accept(NodeVisitor visitor);
}


