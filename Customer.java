public class Customer {
    String ID;
    String customerName;

    public Customer(String ID, String customerName) {
    this.ID = ID;
    this.customerName = customerName;

    }

    public void print() {
        System.out.println(this.ID + "  " + this.customerName + "  " );
        System.out.println();
    }

}
