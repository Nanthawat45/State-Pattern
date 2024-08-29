
public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine = gumballMachine;
	}
	

	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't insert a quarter, the machine is sold out");
	}

	
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("You can't eject, you haven't inserted a quarter yet");
	}

	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("You turned, but there are no gumballs");
	}

	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("No gumball dispensed");
	}

}
