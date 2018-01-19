package usa.edu.mum.asd.labs.lab4.abstractfactory;

import usa.edu.mum.asd.labs.lab4.abstractfactory.product.*;

public class BusinessFactory implements IFactory {

    @Override
    public ABag createBag() {
        return new MerchantCollectionBag();
    }

    @Override
    public ABox createBox() {
        return new HardPlasticBox();
    }

    @Override
    public AWrap createWrap() {
        return new HolidaySurpriseWrap();
    }
}
