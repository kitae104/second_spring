package inhatc.cse.first_spring.di.cdi;

import inhatc.cse.first_spring.di.c1.DataService;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//@Component
@Named
class BusinessService {
    private DataServices dataServices;

    //@Autowired
    @Inject
    public void setDataServices(DataServices dataServices) {
        System.out.println("Setter Injection!");
        this.dataServices = dataServices;
    }

    public DataServices getDataServices() {
        System.out.println("Getter ...");
        return dataServices;
    }
}

//@Component
@Named
class DataServices {

}

@Configuration
@ComponentScan
public class CdiContextLauncherApplication {
    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(CdiContextLauncherApplication.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(BusinessService.class).getDataServices());
        }
    }

}
