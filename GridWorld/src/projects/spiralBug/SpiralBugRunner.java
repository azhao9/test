package projects.spiralBug;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;
import java.awt.Color;
import projects.spiralBug.SpiralBug;

public class SpiralBugRunner
{
	public static void main(String[] args)
	{
		ActorWorld world = new ActorWorld();

		SpiralBug alice = new SpiralBug(2);
		alice.setColor(Color.ORANGE);
		world.add(new Location(5,5), alice);
		world.show();

	}

}
