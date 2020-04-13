package it.chen.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration//声明这个类是一个java配置类。相当于xml
//@PropertySource("classpath:Jdbc.properties")//读取资源文件
//@EnableConfigurationProperties(JdbcProperties.class)
public class JdbcConfiguration {

    //@Autowired
    /*private JdbcProperties jdbcProperties;

    public JdbcConfiguration(JdbcProperties jdbcProperties) {
        this.jdbcProperties = jdbcProperties;
    }
    @Bean
    public DataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(this.jdbcProperties.getDriverClassName());
        dataSource.setUrl(this.jdbcProperties.getUrl());
        dataSource.setUsername(this.jdbcProperties.getUsername());
        dataSource.setPassword(this.jdbcProperties.getPassword());
        return dataSource;
    }*/

   /* @Bean
    public DataSource dataSource(JdbcProperties jdbcProperties){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(jdbcProperties.getDriverClassName());
        dataSource.setUrl(jdbcProperties.getUrl());
        dataSource.setUsername(jdbcProperties.getUsername());
        dataSource.setPassword(jdbcProperties.getPassword());
        return dataSource;
    }*/
   @Bean
   @ConfigurationProperties(prefix = "jdbc")//自动调用set方法设置参数，局限性：1.方法的返回值必须要有set方法。2.set方法的属性名必须与配置文件一致
   public DataSource dataSource(){
       DruidDataSource dataSource = new DruidDataSource();
       return dataSource;
   }

}
