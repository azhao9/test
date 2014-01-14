package projects.dancingBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class DancingBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();
		int[] moves = {1, 2, 3, 4, 5, 6, 7, 8};
		DancingBug alice = new DancingBug(moves);
		world.add(new Location(4, 4), alice);
		world.show();
	}
}
