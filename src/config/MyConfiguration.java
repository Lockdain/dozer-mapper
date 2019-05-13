package config;

import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Arrays;
import java.util.List;

@Configuration
public class MyConfiguration {

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
}
