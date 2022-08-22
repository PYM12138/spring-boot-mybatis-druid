package com.atguigu.springbootmybatisdruid.config;

import org.apache.ibatis.session.Configuration;
import org.mybatis.spring.boot.autoconfigure.ConfigurationCustomizer;
import org.springframework.context.annotation.Bean;

@org.springframework.context.annotation.Configuration
public class MyBatisConfig {

    //Mybatis 专属配置类
    @Bean
    public ConfigurationCustomizer configurationCustomizer(){
        return new ConfigurationCustomizer(){//Mybatis定制器

            @Override
            public void customize(Configuration configuration) {
                //开启驼峰命名处理(java属性是驼峰命名=数据库row_name形式)
                configuration.setMapUnderscoreToCamelCase(true);
            }
        };
    }
}
