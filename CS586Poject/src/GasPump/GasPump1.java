package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.DataGasPump1;

/*
    This class is the InputProcessor for GasPump1
 */
public class GasPump1 extends GasPump {
    public GasPump1(AbstractFactory af) {
        super(af);
    }

    /*
        Print a menu of supported operations
     */
    @Override
    public void printOperations() {
        System.out.println(
                        "*********************************************************************" +
                        "\nSelect operation: " +
                        "\n(0) Activate(float a, float b) " +
                        "\n(1) Start " +
                        "(2) PayCredit " +
                        "(3) PayDebit " +
                        "(4) Approve " +
                        "(5) Reject " +
                        "(6) Pin " +
                        "\n(7) Regular " +
                        "(8) Diesel " +
                        "(9) Cancel " +
                        "\n(10) StartPump " +
                        "(11) PumpGallon " +
                        "(12) FullTank " +
                        "(x) StopPump " +
                        "{q} Quit the program " +
                        "\n*********************************************************************"
        );
    }

    /*
        Check the input parameters for correctness, and call the
        activate() meta-event of the EFSM model
        If input is incorrect, print a message indicating as such
        @param a: price of Regular gas
        @param b: price of Super gas1
     */
    public void Activate(float a, float b) {
        if (a > 0 && b > 0) {
            DataGasPump1 d = (DataGasPump1) this.data;
            d.a = a;
            d.b = b;
            model.Activate();
        } else {
            System.out.println("Activation failed!");
            System.out.println("Prices must be greater than $0");
        }
    }

    /*
        Call the start() meta-event of the EFSM model
     */
    public void Start() {
        model.Start();
    }

    /*
        Call the payType() meta-event of the EFSM model,
        passing in "1" as the payment type which represents credit payment under the model design
        Also print a credit card authentication message
     */
    public void PayCredit() {
        model.PayType(1);
        System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
    }
    
    public void PayDebit(String p) {
    	DataGasPump1 d = (DataGasPump1) this.data;
    	d.p = p;
    	model.PayType(3);
    }
    
    public void Pin(String p) {
    	DataGasPump1 d = (DataGasPump1) this.data;
    	if (p.equals(d.pin)) model.CorrectPin();
    	else model.IncorrectPin();
    }

    /*
        Call the approve() meta-event of the EFSM model
     */
    public void Approve() {
        model.Approved();
    }

    /*
        Call the reject() meta-event of the EFSM model
     */
    public void Reject() {
        model.Reject();
    }

    /*
        Call the cancel() meta-event of the EFSM model
     */
    public void Cancel() {
        model.Cancel();
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 1 as the gas-type
     */
    public void Regular() {
        model.SelectGas(1);
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 2 as the gas-type
     */
    public void Diesel() {
        model.SelectGas(4);
    }

    /*
        Call the startPump() meta-event of the EFSM model
     */
    public void StartPump() {
        model.StartPump();
    }

    /*
        Call the pump() meta-event of the EFSM model
     */
    public void PumpGallon() {
        model.Pump();
    }

    /*
        call the stopPump() and receipt() meta-events of the EFSM model
        Note: GasPump1 always prints receipts after fuel is finished dispensing under current
        system design.
     */
    public void StopPump() {
        model.StopPump();
        model.Receipt();
    }
    
    public void FullTank() {
    	model.StopPump();
        model.Receipt();
    }
    
}