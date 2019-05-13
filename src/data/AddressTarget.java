package data;

import lombok.ToString;

/**
 * Destination POJO
 */
@ToString
public class AddressTarget {

    private String addrLine1;
    private String city;
    private String state;
    private int zip5;
    private Client client;
    private double phone;

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public AddressTarget() {
    }

    public String getAddrLine1() {
        return addrLine1;
    }

    public void setAddrLine1(String addrLine1) {
        this.addrLine1 = addrLine1;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZip5() {
        return zip5;
    }

    public void setZip5(int zip5) {
        this.zip5 = zip5;
    }
}
