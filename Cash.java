public class Cash implements PaymentType{
    @Override
    public String calculatePayment(){
        String output = new String();
        output += "Payment is Cash\n";
        output += "You will receive additional 1% interest in savings";

        return output;
    }
}
