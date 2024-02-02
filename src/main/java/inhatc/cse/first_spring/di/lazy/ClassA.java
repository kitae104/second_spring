package inhatc.cse.first_spring.di.lazy;

import org.springframework.stereotype.Component;

@Component
public class ClassA {
    public ClassA(){
        System.out.println("ClassA Initialization");
    }
}
