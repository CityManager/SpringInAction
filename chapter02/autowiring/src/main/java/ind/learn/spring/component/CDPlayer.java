package ind.learn.spring.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Created by xuweiman on 16/5/18.
 * 继承了媒体播放器接口的CD播放器实现
 */
@Component
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    @Autowired(required = true)
    // Autowired能够注解构造器,则初始化CDPlayer实例时,构造器上的参数使用注入方式传入
    // required = false , 表示如果没有匹配到CompactDisc这个bean,则可以传入null
    // 问题: 构造器中如何使用 bean的ID进行注解? -- 在参数中再使用@Qualifier注解指定bean的ID
    public CDPlayer(@Qualifier(value = "lonelyHeartsClub")CompactDisc cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

    @Resource(name = "setPeppers")
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired  // Autowired 注解,能够注解声明、构造器、方法, 注解构造器或者声明都好理解,注解到方法上如何使用?
    @Qualifier(value = "lonelyHeartsClub")
    public void insertDisc(CompactDisc cd) {
        this.cd = cd;
    }
}
