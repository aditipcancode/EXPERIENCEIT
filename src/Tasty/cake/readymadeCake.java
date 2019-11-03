package Tasty.cake;

public class readymadeCake extends Cake {

    int quantity;

    public readymadeCake(String n, double r,int q) {
        super(n, r);
        this.quantity=q;
    }
    @Override
    public double calPrice() {
        return quantity*rate;
    }
}
