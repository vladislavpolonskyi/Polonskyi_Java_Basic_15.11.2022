package lesson14;

public abstract class MusicStyle {
    protected String name;

    public MusicStyle(String name) {
        this.name = name;
    }

    public abstract void playMusic();

}

