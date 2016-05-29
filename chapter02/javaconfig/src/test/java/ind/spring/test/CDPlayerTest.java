package ind.spring.test;

import ind.learn.spring.component.CompactDisc;
import ind.learn.spring.component2.MediaPlayer;
import ind.learn.spring.javaconfig.CDPlayerConfig;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuweiman on 16/5/26.
 * javaconfig方式注入bean 测试
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

    @Rule
    public final SystemOutRule logRule = new SystemOutRule().enableLog();

    @Resource
    private CompactDisc compactDisc;

    @Resource
    private MediaPlayer mediaPlayer;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(compactDisc);
        compactDisc.play();
    }

    @Test
    public void turnOnMediaPlayer() {
        mediaPlayer.play();
        Assert.assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band " +
                "by The Beatles\n", logRule.getLog());
    }
}
