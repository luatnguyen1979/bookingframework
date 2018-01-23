package asd.day6.lab72;

public class H2 extends Component{

	public H2(String title) {
		super(title);
	}

	@Override
	public void paint() {
		System.out.println("Paiting tag : " + title);
		for (Component item : list) {
			item.paint();
		}
	}
	
}
