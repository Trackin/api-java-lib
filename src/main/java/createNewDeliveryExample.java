import co.trackin.client.ApiException;
import co.trackin.client.api.CompanyService;
import co.trackin.client.api.TrackinApi;
import co.trackin.client.model.Company;
import co.trackin.client.model.Contact;
import co.trackin.client.model.DeliveryForm;
import co.trackin.client.model.Line;

import java.util.ArrayList;
import java.util.List;

public class createNewDeliveryExample {

    public static void main(String[] args) {
        TrackinApi trackinApi = new TrackinApi("trackinExt-zcjc-DUMMYBve52-APIawH7O6LfM-KEYcFnFOBC-1LZnIvQ", 454l);

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


        List<Line> lines = new ArrayList<Line>();
        lines.add(new Line("Pommelos", 4.5, 2));

        delivery.setContent(lines);

        try {
            List<Company> allCompanies = trackinApi.companies.getAll(null, CompanyService.OrderType.Delivery);

            if (allCompanies.iterator().hasNext()) {
                Company company = allCompanies.iterator().next();
                System.out.println(trackinApi.deliveries.create(company.getId(), delivery));
            }
        } catch (ApiException e) {
            e.printStackTrace();
        }
    }
}
