package com.asd.lab15;

public class RootNode extends Composite{
	private String name;
	
	public RootNode(String name){
		super();
		this.name = name;
		side = Side.NONE;
	}
	
		
	@Override
	public String getName() {
		return name;
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
