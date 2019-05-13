package main;

import data.AddressTarget;
import data.AddressSource;
import data.Client;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        List myMappingFiles = new ArrayList();
        myMappingFiles.add("dozermapper.xml");
        mapper.setMappingFiles(myMappingFiles);

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
        client.setPhone(12345676);

        AddressSource addrType = new AddressSource();
        addrType.setAddreLine1("121 Howard Lane");
        addrType.setCity("Orlando");
        addrType.setState("Florida");
        addrType.setZipCode(32050);
        addrType.setClient(client);

        return addrType;
    }
}
