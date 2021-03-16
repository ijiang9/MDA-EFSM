package CS586Project.State;

class s4 extends state {

    s4(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S5 and call SetInitialValues() and ReadyMsg() meta-actions
     */
    @Override
    void startPump() {
        if (mda.s == mda.sList[4]) {
        	mda.s = mda.sList[5];
        	mda.getOP().SetInitialValues();
        	mda.getOP().ReadyMsg();
        }
    }
}