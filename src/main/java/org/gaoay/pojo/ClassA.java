package org.gaoay.pojo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2015/5/5.
 */
public class ClassA implements InitializingBean,ApplicationListener,DisposableBean{
    public ClassA() {
        System.out.println("class A initial.");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("class A afterPropertiesSet!");
    }

    public void onApplicationEvent(ApplicationEvent event) {
        System.out.println("EVENT A");
    }

    public void destroy() throws Exception {
        System.out.println("A is destroy!");
    }
}
