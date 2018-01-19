package usa.edu.mum.asd.labs.lab4.factorymethod;


public class FactoryImpl implements IFactory {

    private static IFactory instance = new FactoryImpl();

    private FactoryImpl() {
    }

    public static IFactory getInstance() {
        return instance;
    }

    @Override
    public ITrace createTrace(String type) {
        if ("trace.log".equals(type)) {
            return new FileTrace();
        } else {
            return new ConsoleTrace();
        }
    }
}
