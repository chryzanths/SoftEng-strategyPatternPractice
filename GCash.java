public class GCash implements PaymentType
{
    @Override
    public String calculatePayment(){
        String output = "";
        output += "Payment is Gcash\n";
        output += "You will receive additional 1% interest in savings";

        return output;
    }
}
