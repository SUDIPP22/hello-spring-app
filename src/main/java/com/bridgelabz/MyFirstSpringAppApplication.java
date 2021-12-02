package com.bridgelabz;

import com.bridgelabz.component.DemoBean;
import com.bridgelabz.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


/**
 * Purpose : To simulate simple hello world message
 *
 * @author SUDIP PANJA
 * @version : 0.0.1-SNAPSHOT
 * @since 2021-12-01
 */
@SpringBootApplication
public class MyFirstSpringAppApplication {
    public static final Logger logger = LoggerFactory.getLogger(MyFirstSpringAppApplication.class);

    public static void main(String[] args) {
        logger.debug("Hello World!!!");
        ApplicationContext context = SpringApplication.run(MyFirstSpringAppApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.warn("Demo Bean = " + demoBean);
        logger.warn(String.valueOf(context.getBean(HelloRestController.class)));
    }

}
