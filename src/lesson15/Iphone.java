package lesson15;

public class Iphone implements IOS, Smartphone {

    @Override
    public void call() {
        System.out.println("Stay in touch with  IOS");
    }
    @Override
    public void sms() {
        System.out.println("Тhe IOS operating system welcomes you");
    }
    @Override
    public void Internet() {
        System.out.println("You are connected to the Internet");
    }
}
