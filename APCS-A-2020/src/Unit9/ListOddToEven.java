package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		for(int i=0; i < ray.size(); i++) {
			if (ray.get(i) % 2 == 1) {
				for(int x = ray.size() - 1; x > 0; x--) {
					if (ray.get(x) % 2 == 0) {
						return Math.abs(i - x);
					}
				}
			}
		}
		return -1;
	}
}