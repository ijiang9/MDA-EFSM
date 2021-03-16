package CS586Project.State;
import AbstractFactory.*;
import Output.*;

public class output {
    private CancelMsg cancelMsg;
    private DisplayMenu displayMenu;
    private GasPumpedMsg gasPumpedMsg;
    private PayMsg payMsg;
    private PrintReceipt printReceipt;
    private PumpGasUnit pumpGasUnit;
    private ReadyMsg readyMsg;
    private RejectMsg rejectMsg;
    private ReturnCash returnCash;
    private SetInitialValues setInitialValues;
    private SetPrice setPrice;
    private StopMsg stopMsg;
    private StoreCash storeCash;
    private StoreData storeData;
    private EnterPinMsg enterPinMsg;
    private WrongPinMsg wrongPinMsg;
    private StorePin storePin;

    public output(AbstractFactory af) {
        this.cancelMsg = af.getCancelMsg();
        this.displayMenu = af.getDisplayMenu();
        this.gasPumpedMsg = af.getGasPumpedMsg();
        this.payMsg = af.getPayMsg();
        this.printReceipt = af.getPrintReceipt();
        this.pumpGasUnit = af.getPumpGasUnit();
        this.readyMsg = af.getReadyMsg();
        this.rejectMsg = af.getRejectMsg();
        this.returnCash = af.getReturnCash();
        this.setInitialValues = af.getSetInitialValues();
        this.setPrice = af.getSetPrice();
        this.stopMsg = af.getStopMsg();
        this.storeCash = af.getStoreCash();
        this.storeData = af.getStoreData();
        this.enterPinMsg = af.getEnterPinMsg();
        this.wrongPinMsg = af.getWrongPinMsg();
        this.storePin = af.getStorePin();
    }

    /*
     *  Meta-actions (implemented using Strategy pattern)
     */

    public void CancelMsg() {
        this.cancelMsg.cancelMsg();
    }

    public void DisplayMenu() {
        this.displayMenu.displayMenu();
    }

    public void GasPumpedMsg() {
        this.gasPumpedMsg.gasPumpedMsg();
    }

    public void PayMsg() {
        this.payMsg.payMsg();
    }

    public void PrintReceipt() {
        this.printReceipt.printReceipt();
    }

    public void PumpGasUnit() {
        this.pumpGasUnit.pumpGasUnit();
    }

    public void ReadyMsg() {
        this.readyMsg.readyMsg();
    }

    public void RejectMsg() {
        this.rejectMsg.rejectMsg();
    }

    public void ReturnCash() {
        this.returnCash.returnCash();
    }

    public void SetInitialValues() {
        this.setInitialValues.setInitialValues();
    }

    public void SetPrice(int g) {
        this.setPrice.setPrice(g);
    }

    public void StopMsg() {
        this.stopMsg.stopMsg();
    }

    public void StoreCash() {
        this.storeCash.storeCash();
    }

    public void StoreData() {
        this.storeData.storeData();
    }
    public void EnterPinMsg() {
    	this.enterPinMsg.enterPinMsg();
    }
    public void StorePin() {
    	this.storePin.storePin();
    }
    public void WrongPinMsg() {
    	this.wrongPinMsg.wrongPinMsg();
    }

}