package com.jxtb.config;


import org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 *  这个类是集合SpringBoot集成struts2的关键
 *
 * 注解Configuration表示当前类是一个配置类 主要功能是用于创建Bean实例
 *
 * 注解Bean表示返回值类型的实例创建Bean
 * SpringBoot的标准是 方法名与返回值类型  相同，首字母小写
 * Created by jxtb on 2019/1/30.
 */
@Configuration
public class ServletFilterConfig {

    /**
     * 因为这里是使用main方法加载的所以没有配置文件这里需要将struts2的核心拦截器实例
     * 否则无法访问struts2
     * 而web项目中struts2的配置文件如下：
     * 			<filter>
     *				<filter-name>struts2</filter-name>
     *				<filter-class>org.apache.struts2.dispatcher.ng.filter.StrutsPrepareAndExecuteFilter</filter-class>
     *			</filter>
     *			<filter-mapping>
     *				<filter-name>struts2</filter-name>
     *				<url-pattern>/*</url-pattern>
     *			</filter-mapping>
     * 所以我们需要在这个配置类中将web中配置的拦截器类创建这样才实现了struts2的核心配置
     * 而路径如果不配置的话默认的就是拦截所有路径
     * @return
     */
    /**
     *
     * 根据官网提供的方法我们可以通过以下的方法配置一个web里的过滤器。
     * 相当于在web文件中配置了一个过滤器叫StrutsPrepareAndExecuteFilter
     *
     * 我们也可以直接返回StrutsPrepareAndExecuteFilter 这里默认拦截的就是所有。
     *
     * 也可以直接返回一个过滤器
     * @Bean
     * public StrutsPrepareAndExecuteFilter filterRegistrationBean(){
     *       return new StrutsPrepareAndExecuteFilter();
     *
     *     }
     *
     * */
    //官网的方法配置过滤器
    @Bean
    public FilterRegistrationBean filterRegistrationBean() {
        FilterRegistrationBean frgb = new FilterRegistrationBean();
        frgb.setFilter(new StrutsPrepareAndExecuteFilter());
        List list = new ArrayList();
        //list.add("/*");
        list.add("*.action");
        frgb.setUrlPatterns(list);
        return frgb;
    }


}
