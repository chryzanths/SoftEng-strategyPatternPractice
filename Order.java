public class Order{
    private Double orderAmount;
    private String paymentType;

    public Order (Double orderAmount, String paymentType){
        this.orderAmount = orderAmount;
        this.paymentType = paymentType;
    
    }

    // three types of payment: gcash, maya, cash

    public String calculatePayment(){
        String output = new String();
        if (paymentType.equals("Gcash")){
           output += "Payment is Gcash\n";
           output += "Energy for trees: 10 points";

        }
        else if (paymentType.equals("Maya")){
            output += "Payment is Maya\n";
            output += "You will receive additional 1% interest on savings";
        }
        else {
            output += "Payment is Cash\n";
            output += "No incentives";
        }

        return "Your order amount is " + orderAmount + "\n" + output;
    }
}