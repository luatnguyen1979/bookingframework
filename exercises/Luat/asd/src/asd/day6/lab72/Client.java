package asd.day6.lab72;

public class Client {
	
	public static void main(String[] args) {
		Component htmlTag = new HTML("HTML");
		Component headTag = new HTML("HEAD");
		Component titleTag = new TITLE("TITLE");
		Component bodyTag = new BODY("BODY");
		Component centerTag = new CENTER("CENTER");
		Component imgTag = new IMG("IMG");
		Component aTag = new A("A");
		Component h1Tag = new H1("H1");
		Component h2Tag = new H2("H2");
		Component b1Tag = new B("B");
		Component b2Tag = new B("B");
		Component iTag = new I("I");
		
		//Head
		headTag.addItem(titleTag);
		
		//Body
		centerTag.addItem(imgTag);
		bodyTag.addItem(centerTag);
		bodyTag.addItem(aTag);
		bodyTag.addItem(h1Tag);
		bodyTag.addItem(h2Tag);
		bodyTag.addItem(b1Tag);
		b2Tag.addItem(iTag);
		bodyTag.addItem(b2Tag);
		
		htmlTag.addItem(headTag);
		htmlTag.addItem(bodyTag);
		
		System.out.println("Paiting HTML tag \n----------------------------");
		htmlTag.paint();
		
		System.out.println("\nPaiting HEAD tag \n----------------------------");
		headTag.paint();
		
		System.out.println("\nPaiting TITLE tag \n----------------------------");
		titleTag.paint();
		
		System.out.println("\nPaiting BODY tag \n----------------------------");
		bodyTag.paint();
		
		System.out.println("\nPaiting CENTER tag \n----------------------------");
		centerTag.paint();
		
		System.out.println("\nPaiting IMG tag \n----------------------------");
		imgTag.paint();
		
		System.out.println("\nPaiting A tag \n----------------------------");
		aTag.paint();
		
		System.out.println("\nPaiting H1 tag \n----------------------------");
		h1Tag.paint();
		
		System.out.println("\nPaiting H2 tag \n----------------------------");
		h2Tag.paint();
		
		System.out.println("\nPaiting B1 tag \n----------------------------");
		b1Tag.paint();
		
		System.out.println("\nPaiting B2 tag \n----------------------------");
		b2Tag.paint();
		
		System.out.println("\nPaiting I tag \n----------------------------");
		iTag.paint();
	}
	
}
