package OpenClosedPrinciple;

import SingleResponsibilityPrinciple.Invoice;

interface InvoicePersistence {

    public void save(Invoice invoice);


}
