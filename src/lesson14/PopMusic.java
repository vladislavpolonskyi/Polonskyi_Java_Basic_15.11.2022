package lesson14;

public class PopMusic extends MusicStyle {

    public PopMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(name + "-" + "Sound of PopMusic");
    }

}
