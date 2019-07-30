package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.*;
import org.apache.log4j.Logger;

public class CustomerEmailFactory {
    private static Logger logger = Logger.getLogger(CustomerEmailFactory.class);

    public static CustomerBundle sendCustomerEmail(Customer customer, String email) {
        if (customer.getType().equals("Business")) {
            logger.info("Found a business customer account");
            logger.info("Sending " + email + " to " + customer.getName());
        } else if (customer.getType().equals("Returning")) {
            logger.info("Found a return customer account");
            logger.info("Sending " + email + " to " + customer.getName());
        } else if (customer.getType().equals("Frequent")) {
            logger.info("Found a frequent customer account");
            logger.info("Sending " + email + " to " + customer.getName());
        } else if (customer.getType().equals("New")) {
            logger.info("Found a new customer account");
            logger.info("Sending " + email + " to " + customer.getName());
        } else if (customer.getType().equals("VIP")) {
            logger.info("Found a VIP customer account");
            logger.info("Sending " + email + " to " + customer.getName());
        } else {
            logger.error("Customer account type not found!");
        }
        CustomerBundle bundle = new CustomerBundle(customer);
        return bundle;
    }

    public static Customer createAccount(String name, String address, String type) {
        if (type.equals("Business")) {
            return new BusinessCustomer(name, address, type);
        } else if (type.equals("Returning")) {
            return new ReturnCustomer(name, address, type);
        } else if (type.equals("Frequent")) {
            return new FrequentCustomer(name, address, type);
        } else if (type.equals("New")) {
            return new NewCustomer(name, address, type);
        } else if (type.equals("VIP")) {
            return new VIPCustomer(name, address, type);
        }
        logger.error("Could not create a customer account!");
        return null;
    }
}
