package AbstractFactory;
import Output.*;
import DataStore.*;


public class ConcreteFactory1 extends AbstractFactory {
    private Data data;

    public ConcreteFactory1() {
        // Create 1 data structure whose reference is to be passed to all classes that need it
        this.data  = new DataGasPump1();
    }

    /*
        Returns the shared data structure that has been instantiated in the constructor
        Appropriate for GasPump1
     */
    @Override
    public Data getDataObj() {
        return this.data;
    }

    /*
        Returns the CancelMsg class that displays the appropriate cancel message action for GasPump1
     */
    @Override
    public CancelMsg getCancelMsg() {
        return new CancelMsg1();
    }

    /*
        Returns the DisplayMenu class that performs the appropriate action for displaying the menu prompt
        for GasPump1.
        The DisplayMenu class is returned already instantiated with the shared data structure it needs
        to read data from.
     */
    @Override
    public DisplayMenu getDisplayMenu() {
        return new DisplayMenu1(this.data);
    }

    /*
        Returns the GasPumpedMsg class that performs the appropriate action for displaying the message that informs
        the user that a unit of gas has been pumped using GasPump1
        The GasPumpedMsg class is returned already instantiated with the shared data structure it needs
        to read data from.
     */
    @Override
    public GasPumpedMsg getGasPumpedMsg() {
        return new GasPumpedMsg1(this.data);
    }

    /*
        Returns the Payment prompt message action appropriate for GasPump1
     */
    @Override
    public PayMsg getPayMsg() {
        return new PayMsg1();
    }

    /*
        Returns the PrintReceipt class which is responsible for printing the GasPump1 specific receipt
        The PrintReceipt class returned is already instantiated with the shared data structure it needs
     */
    @Override
    public PrintReceipt getPrintReceipt() {
        return new PrintReceipt1(this.data);
    }

    /*
        Returns the PumpGasUnit class which is responsible to "pumping" a unit of gas for GasPump1
        The PumpGasUnit class returned is already instantiated with the shared data structure it needs
     */
    @Override
    public PumpGasUnit getPumpGasUnit() {
        return new PumpGasUnit1(this.data);
    }

    /*
        Returns the ReadyMsg class which is responsible for prompting the user to start pumping gas
        on GasPump1.
        The returned ReadyMsg class is already instantiated with the shared data structure it needs.
     */
    @Override
    public ReadyMsg getReadyMsg() {
        return new ReadyMsg1(this.data);
    }

    /*
        Returns the RejectMsg class that displays the appropriate credit card rejection message for GasPump1
     */
    @Override
    public RejectMsg getRejectMsg() {
        return new RejectMsg1();
    }

    /*
        Returns the ReturnCash action object appropriate for GasPump1
        GasPump1 does not support cash as payment,
        and so this action strategy method will have an empty body for GasPump1.
        It also does not need to have a reference to the shared data structure passed in.
     */
    @Override
    public ReturnCash getReturnCash() {
        return new ReturnCash1();
    }

    /*
        Returns the SetInitialValues class which provides the appropriate action for initializing
        the shared data structure with GasPump1 specific attributes before a gas unit is pumped.
        The returned class is already instantiated with the shared data structure that it needs.
     */
    @Override
    public SetInitialValues getSetInitialValues() {
        return new SetInitialValues1(this.data);
    }

    /*
        Returns the SetPrice class that is responsible for setting the price of gasoline according to
        specifications of GasPump1 requirements.
        The returned class is already instantiated with the shared data structure that it needs.
     */
    @Override
    public SetPrice getSetPrice() {
        return new SetPrice1(this.data);
    }

    /*
        Returns the StopMsg class which provides the appropriate action
        for displaying a message that informs the user that the gas pump has been stopped
        according to GasPump1 specification requirements.
     */
    @Override
    public StopMsg getStopMsg() {
        return new StopMsg1();
    }

    /*
        Returns the StoreCash action object appropriate for GasPump1
        GasPump1 does not support cash as payment,
        and so this action strategy method will have an empty body for GasPump1
     */
    @Override
    public StoreCash getStoreCash() {
        return new StoreCash1();
    }

    /*
        Returns the StoreData action strategy class appropriate for storing needed input data in the
        shared data structure for GasPump1.
        The returned class is already instantiated with the appropriate shared data structure that it needs.
     */
    @Override
    public StoreData getStoreData() {
        return new StoreData1(this.data);
    }
    
    @Override
    public StorePin getStorePin() {
    	return new StorePin1(this.data);
    }
    
    @Override
    public EnterPinMsg getEnterPinMsg() {
    	return new EnterPinMsg1();
    }
    
    @Override
    public WrongPinMsg getWrongPinMsg() {
    	return new WrongPinMsg1();
    }
}
