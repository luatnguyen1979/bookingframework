package asd.day6.lab72;

public class H1 extends Component{
	public H1(String title) {
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
