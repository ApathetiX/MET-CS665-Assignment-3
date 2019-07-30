package edu.bu.met.cs665;

import edu.bu.met.cs665.customer.Customer;
import edu.bu.met.cs665.example1.Person;
import org.apache.log4j.Logger;
// import org.apache.log4j.PropertyConfigurator;

public class Main {

  private static Logger logger = Logger.getLogger(Main.class);


  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {

    // This configuration is for setting up the log4j properties file.
    // It is better to set this using java program arguments.
    // PropertyConfigurator.configure("log4j.properties");

    // Let us create an object of the Main class.
    Main m = new Main();

    // Creating different types of customers
    Customer businessCustomer = CustomerEmailFactory.createAccount("Joe Smith", "5 Pironi Court", "Business");
    Customer returnCustomer = CustomerEmailFactory.createAccount("Diane Smith", "2 Windmill Court", "Returning");
    Customer frequentCustomer = CustomerEmailFactory.createAccount("John Doe", "2 Chauncy Place", "Frequent");
    Customer newCustomer = CustomerEmailFactory.createAccount("Joe Smith", "5 Pironi Court", "New");
    Customer VIPCustomer = CustomerEmailFactory.createAccount("Joe Smith", "5 Pironi Court", "VIP");

    String businessEmail = "We have the invoices for you tomorrow";
    CustomerEmailFactory.sendCustomerEmail(businessCustomer, businessEmail);
  }



  private String doIt() {
    Person student = new Person("John", "Doe");
    return student.getLastName() + ',' + student.getLastName();
  }

}
