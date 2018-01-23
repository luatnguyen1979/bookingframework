package asd.day6.lab72;

public class A extends Component{

	public A(String title) {
		super(title);
	}
	
	@Override
	public void paint() {
		System.out.println("Composite name: " + title);
		for (Component item : list) {
			item.paint();
		}
	}
	
}
