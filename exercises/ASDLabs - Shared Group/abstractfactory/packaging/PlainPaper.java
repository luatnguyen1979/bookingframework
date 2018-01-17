package abstractfactory.packaging;

import abstractfactory.Packaging;

public class PlainPaper implements Packaging{

	@Override
	public float getCost() {
		
		return 0.25f;
	}

}
