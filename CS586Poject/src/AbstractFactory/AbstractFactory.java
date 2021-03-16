package AbstractFactory;

import Output.*;
import DataStore.*;
	/*
    This class groups all ConcreteFactory classes under 1 abstract superclass
    It defines the methods that return the GasPump specific action components which
    all ConcreteFactories need to implement
 */
public abstract class AbstractFactory {

	public abstract Data getDataObj();

	public abstract CancelMsg getCancelMsg();

	public abstract DisplayMenu getDisplayMenu();

	public abstract GasPumpedMsg getGasPumpedMsg();

	public abstract PayMsg getPayMsg();

	public abstract PrintReceipt getPrintReceipt();

	public abstract PumpGasUnit getPumpGasUnit();

	public abstract ReadyMsg getReadyMsg();

	public abstract RejectMsg getRejectMsg();
    
	public abstract ReturnCash getReturnCash();

	public abstract SetInitialValues getSetInitialValues();

	public abstract SetPrice getSetPrice();

	public abstract StopMsg getStopMsg();

	public abstract StoreCash getStoreCash();

	public abstract StoreData getStoreData();
	
	public abstract StorePin getStorePin();
	
	public abstract EnterPinMsg getEnterPinMsg();
	
	public abstract WrongPinMsg getWrongPinMsg();
}
