package edu.bu.met.cs665.customer;

import org.apache.log4j.Logger;

public class BusinessCustomer extends Customer{
    private static Logger logger = Logger.getLogger(BusinessCustomer.class);

    public BusinessCustomer(String name, String address, String type) {
        super(name, address, type);
        this.setType("Business");
        logger.info("Creating a " + this.getType() + " account");
    }
}
