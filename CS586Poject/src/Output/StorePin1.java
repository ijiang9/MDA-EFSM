package Output;

import DataStore.*;


/*
    GasPump1 StoreData action responsible for storing the "a" and "b" price parameters specified by
    method "Activate" of the InputProcessor for GasPump1
 */
public class StorePin1 extends StorePin {

    public StorePin1(Data data) {
        super(data);
    }

    /*
        Read the temporary variables "a" and "b" and initialize the gas prices of the system accordingly
     */
    @Override
    public void storePin() {
        DataGasPump1 d = (DataGasPump1) data;
        d.pin = d.p;
        System.out.println("Pin Stored");
    }
}
