package Output;

public class StopMsg1 extends StopMsg {

    /*
        Print a message indicating to the user that the pump is stopping
     */
    @Override
    public void stopMsg() {
        System.out.println("STOPPING PUMP ...");
    }
}