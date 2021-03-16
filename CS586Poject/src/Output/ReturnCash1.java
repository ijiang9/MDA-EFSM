package Output;

public class ReturnCash1 extends ReturnCash {

    /*
        GasPump1 does not support payment with cash, and so this method should never be invoked
        by GasPump1 under the current system design.
        However, in the case that it does get invoked, it will do nothing.
    */
    @Override
    public void returnCash() {

    }
}