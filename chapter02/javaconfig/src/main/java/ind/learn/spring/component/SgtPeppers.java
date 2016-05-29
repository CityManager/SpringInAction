package ind.learn.spring.component;

/**
 * Created by xuweiman on 16/5/26.
 * SgtPeppers 专辑
 */
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
