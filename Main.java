public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("John Doe", "Premium");
        Sale sale1 = new Sale(customer1, "2023-03-01");
        sale1.setServiceExpense(100);
        sale1.setProductExpense(200);
        sale1.displayInfo();
    }
}