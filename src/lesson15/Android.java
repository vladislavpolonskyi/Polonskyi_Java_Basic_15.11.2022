package lesson15;

public class Android implements LinuxOS, Smartphone {

    @Override
    public void call() {
        System.out.println("Stay in touch with  Android ");
    }
    @Override
    public void sms() {
        System.out.println("The Android operating system welcomes you");
    }
    @Override
    public void Internet() {
        System.out.println("You are connected to the Internet");
    }
}
