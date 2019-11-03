package Polymorphism;
public class main {
    public static void main(String[] args) {
        Animal a;
        a=new Dog();
        a.eat();
        a=new Cat();
        a.eat();
        a=new Lion();
        a.eat();

    }
}
