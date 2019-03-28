package org.springframework.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author zy.Lee
 * 2019/2/13 18:03
 */

public class CustomApplicationContext extends ClassPathXmlApplicationContext {

    @Override
    protected void initPropertySources() {
        //把"MYSQL_HOST"作为启动的时候必须验证的环境变量
        getEnvironment().setRequiredProperties("MYSQL_HOST");
    }

    public CustomApplicationContext(String[] args){
        super(args);
    }
}
