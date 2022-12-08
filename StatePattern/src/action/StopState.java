package action;

import context.Context;
import state.State;

public class StopState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is stop state");
		context.setState(this);
	}

}
