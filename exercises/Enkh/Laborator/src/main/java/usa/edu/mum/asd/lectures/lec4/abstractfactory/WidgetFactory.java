package usa.edu.mum.asd.lectures.lec4.abstractfactory;

import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractButtonWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractCheckboxWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractFrameWidget;
import usa.edu.mum.asd.lectures.lec4.abstractfactory.product.AbstractListboxWidget;

public interface WidgetFactory {

    public abstract AbstractFrameWidget createFrame();

    public abstract AbstractButtonWidget createButton();

    public abstract AbstractCheckboxWidget createCheckbox();

    public abstract AbstractListboxWidget createListbox();
}
