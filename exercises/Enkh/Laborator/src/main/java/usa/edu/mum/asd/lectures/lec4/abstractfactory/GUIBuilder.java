package usa.edu.mum.asd.lectures.lec4.abstractfactory;

import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractButtonWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractCheckboxWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractFrameWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractListboxWidget;

public class GUIBuilder {

    private WidgetFactory widgetFactory;

    public GUIBuilder() {
        if (System.getProperty("os.name").startsWith("Windows")) {
            widgetFactory = new WindowsWidgetFactory();
        } else if (System.getProperty("os.name").startsWith("Mac")) {
            widgetFactory = new MacWidgetFactory();
        }
    }

    public WidgetFactory getWidgetFactory() {
        return widgetFactory;
    }

    public static void main(String[] args) {
        GUIBuilder guiBuilder = new GUIBuilder();
        WidgetFactory wf = guiBuilder.getWidgetFactory();
        if (wf == null) {
            System.out.println("This platform is not being supported.");
            return;
        }
        AbstractFrameWidget myFrame = wf.createFrame();
        AbstractButtonWidget myButton = wf.createButton();
        AbstractCheckboxWidget myCheckbox = wf.createCheckbox();
        AbstractListboxWidget myListbox = wf.createListbox();
    }
}
