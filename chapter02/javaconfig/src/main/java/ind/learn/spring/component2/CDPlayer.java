package ind.learn.spring.component2;


import ind.learn.spring.component.CompactDisc;

/**
 * Created by xuweiman on 16/5/26.
 * CD播放器实现
 */
public class CDPlayer implements MediaPlayer {

    private CompactDisc compactDisc;

    public CDPlayer(CompactDisc c) {
        this.compactDisc = c;
    }

    public CDPlayer() {
    }

    public void play() {
        compactDisc.play();
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }
}
