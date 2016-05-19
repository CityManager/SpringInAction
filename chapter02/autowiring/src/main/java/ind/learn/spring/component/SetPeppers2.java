package ind.learn.spring.component;

import org.springframework.stereotype.Component;

/**
 * Created by xuweiman on 16/5/18.
 * 创建CD盘bean,并且配置been的ID为 lonelyHeartsClub
 */
@Component("lonelyHeartsClub")
//@Named("lonelyHeartsClub")  // 与@Component相同效果,不过Named不是Spring特有注解
public class SetPeppers2 implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing " + title + " by " + artist + ", HA!");
    }
}
