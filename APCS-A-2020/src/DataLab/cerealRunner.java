package DataLab;

import java.util.ArrayList;

public class cerealRunner {
	public static void main(String [] args)
	{
		ArrayList<cereal> clist = new ArrayList<cereal>();
		//100 % bran has the lowest ratio, at 1.25, higher ratios are less healthy
		clist.add(new cereal("100% Bran",5,4));
		clist.add(new cereal("100% Natural Bran",8,3));
		clist.add(new cereal("All-Bran",7,4));
		clist.add(new cereal("All-Bran with Extra Fiber",8,4));
		clist.add(new cereal("Almond Delight",14,2));
		clist.add(new cereal("Apple Cinnamon Cheerios",10,2));
		clist.add(new cereal("Apple Jacks",11,2));
		clist.add(new cereal("Basic 4",18,3));
		clist.add(new cereal("Bran Chex",15,2));
		clist.add(new cereal("Bran Flakes",13,3));
		cereal best = clist.get(0);
		for (cereal i: clist) {
			double ratio = i.getCarbs()/i.getProtein();
			double bestRatio = best.getCarbs()/best.getProtein();
			if (ratio < bestRatio) {
				best = i;
			}
		}
		System.out.println("The best cereal for low carbs and high protein is: " + best);
	}
}