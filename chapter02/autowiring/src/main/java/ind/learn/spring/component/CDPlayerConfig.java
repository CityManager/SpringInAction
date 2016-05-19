package ind.learn.spring.component;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by xuweiman on 16/5/18.
 * Spring的@ComponentScan注解什么的自动装配的扫描配置类,默认扫描当前包内(包括所有子包)所有组件
 */


@Configuration  // 声明为Spring配置类--通过Java代码装配bean的方式中起作用,在这里完全使用自动装配貌似可以注释掉。
@ComponentScan
// @ComponentScan("component")  // 指定扫描package(不知是否可以设置为父类或者是兄弟级别的包--可以)
// @ComponentScan(basePackages="component")  // 上一条的显示声明形式
// @ComponentScan(basePackages={"component", "component2")  // 上一条的完整形式
// @ComponentScan(basePackageClasses={CDPlayer.class, DVDPlayer.class})
// 指定扫描两个类所在的包,这两个可以是普通类,建议设置为空接口
public class CDPlayerConfig {
}
