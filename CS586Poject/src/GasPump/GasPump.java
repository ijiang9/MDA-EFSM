package GasPump;

import AbstractFactory.AbstractFactory;
import CS586Project.State.*;
import DataStore.Data;

/*
    This abstract superclass implements the client-side of the Abstract Factory design pattern.
    It provides a constructor which subclasses can use to build up their drivers and necessary objects.
    Each child GasPump class will call this superclass's constructor passing in its own ConcreteFactory
    as the AbstractFactory field. The ConcreteFactory class makes sure each returned object has the proper
    object references
*/

public abstract class GasPump {
    Data data;
    MDA_EFSM model;


    GasPump(AbstractFactory af) {
        this.data = af.getDataObj();
        this.model = new MDA_EFSM();
        this.model.setOP(new output(af));
    }

    /*
        Each GasPump must display a menu of its supported operations
     */
    public abstract void printOperations();

}
