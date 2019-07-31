package com.qianfeng.springboot2.webConfig;

import com.qianfeng.springboot2.Filter.MyFilter;
import com.qianfeng.springboot2.Listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author qiujinyao
 * @version 1.0
 * @Date 2019/7/31
 */
@Configuration
public class WebConfig {
    @Autowired
    private MyFilter myFilter;
    @Autowired
    private MyListener myListener;

    @Bean
    public  FilterRegistrationBean init(){
        FilterRegistrationBean bean=new FilterRegistrationBean();
        bean.setFilter(myFilter);
        bean.setName("myfilter");
        bean.addUrlPatterns("/*");
        return  bean;
    }
    @Bean
    public ServletListenerRegistrationBean getRegistration(){
        ServletListenerRegistrationBean bean=new ServletListenerRegistrationBean();
        bean.setListener(myListener);
        return bean;
    }
}
