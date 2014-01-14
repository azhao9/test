package projects.dancingBug;

import info.gridworld.actor.Bug;

public class DancingBug extends Bug
{
	private int[] turns;
	private int index;

	public DancingBug(int[] directions)
	{
		turns = directions;
		index = 0;
	}

	public void act()
	{
		if (canMove())
			for (int i = 0; i < turns[index % turns.length]; i++)
				turn();

		move();
		index++;
	}
}
