package visitor;

public class Main {

	public static void main(String[] args){

		Root root = DataMaker.getRoot();
		
		SimpleNodeVisitor visitor = new SimpleNodeVisitor();
		
		root.accept(visitor);
		
		visitor.printVisitResults();
				
	}
}
