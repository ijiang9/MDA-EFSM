package CS586Project.State;

class s6 extends state {

    s6(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S0 and call PrintReceipt() and ReturnCash() meta-actions
     */
    @Override
    void receipt() {
        if (mda.s == mda.sList[6]) {
        	mda.s = mda.sList[0];
        	mda.getOP().PrintReceipt();
            mda.getOP().ReturnCash();
        }
    }

    /*
        Transition to State S0 and call ReturnCash() meta-actions
     */
    @Override
    void noReceipt() {
        if (mda.s == mda.sList[6]) {
        	mda.s = mda.sList[0];
        	mda.getOP().ReturnCash();
        }
    }
}