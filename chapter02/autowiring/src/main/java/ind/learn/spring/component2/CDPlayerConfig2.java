package ind.learn.spring.component2;

import ind.learn.spring.component.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuweiman on 16/5/18.
 * 组件扫描配置类, 测试是否能够扫描 父类或者兄弟包内的组件
 */

@Configuration  // 貌似这个注解不一定要有。
@ComponentScan(basePackageClasses = {CompactDisc.class})
public class CDPlayerConfig2 {
}
