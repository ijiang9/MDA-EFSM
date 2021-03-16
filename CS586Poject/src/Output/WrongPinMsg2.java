package Output;

public class WrongPinMsg2 extends WrongPinMsg {

    /*
        Print a payment selection prompt
     */
    @Override
    public void wrongPinMsg() {
        System.out.println("Your pin is wrong");
        System.out.println("Please try again");
    }
}
