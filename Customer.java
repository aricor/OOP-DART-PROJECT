import java.util.UUID;

public class Customer {
    private String ID;
    private String customerName;
    
    public Customer(String ID, String customerName) {
    this.ID = ID;
    this.customerName = customerName;
    }

    public void setID(String UniqueIDs){
    }

    public String getID() {
        String uniqueID = UUID.randomUUID().toString();
        String uniqueIDs = this.ID;
        return this.ID;
    }

    public void setCustomerName(String name){
    }

    public String getCustomerName(){
        return this.customerName;
    }

    public void print() {
        System.out.println(this.ID + "  " + this.customerName + "  " );
        System.out.println();
    }

}

