package CS586Project.State;

class s3 extends state {

    s3(MDA_EFSM model) {
        super(model);
    }

    /*
        Transition to State S4 and call SetPrice() meta-action
     */
    @Override
    void selectGas(int g) {
        if (mda.s == mda.sList[3]) {
        	mda.s = mda.sList[4];
        	mda.getOP().SetPrice(g);
        }
    }

    /*
        Transition to State S0 and call CancelMsg() and ReturnCash() meta-actions
     */
    @Override
    void cancel() {
        if (mda.s == mda.sList[3]) {
        	mda.s = mda.sList[0];
        	mda.getOP().CancelMsg();
        	mda.getOP().ReturnCash();
        }
    }
}