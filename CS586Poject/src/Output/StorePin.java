package Output;

import DataStore.Data;

/*
    Abstract StoreData action strategy
    Groups all "Store Data" actions under 1 abstract superclass
 */
public abstract class StorePin {
    Data data;

    public StorePin(Data data) {
        this.data = data;
    }

    public abstract void storePin();
}