package ind.learn.spring.test;

import ind.learn.spring.component.CDPlayerConfig;
import ind.learn.spring.component.CompactDisc;
import ind.learn.spring.component2.CDPlayerConfig2;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created by xuweiman on 16/5/18.
 * CD组件测试类,测试是否能够自动装配成功
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= CDPlayerConfig2.class)  // 加载声明为Spring配置类的类,并通过该类扫描bean
public class CDPlayerTest {
    // @Autowired //当有两个CompactDisc实现注册为component时,Autowired会提示找到2个实现,报错
    @Resource(name = "setPeppers")  // 并非Spring特有的注入方式, 同时Inject注解也是非Spring特有
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        Assert.assertNotNull(cd);
        cd.play();
    }
}
