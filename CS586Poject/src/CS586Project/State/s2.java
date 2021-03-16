package CS586Project.State;

class s2 extends state {

    s2(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S3 and call DisplayMenu() meta-action
     */
    @Override
    void approve() {
        if (mda.s == mda.sList[2]) {
        	mda.s = mda.sList[3];
        	mda.getOP().DisplayMenu();
        }
    }

    /*
        Transition to State S0 and call RejectMsg() meta-action
     */
    @Override
    void reject() {
        if (mda.s == mda.sList[2]) {
        	mda.s = mda.sList[0];
        	mda.getOP().RejectMsg();
        }
    }
}