package usa.edu.mum.asd.labs.lab4.abstractfactory;

import usa.edu.mum.asd.labs.lab4.abstractfactory.product.*;

public class AdultFactory implements IFactory {

    @Override
    public ABag createBag() {
        return new ReusableShopperBag();
    }

    @Override
    public ABox createBox() {
        return new PlainPaperBox();
    }

    @Override
    public AWrap createWrap() {
        return new EverydayValueWrap();
    }
}
