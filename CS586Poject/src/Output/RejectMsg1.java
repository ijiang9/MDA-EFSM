package Output;

public class RejectMsg1 extends RejectMsg {

    /*
        Print a message indicating that the user's credit card has been rejected
     */
    @Override
    public void rejectMsg() {
        System.out.println("CREDIT CARD REJECTED");
        System.out.println("Cancelling transaction ...");
    }
}