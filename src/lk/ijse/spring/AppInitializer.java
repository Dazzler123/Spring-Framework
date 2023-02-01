package lk.ijse.spring;

import lk.ijse.spring.config.AppConfig;
import lk.ijse.spring.pojo.DBConnection;
import lk.ijse.spring.pojo.SpringBean;
import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

public class AppInitializer {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(); //spring container eka
        ctx.register(AppConfig.class);  //to give the configuration class
//        ctx.register(DBConnection.class);
        ctx.refresh();

//        SpringBean bean = ctx.getBean(SpringBean.class);
//        bean.test();
//        System.out.println(bean);

        //create bean for db conn
        DBConnection dbBean = ctx.getBean(DBConnection.class);
//        dbBean.getConnection();

        //using Bean ID for @Bean given classes
        BasicDataSource bean1 = (BasicDataSource) ctx.getBean("basic");
        System.out.println(bean1);

        //using Bean ID for @Component given classes
        SpringBean beanId = (SpringBean) ctx.getBean("bean");
        System.out.println(beanId);

        ctx.close();
    }
}
