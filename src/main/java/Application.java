import clients.SoapClient;
import countries.Country;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext contex = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SoapClient soapClient = contex.getBean(SoapClient.class);

        Country country = soapClient.getCountry("Poland");

        System.out.println(country.getName());
        System.out.println(country.getCapital());
        System.out.println(country.getPopulation());
        System.out.println(country.getCurrency().value());
    }
}
