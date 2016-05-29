package ind.learn.spring.javaconfig;

import ind.learn.spring.component.CompactDisc;
import ind.learn.spring.component.SgtPeppers;
import ind.learn.spring.component2.CDPlayer;
import ind.learn.spring.component2.MediaPlayer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuweiman on 16/5/26.
 * JavaConfig方式注册spring bean
 * JavaConfig方式 主要用于装配第三方类库中的组件到spring容器中。
 * 当然 xml配置的方式也可以,视个人喜好
 */
@Configuration
public class CDPlayerConfig {

    @Bean
    // @Bean(name="lonelyHeartsClubBand")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

    /* // bean装配过程中需要注入其他bean,方式一
    @Bean
    public MediaPlayer mediaPlayer() {
        return new CDPlayer(sgtPeppers());
    }
    */

    @Bean  // bean装配过程中需要注入其他bean,方式二
    public MediaPlayer mediaPlayer(CompactDisc compactDisc) {
        CDPlayer cdPlayer = new CDPlayer();
        cdPlayer.setCompactDisc(compactDisc);
        return cdPlayer;
    }
}
