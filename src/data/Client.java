package data;

import lombok.ToString;

/**
 * This is a class to create a nested
 * structure in Address* classes to
 * test Dozer's deep copy mechanism.
 */
@ToString
public class Client {
    private String name;
    private String surname;
    private double phone;

    public Client() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPhone() {
        return phone;
    }

    public void setPhone(double phone) {
        this.phone = phone;
    }
}
