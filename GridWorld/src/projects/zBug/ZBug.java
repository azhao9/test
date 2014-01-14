package projects.zBug;

import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
	private int steps;
	private int sideLength;
	private final int totalSteps;
	private int stepsTaken;

	public ZBug(int length)
	{
		steps = 0;
		stepsTaken = 0;
		sideLength = length;
		totalSteps = 3 * sideLength;
	}

	public void act()
	{
		if (stepsTaken < totalSteps)
		{
			if (steps < sideLength && canMove())
			{
				move();
				steps++;
				stepsTaken++;
			}
			else if (this.getDirection() < 180)
			{
				turn();
				turn();
				turn();
				steps = 0;
			}
			else
			{
				turn();
				turn();
				turn();
				turn();
				turn();
				steps = 0;
			}
		}
	}
}
