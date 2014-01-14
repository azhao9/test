package projects.zBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		ZBug alice = new ZBug(4);
		alice.setDirection(90);
		world.add(new Location(1, 5), alice);
		world.show();
	}

}
