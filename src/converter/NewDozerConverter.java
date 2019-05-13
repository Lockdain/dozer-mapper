package converter;

import org.dozer.DozerConverter;

public class NewDozerConverter extends DozerConverter<String, String> {

    public NewDozerConverter() {
        super(String.class, String.class);
    }

    @Override
    public String convertTo(String source, String destination) {
        if(getParameter().equals("STATE")){
            //In real world application, Fetch state code and display value map from cache and convert
            if(source!=null && source.equals("Florida")){
                return "FL";
            }
        }
        return null;
    }

    @Override
    public String convertFrom(String source, String destination) {
        // TODO Auto-generated method stub
        return convertTo(source,destination);
    }
}
