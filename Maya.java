public class Maya implements PaymentType{
    @Override
    public String calculatePayment(){
        String output = new String();
        output += "Payment is Maya\n";
        output += "You will receive additional 1% interest in savings";

        return output;
    }
}
