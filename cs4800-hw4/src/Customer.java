public class Customer {
    private String customerName;
    private String customerDietPlan;

    public Customer() {
        this.customerName = "";
        this.customerDietPlan = "";
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setCustomerDietPlan(String customerDietPlan) {
        this.customerDietPlan = customerDietPlan;
    }

    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerDietPlan() {
        return customerDietPlan;
    }
}
