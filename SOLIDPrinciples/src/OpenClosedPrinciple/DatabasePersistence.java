package OpenClosedPrinciple;

import SingleResponsibilityPrinciple.Invoice;

public class DatabasePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to DB
    }
}
