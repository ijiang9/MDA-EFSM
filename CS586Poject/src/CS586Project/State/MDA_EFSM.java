package CS586Project.State;
import CS586Project.State.output;

public class MDA_EFSM {
	public state s;
	public state[] sList;
	public output op;
	
	public MDA_EFSM()
	{
		sList = new state[9];
		
		sList[7] = new InitState(this);
		sList[0] = new s0(this);
		sList[1] = new s1(this);
		sList[2] = new s2(this);
		sList[3] = new s3(this);
		sList[4] = new s4(this);
		sList[5] = new s5(this);
		sList[6] = new s6(this);
		sList[8] = new s8(this);
		s = sList[7];
	}
	
	public output getOP() {
		return op;
	}
	
	public void setOP(output op) {
        this.op = op;
    }
	
	public void changeState(int state)
	{
		s = sList[state];
	}
	public void Activate()
	{
		s.activate();
	}
	public void Start()
	{
		s.start();
	}
	public void PayType(int t)
	{
		s.payType(t);
	}
	public void Reject()
	{
		s.reject();
	}
	public void Cancel()
	{
		s.cancel();
	}
	public void Approved()
	{
		s.approve();
	}
	public void SelectGas(int g)
	{
		s.selectGas(g);
	}
	public void StartPump()
	{
		s.startPump();
	}
	public void Pump()
	{
		s.pump();
	}
	public void StopPump()
	{
		s.stopPump();
	}
	public void Receipt()
	{
		s.receipt();
	}
	public void NoReceipt()
	{
		s.noReceipt();
	}
	public void CorrectPin()
	{
		s.correctPin();
	}
	public void IncorrectPin()
	{
		s.incorrectPin();
	}

}