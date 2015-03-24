import co.trackin.client.ApiException;
import co.trackin.client.ApiInvoker;
import co.trackin.client.api.CompanyService;
import co.trackin.client.api.DeliveryService;
import co.trackin.client.model.*;

import java.util.List;

public class createNewDeliveryExample {

    public static void main(String [] args){
        CompanyService service = new CompanyService();
        DeliveryService deliveryService = new DeliveryService();

        ApiInvoker.setApiKey("trackinExt-zcjc-DUMMYBve52-APIawH7O6LfM-KEYcFnFOBC-1LZnIvQ");
        ApiInvoker.setSubId(454l);

        //Create a new delivery
        Contact contact = new Contact();
        contact.setFirstName("John");
        contact.setLastName("Doe");
        contact.setAddress("35 rankin avenue");
        contact.setCity("San Jose");
        contact.setState("CA");
        contact.setZip("95110");
        contact.setCountry("USA");

        DeliveryForm delivery = new DeliveryForm();
        delivery.setRecipient(contact);
        delivery.setTotal(100.00);

        try {
            List<Company> allCompanies = service.getAllCompanies(null, null);

            if (allCompanies.iterator().hasNext()) {
                Company company = allCompanies.iterator().next();
                System.out.println(deliveryService.createDelivery(company.getId(), delivery));
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
