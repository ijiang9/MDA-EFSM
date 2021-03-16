package CS586Project.State;

class InitState extends state {

    InitState(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S0 and call the StoreData() meta-action
     */
    @Override
    void activate() {
        if (mda.s == mda.sList[7]) {
        	mda.s = mda.sList[0];
        	mda.getOP().StoreData();
        }
    }
}