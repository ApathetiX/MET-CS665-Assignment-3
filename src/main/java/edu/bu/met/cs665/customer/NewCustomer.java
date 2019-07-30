package edu.bu.met.cs665.customer;

import org.apache.log4j.Logger;

public class NewCustomer extends Customer{
    private static Logger logger = Logger.getLogger(BusinessCustomer.class);

    public NewCustomer(String name, String address, String type) {
        super(name, address, type);
        this.setType("New");
        logger.info("Creating a " + this.getType() + " account");
    }
}
