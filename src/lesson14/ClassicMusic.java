package lesson14;

public class ClassicMusic  extends MusicStyle {

    public ClassicMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(name + "-" + "Sound of ClassicMusic");
    }
}
