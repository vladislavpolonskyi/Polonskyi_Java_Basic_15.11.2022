package lesson14;

public class RockMusic extends MusicStyle {

    public RockMusic(String name) {
        super(name);
    }

    @Override
    public void playMusic() {
        System.out.println(name + "-" + "Sound of RockMusic");
    }
}
