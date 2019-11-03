package Tasty.cake;
abstract class Cake {
    protected String name;
    protected double rate;
    public Cake(String n, double r)
    {
        this.name=n;
        this.rate=r;
    }
    public abstract double calPrice();
    public String toString()
    {
        return name+"\t"+rate;
    }

}