package GasPump;

import AbstractFactory.AbstractFactory;
import DataStore.DataGasPump2;

/*
    This class is the InputProcessor for GasPump2
 */
public class GasPump2 extends GasPump {
    public GasPump2(AbstractFactory af) {
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
                        "\n(0) Activate(int a, int b, int c)" +
                        "\n(1) Start " +
                        "(2) PayCash " +
                        "(3) PayCredit " +
                        "(4) Approve " +
                        "(5) Reject " +
                        "\n(6) Regular " +
                        "(7) Super " +
                        "(8) Premium " +
                        "(9) Cancel " +
                        "\n(10) StartPump " +
                        "(11) PumpLiter " +
                        "(12) Stop " +
                        "\n(p) PrintReceipt " +
                        "(n) NoReceipt " +
                        "(q) Quit the program " +
                        "\n*********************************************************************"
        );
    }

    /*
        Check the input parameters for correctness, and call the
        activate() meta-event of the EFSM model
        If input is incorrect, print a message indicating as such
        @param a: price of Regular gas
        @param b: price of Super gas
        @param c: price of Premium gas
     */
    public void Activate(int a, int b, int c) {
        if (a > 0 && b > 0 && c > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.a = a;
            d.b = b;
            d.c = c;
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
        After checking input parameter for correctness,
        call the payType() meta-event of the EFSM model,
        passing in "2" as the payment type which represents cash payment under the model design
        If amount of cash inserted is less than zero, do not call the meta-event
        and print a message indicating input parameter requirements
     */
    public void PayCash(float cash) {
        if (cash > 0) {
            DataGasPump2 d = (DataGasPump2) data;
            d.temp_cash = cash;
            model.PayType(2);
        } else {
            System.out.println("Cash amount must be greater than $0");
        }
    }
    
    public void PayCredit() {
        model.PayType(1);
        System.out.println("PLEASE WAIT -- AUTHENTICATING CREDIT CARD");
    }
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
    public void Super() {
        model.SelectGas(2);
    }

    /*
        Call the selectGas() meta-event of the EFSM model,
        passing in 3 as the gas-type
     */
    public void Premium() {
        model.SelectGas(3);
    }

    /*
        Call the startPump() meta-event of the EFSM model
     */
    public void StartPump() {
        model.StartPump();
    }

    /*
        First, check the shared data structure for remaining amount of cash
        If there is not enough cash to pump another liter, print a message indicating as such,
        and call the stopPump() meta-event of the EFSM model
        Otherwise, call the pump() meta-event of the EFSM model
     */
    public void PumpLiter() {
        DataGasPump2 d = (DataGasPump2) data;
        if (d.cash < d.price * (d.L + 1)) {
            System.out.println("NOT ENOUGH CASH");
            model.StopPump();
        } else {
            model.Pump();
        }
    }

    /*
        Call the stopPump() meta-event of the EFSM model
     */
    public void Stop() {
        model.StopPump();
    }

    /*
        Call the receipt() meta-event of the EFSM model
     */
    public void Receipt() {
        model.Receipt();
    }

    /*
        Call the noReceipt() meta-event of the EFSM model
     */
    public void NoReceipt() {
        model.NoReceipt();
    }
}