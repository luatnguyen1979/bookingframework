package asd.day6.lab72;

public class IMG extends Component{

	public IMG(String title) {
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
