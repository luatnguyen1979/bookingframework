package usa.edu.mum.asd.labs.lab4.abstractfactory;

import usa.edu.mum.asd.labs.lab4.abstractfactory.product.*;

public class KidFactory implements IFactory {

    @Override
    public ABag createBag() {
        return new MickyBag();
    }

    @Override
    public ABox createBox() {
        return new CartoonBox();
    }

    @Override
    public AWrap createWrap() {
        return new HappyKidWrap();
    }
}
