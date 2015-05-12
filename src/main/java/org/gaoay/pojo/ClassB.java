package org.gaoay.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ApplicationContextEvent;

import java.util.Map;

/**
 * Created by Administrator on 2015/5/5.
 */
public class ClassB implements InitializingBean,ApplicationListener,DisposableBean {
    private ClassA classA;
    private Map<String,ClassTest> classTests;
    public ClassB() {
        System.out.println("class B initial.");
    }

    public ClassA getClassA() {
        return classA;
    }

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("class B afterPropertiesSet!");
        for(Map.Entry<String,ClassTest> test: classTests.entrySet()){
            System.out.println(test.getKey() + "is key!");
        }
    }

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("EVENT B");
    }

    public void destroy() throws Exception {
        System.out.println("B is destroy!");
    }

    public Map<String, ClassTest> getClassTests() {
        return classTests;
    }

    public void setClassTests(Map<String, ClassTest> classTests) {
        this.classTests = classTests;
    }
}
