package CS586Project.State;

class s1 extends state {

    s1(MDA_EFSM model) {
        super(model);
    }

    /*
        credit: t=1
            Transition to State S2
            No meta-action called
        cash:   t=2
            Transition to State S3
            Call StoreCash() and DisplayMenu() meta-actions
        Debit:  t=3
        	Transition to State S8
        	Call StorePin() and EnterPinMsg() meta-actions
     */
    @Override
    void payType(int t) {
        if ((t == 1) && (mda.s == mda.sList[1])) {
        	mda.s = mda.sList[2];
        } else if ((t == 2) && (mda.s == mda.sList[1])) {
        	mda.s = mda.sList[3];
        	mda.getOP().StoreCash();
        	mda.getOP().DisplayMenu();
        } else if ((t == 3) && (mda.s == mda.sList[1])) {
        	mda.s = mda.sList[8];
        	mda.getOP().StorePin();
        	mda.getOP().EnterPinMsg();
        }
    }
}