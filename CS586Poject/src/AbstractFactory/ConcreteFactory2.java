package AbstractFactory;
import Output.*;
import DataStore.*;
public class ConcreteFactory2 extends AbstractFactory {
    private Data data;
    public ConcreteFactory2() {
        // Create 1 data structure whose reference is to be passed to all classes that need it
        data  = new DataGasPump2();

    }
    /*
        Returns the shared data structure that has been instantiated in the constructor
        Appropriate for GasPump2
     */
    @Override
    public Data getDataObj() {
        return this.data;
    }

    /*
        Returns the CancelMsg class that provides the appropriate cancel message action for GasPump2
     */
    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg2();
    }

    /*
        Returns the DisplayMenu class that performs the appropriate action for displaying the menu prompt
        for GasPump2.
        The DisplayMenu class is returned already instantiated with the shared data structure it needs
        to read data from.
     */
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu2(this.data);
    }

    /*
        Returns the GasPumpedMsg class that performs the appropriate action for displaying the message that informs
        the user that a unit of gas has been pumped using GasPump2
        The GasPumpedMsg class is returned already instantiated with the shared data structure it needs
        to read data from.
     */
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg2(this.data);
    }

    /*
        Returns the Payment prompt message action appropriate for GasPump2
     */
    @Override
    public PayMsg getPayMsg() {
        return new PayMsg2();
    }

    /*
        Returns the PrintReceipt class which is responsible for printing the GasPump2 specific receipt
        The PrintReceipt class returned is already instantiated with the shared data structure it needs
     */
    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt2(this.data);
    }

    /*
        Returns the PumpGasUnit class which is responsible to "pumping" a unit of gas for GasPump2
        The PumpGasUnit class returned is already instantiated with the shared data structure it needs
     */
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit2(this.data);
    }

    /*
        Returns the ReadyMsg class which is responsible for prompting the user to start pumping gas
        on GasPump2.
        The returned ReadyMsg class is already instantiated with the shared data structure it needs.
     */
    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg2(this.data);
    }

    /*
        Returns the RejectMsg class that displays the appropriate credit card rejection message for GasPump2
        Since GasPump2 does not support credit card as payment, the returned action strategy method will have an empty body
     */
    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg2();
    }

    /*
        Returns the ReturnCash action object appropriate for GasPump2
        The returned ReturnCash object will already be instantiated with the shared data structure
        that it needs to read and manipulate.
     */
    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash2(this.data);
    }

    /*
        Returns the SetInitialValues class which provides the appropriate action for initializing
        the shared data structure with GasPump2 specific attributes before a gas unit is pumped.
        The returned class is already instantiated with the shared data structure that it needs.
    */
    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues2(this.data);
    }

    /*
        Returns the SetPrice class that is responsible for setting the price of gasoline according to
        specifications of GasPump2 requirements.
        The returned class is already instantiated with the shared data structure that it needs.
    */
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice2(this.data);
    }

    /*
        Returns the StopMsg class which provides the appropriate action
        for displaying a message that informs the user that the gas pump has been stopped
        according to GasPump2 specification requirements.
     */
    @Override
    public StopMsg getStopMsg() {
        return new StopMsg2();
    }

    /*
        Returns the StoreCash class which provides the appropriate action for storing cash
        on GasPump2.
        The returned StoreCash object is already instantiated with the necessary data structure
        that it needs to write into.
     */
    @Override
    public StoreCash getStoreCash() {
        return new StoreCash2(this.data);
    }

    /*
        Returns the StoreData class which provides the appropriate action for storing the gas
        price data for GasPump2
        The returned StoreData object is already instantiated with the shared data structure it needs to
        write into.
     */
    @Override
    public StoreData getStoreData() {
        return new StoreData2(this.data);
    }
    @Override
    public StorePin getStorePin() {
    	return new StorePin2(this.data);
    }
    
    @Override
    public EnterPinMsg getEnterPinMsg() {
    	return new EnterPinMsg2();
    }
    
    @Override
    public WrongPinMsg getWrongPinMsg() {
    	return new WrongPinMsg2();
    }
}
