package Java;

public class Main {

    public static void main(String[] args) {
        CustomerManager customer=new CustomerManager();
        customer.database=new MysqlDb();
        customer.getCustomer();
    }
}
