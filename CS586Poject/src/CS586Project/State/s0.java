package CS586Project.State;

class s0 extends state {

    s0(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S1 and call the PayMsg() meta-action
     */
    @Override
    void start() {
        if (mda.s == mda.sList[0]) {
        	mda.s = mda.sList[1];
        	mda.getOP().PayMsg();
        }
    }
}