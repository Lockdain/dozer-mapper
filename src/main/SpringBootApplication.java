package main;


import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;
import java.util.List;

@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {

    @Bean(name = "org.dozer.spring.DozerBeanMapperFactoryBean")
    @Scope("singleton")
    public DozerBeanMapperFactoryBean dozerBean() {
        List<String> mappingFiles = Arrays.asList("dozermapper.xml");

        DozerBeanMapperFactoryBean dozerFactoryBean = new DozerBeanMapperFactoryBean();
        Resource[] resources = new Resource[1];
        resources[0] = new ClassPathResource("dozermapper.xml");
        dozerFactoryBean.setMappingFiles(resources);

        return dozerFactoryBean;
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext context = SpringApplication.run(SpringBootApplication.class, args);
        Runner runner = context.getBean(Runner.class);
        runner.doMap();
    }

}

