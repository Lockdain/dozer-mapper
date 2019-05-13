package main;

import data.Address;
import data.AddressType;
import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        DozerBeanMapper mapper = new DozerBeanMapper();
        List myMappingFiles = new ArrayList();
        myMappingFiles.add("dozermapper.xml");
        mapper.setMappingFiles(myMappingFiles);

        AddressType addrType = getAddressType();

        Address destAddr = mapper.map(addrType, Address.class);

        // Convert address type to address domain
        System.out.println("AddressType==>Address: " + destAddr.toString());

        // Convert Address domain to Address type
        AddressType destAddrType = mapper.map(destAddr, AddressType.class);
        System.out.println("Address==>AddressType: " + destAddrType.toString());
    }

    private static AddressType getAddressType() {
        AddressType addrType = new AddressType();
        addrType.setAddreLine1("121 Howard Lane");
        addrType.setCity("Orlando");
        addrType.setState("Florida");
        addrType.setZipCode(32050);
        return addrType;
    }
}
