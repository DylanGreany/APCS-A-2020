package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int even = 0;
		for(int i=1; i < ray.length; i++) {
			if (ray[i] % 2 == 1) {
				even = i;
				for(int x=1; x < ray.length; x++) {
					if (ray[x] % 2 == 0) {
						return Math.abs(even - x) + 1;
					}
				}
			}
		}
		return -1;
	}
}