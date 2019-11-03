package Tasty.cake;

public class orderCake extends  Cake
{
    double weight ;

    public orderCake(String n, double r, double w) {

        super(n, r);
        this.weight=w;
    }

    @Override
    public double calPrice() {
        return weight*rate;
    }
}