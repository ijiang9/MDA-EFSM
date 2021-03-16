package CS586Project.State;

class s8 extends state {

    s8(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S0 and call IncorrectPin() and CorrectPin() meta-actions
     */
    @Override
    void incorrectPin() {
        if (mda.s == mda.sList[8]) {
        	mda.s = mda.sList[0];
        	mda.getOP().WrongPinMsg();
        }
    }

    /*
        Transition to State S3
     */
    @Override
    void correctPin() {
        if (mda.s == mda.sList[8]) {
        	mda.s = mda.sList[3];
        	mda.getOP().DisplayMenu();
        }
    }
}