package com.shun;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author chenxs(chenxs @ xiaopeng.com)——车联网基础平台
 * 2019-03-08 15:49
 **/
@Configuration
public class HystrixConfiguration {

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean(new HystrixMetricsStreamServlet(), "/hystrix.stream");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.setName("hystrixMetricStreamServlet");
        return servletRegistrationBean;
    }

}
