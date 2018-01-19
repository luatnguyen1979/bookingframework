package usa.edu.mum.asd.lectures.lec3.templemethod;


public class SlowOrderProcessor extends AOrderProcessor {

    @Override
    public float getShippingFee(IOrder order) {
        // calculate shipping cost based on order details
        float shippingFee = 0;
        return shippingFee;
    }

    @Override
    public int getShippingTime(IOrder order) {
        // get shipping time based on shipping address
        int shippingTime = 100;
        return shippingTime;
    }

    @Override
    public void sendConfirmation(String orderDetails, float
            shippingFee, int shippingTime) {// send by email
    }
}