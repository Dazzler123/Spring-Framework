package lk.ijse.spring.config;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  //meya configuration class ekk kiyanne meeken
@ComponentScan(basePackages = "lk.ijse.spring")  // spring beans / POJOs thiyena location eka kiyanne meken
public class AppConfig {

    public AppConfig() {
        System.out.println("App Config : Instantiated.");
    }

    @Bean("basic") // api hadapu class ekk nemei habai eke thiyena functions use karanna apita spring container ekt daanna oni nm
    public BasicDataSource basicDataSource() {
        return new BasicDataSource();
    }
}
