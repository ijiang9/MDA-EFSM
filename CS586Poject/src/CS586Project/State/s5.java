package CS586Project.State;

class s5 extends state {

    s5(MDA_EFSM model) {
        super(model);
    }

    /*
        Self-loop (No transition) and call PumpGasUnit() and GasPumpedMsg() meta-actions
     */
    @Override
    void pump() {
        if (mda.s == mda.sList[5]) {
            // stay in the same state
        	mda.getOP().PumpGasUnit();
        	mda.getOP().GasPumpedMsg();
        }
    }

    /*
        Transition to State S6 and call StopMsg() meta-action
     */
    @Override
    void stopPump() {
        if (mda.s == mda.sList[5]) {
        	mda.s = mda.sList[6];
        	mda.getOP().StopMsg();
        }
    }
}