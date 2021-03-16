package Output;

import DataStore.Data;
import DataStore.DataGasPump1;

/*
    GasPump1 GasPumpedMsg action responsible for printing a message that gasoline has been pumped
 */
public class GasPumpedMsg1 extends GasPumpedMsg {

    public GasPumpedMsg1(Data data) {
        super(data);
    }

    /*
        Print a message informing the user that 1 gallon of gasoline
        has been pumped. Also display total number of gallons pumped.
     */
    @Override
    public void gasPumpedMsg() {
        DataGasPump1 d = (DataGasPump1) data;
        System.out.println("Pumped 1 gallon of " + d.gasType + " gasoline");
        System.out.println("Total # of gallons pumped: " + d.G);
    }

}