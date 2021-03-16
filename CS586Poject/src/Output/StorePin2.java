package Output;

import DataStore.Data;
import DataStore.DataGasPump2;

/*
    GasPump1 StoreData action responsible for storing the "a" and "b" price parameters specified by
    method "Activate" of the InputProcessor for GasPump1
 */
public class StorePin2 extends StorePin {

    public StorePin2(Data data) {
        super(data);
    }

    /*
        Read the temporary variables "a" and "b" and initialize the gas prices of the system accordingly
     */
    @Override
    public void storePin() {
        DataGasPump2 d = (DataGasPump2) data;
        d.pin = d.p;
        System.out.println("Pin Stored");
    }
}