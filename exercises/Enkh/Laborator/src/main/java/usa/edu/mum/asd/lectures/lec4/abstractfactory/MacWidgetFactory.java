package usa.edu.mum.asd.lectures.lec4.abstractfactory;

import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.*;

public class MacWidgetFactory implements WidgetFactory {

    @Override
    public AbstractButtonWidget createButton() {
        return new MacButton();
    }

    @Override
    public AbstractCheckboxWidget createCheckbox() {
        return new MacCheckbox();
    }

    @Override
    public AbstractListboxWidget createListbox() {
        return new MacListbox();
    }

    @Override
    public AbstractFrameWidget createFrame() {
        return new MacFrame();
    }
}
