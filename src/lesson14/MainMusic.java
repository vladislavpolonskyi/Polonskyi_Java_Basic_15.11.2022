package lesson14;

public class MainMusic {
    /**
     * Create a MusicStyles class which will contain the playMusic() method
     * Make it heirs: PopMusic, RockMusic and ClassicMusic.
     * Descendants must implement the playMusic() method in their own way.
     * In the main class, create music bands for each style
     * Use the for each method to call playMusic() on all descendants
     */

    public static void main(String[] args) {

        MusicStyle rockMusic = new RockMusic("AC/DC");
        MusicStyle popMusic = new PopMusic("The Beatles");
        MusicStyle classicMusic = new ClassicMusic("Johann Sebastian Bach");

        MusicStyle[] groups = {rockMusic,popMusic,classicMusic};

        for (MusicStyle group : groups) {
            group.playMusic();
        }
    }

}
