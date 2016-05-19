package ind.learn.spring.component;

import org.springframework.stereotype.Component;

/**
 * Created by xuweiman on 16/5/18.
 * 比伯军曹寂寞芳心俱乐部 CD盘
 */
@Component  // 默认组件ID为 setPeppers
// @Component("lonelyHeartsClub")  // 设置组件的ID为 lonelyHeartsClub, 这个ID有什么作用目前不明
public class SetPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
