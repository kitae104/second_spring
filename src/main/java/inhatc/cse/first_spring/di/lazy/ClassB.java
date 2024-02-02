package inhatc.cse.first_spring.di.lazy;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class ClassB {

    private ClassA classA;
    public ClassB(ClassA classA){
        System.out.println("ClassB Initialization");
        this.classA = classA;
    }

    public void doSomething(){
        System.out.println("Do Something");
    }
}
