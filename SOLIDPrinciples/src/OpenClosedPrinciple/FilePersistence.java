package OpenClosedPrinciple;

import SingleResponsibilityPrinciple.Invoice;

public class FilePersistence implements InvoicePersistence {

    @Override
    public void save(Invoice invoice) {
        // Save to file
    }
}
