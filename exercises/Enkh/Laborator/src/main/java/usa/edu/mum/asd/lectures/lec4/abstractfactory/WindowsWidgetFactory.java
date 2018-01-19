package usa.edu.mum.asd.lectures.lec4.abstractfactory;

import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.*;

public class WindowsWidgetFactory implements WidgetFactory {

    @Override
    public AbstractFrameWidget createFrame() {
        return new WindowsFrame();
    }

    @Override
    public AbstractButtonWidget createButton() {
        return new WindowsButton();
    }

    @Override
    public AbstractCheckboxWidget createCheckbox() {
        return new WindowsCheckbox();
    }

    @Override
    public AbstractListboxWidget createListbox() {
        return new WindowsListbox();
    }
}