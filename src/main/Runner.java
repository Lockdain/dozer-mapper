package main;

import data.AddressSource;
import data.AddressTarget;
import data.Client;
import lombok.NoArgsConstructor;
import org.dozer.DozerBeanMapper;
import org.dozer.spring.DozerBeanMapperFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Component
@NoArgsConstructor
public class Runner {

    @Autowired
    private ApplicationContext context;

    @Autowired
    private DozerBeanMapperFactoryBean dozerBeanMapperFactoryBean;

    public void doMap() throws Exception {

        String[] beans = context.getBeanDefinitionNames();
        Arrays.sort(beans);
        for (String bean : beans) {
            System.out.println(bean);
        }

        DozerBeanMapper mapper = (DozerBeanMapper) dozerBeanMapperFactoryBean.getObject();
        AddressSource addrType = getAddressType();
        AddressTarget destAddr = mapper.map(addrType, AddressTarget.class);

        // Convert address type to address domain
        System.out.println("AddressSource ==> AddressTarget: " + destAddr.toString());

        // Convert AddressTarget domain to AddressTarget type
        AddressSource destAddrType = mapper.map(destAddr, AddressSource.class);
        System.out.println("AddressTarget ==> AddressSource: " + destAddrType.toString());
    }

    private static AddressSource getAddressType() {
        Client client = new Client();
        client.setName("John");
        client.setSurname("Doe");
        client.setPhone(0);

        AddressSource addrType = new AddressSource();
        addrType.setAddreLine1("121 Howard Lane");
        addrType.setCity("Orlando");
        addrType.setState("Florida");
        addrType.setZipCode(32050);
        addrType.setClient(client);

        return addrType;
    }
}



