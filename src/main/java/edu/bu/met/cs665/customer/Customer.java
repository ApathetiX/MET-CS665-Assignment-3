package edu.bu.met.cs665.customer;

import edu.bu.met.cs665.Main;
import org.apache.log4j.Logger;

public abstract class Customer {
    protected String name; // Customer has a name
    protected String address; // Customer has an address
    protected String customerType; // Customer type
    private static Logger logger = Logger.getLogger(Customer.class);

    public Customer(String name , String address, String customerType) {
        this.name = name;
        this.address = address;
        this.customerType = customerType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return customerType;
    }

    public void setType(String type) {
        this.customerType = type;
    }

    public boolean isBusiness() {
        return true;
    }

    public boolean isReturning() {
        return true;
    }

    public boolean isFrequent() {
        return true;
    }

    public boolean isNew() {
        return true;
    }

    public boolean isVIP() {
        return true;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return (customer.name.equals(this.name) && customer.customerType == this.customerType);
    }
}
