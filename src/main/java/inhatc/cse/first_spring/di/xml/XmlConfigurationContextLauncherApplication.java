package inhatc.cse.first_spring.di.xml;

import inhatc.cse.first_spring.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Arrays;

public class XmlConfigurationContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new ClassPathXmlApplicationContext("classpath:xml/applicationCTX.xml")) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean("name"));
            System.out.println(context.getBean("age"));

            context.getBean("gameRunner", GameRunner.class).run();
        }
    }

}
