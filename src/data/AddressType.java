package data;
import lombok.ToString;

/**
 * Source POJO
 */
@ToString
public class AddressType {

    private String addreLine1;
    private String city;
    private String state;
    private int zipCode;

    public AddressType() {
    }

    public String getAddreLine1() {
        return addreLine1;
    }

    public void setAddreLine1(String addreLine1) {
        this.addreLine1 = addreLine1;
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

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
}

