package edu.bu.met.cs665.customer;

import org.apache.log4j.Logger;

public class ReturnCustomer extends Customer {
    private static Logger logger = Logger.getLogger(BusinessCustomer.class);

    public ReturnCustomer(String name, String address, String type) {
        super(name, address, type);
        this.setType("Return");
        logger.info("Creating a " + this.getType() + " account");
    }
}
