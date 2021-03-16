package CS586Project.State;

public abstract class state {
	MDA_EFSM	mda;
	
	public state(MDA_EFSM model) {
        this.mda = model;
    }
    void activate()         {notAllowed();}
    void start()            {notAllowed();}

    /*
        credit: t=1
        cash:   t=2
        debit:	t=3
     */
    void payType(int t)     {notAllowed();}
    void approve()          {notAllowed();}
    void reject()           {notAllowed();}
    /*
        Regular:    g=1
        Super:      g=2
        Premium:    g=3
        Diesel:		g=4
     */
    void selectGas(int g)   {notAllowed();}
    void cancel()           {notAllowed();}
    void startPump()        {notAllowed();}
    void pump()             {notAllowed();}
    void stopPump()         {notAllowed();}
    void receipt()          {notAllowed();}
    void noReceipt()        {notAllowed();}
    void correctPin()		{notAllowed();}
    void incorrectPin()		{notAllowed();}
    
    /*
        Print a "not allowed" message
     */
    private void notAllowed() {
        System.out.println("OPERATION NOT ALLOWED IN THIS STATE");
    }
}