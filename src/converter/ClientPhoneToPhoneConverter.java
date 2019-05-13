package converter;

import org.dozer.DozerConverter;

/**
 * Converter for the deep
 * mapping case of Client.phone -> phone
 * see the dozermapper.xml
 */
public class ClientPhoneToPhoneConverter extends DozerConverter<Double, Double> {

    public ClientPhoneToPhoneConverter() {
        super(Double.class, Double.class);
    }

    public Double convertTo(Double source, Double destination) {
        if (getParameter().equals("PHONE")) {
            if (source == 0) {
                System.out.println("Phone number is 0!");
                return 123D;
            }
        }
        return null;
    }

    public Double convertFrom(Double source, Double destination) {
        return convertTo(source, destination);
    }
}
