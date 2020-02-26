package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int first = ray.get(0);
		int total = 0;
		for (int i = 0; i < ray.size(); i++) {
			if(ray.get(i) > first) {
				total += ray.get(i);
			}
		}
		if (total == 0 || ray.size() < 1)
			return -1;
		else
			return total;
		
	}
}