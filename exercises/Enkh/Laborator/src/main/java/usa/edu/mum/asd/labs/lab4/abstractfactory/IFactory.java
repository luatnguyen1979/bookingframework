package usa.edu.mum.asd.labs.lab4.abstractfactory;

import usa.edu.mum.asd.labs.lab4.abstractfactory.product.Packaging;

public interface IFactory {

    public Packaging createBag();

    public Packaging createBox();

    public Packaging createWrap();

}
