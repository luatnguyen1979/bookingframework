package com.asd.lab6.prob2;


public class Main {

	public static void main(String[] args) {
		String html="<html><head></head><body><p>Hello World<p/></body></html>";
        Component rootNode = RenderTreeBuilder.build(html);
        
        //explicitly printed ..can be improved through recursively printing children node
		for (Component component : rootNode.getChildren()) {
			    component.print();
			for (Component comp :component.getChildren()) {
                 comp.print();
			}				
		}

	}

}
