
public class SoldState implements State {
	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Please wait, we're already giving you a gumball");
	}

	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("Sorry, you already turned the crank");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("Turning twice doesn't get you another gumball!");
	}

	
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if(gumballMachine.getCount() > 0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}else{
			System.out.println("Oops, out of gumballs!");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
	}

}
