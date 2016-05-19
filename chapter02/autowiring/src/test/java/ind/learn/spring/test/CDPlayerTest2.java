package ind.learn.spring.test;

import ind.learn.spring.component.CDPlayerConfig;
import ind.learn.spring.component.CompactDisc;
import ind.learn.spring.component.MediaPlayer;
import ind.learn.spring.component2.CDPlayerConfig2;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuweiman on 16/5/18.
 * 测试 构造器@Autowired注解是否有效
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class, CDPlayerConfig2.class})
public class CDPlayerTest2 {

    @Rule
    public final SystemOutRule logRule = new SystemOutRule().enableLog();

    @Autowired
    private MediaPlayer player;

    @Resource(name = "lonelyHeartsClub")
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band " +
                "by The Beatles, HA!\n", logRule.getLog());
    }
}
