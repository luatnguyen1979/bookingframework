package com.asd.lab15;

public class Node extends Composite{
	private String name;
	
	public Node(String name){
		super();
		this.name = name;
	}
	
	public Node(String name, Side side){
		super();
		this.name = name;
		this.side = side;
	}

	@Override
	public String getName() {
		return  name;
	}
	
	@Override
	public Side getSide(){
		return side;
	}

	@Override
	public void accept(NodeVisitor visitor) {
		visitor.visit(this);
	}

}
