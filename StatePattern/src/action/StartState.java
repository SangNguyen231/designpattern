package action;

import context.Context;
import state.State;

public class StartState implements State{

	@Override
	public void doAction(Context context) {
		System.out.println("Player is start state");
		context.setState(this);
	}

}
