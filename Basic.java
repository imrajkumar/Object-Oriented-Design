package learnjava;


class Gear
{
	private int chainring;
	private int cog;
	private double rimDiameter;
	private double tireDiameter;

	Gear(int chainring, int cog,double rimDiameter, double tireDiameter)
	{
		this.chainring=chainring;
		this.cog=cog;
		this.rimDiameter =rimDiameter;
		this.tireDiameter=tireDiameter;
	}

	double getRatio()
	{
		return chainring/(double)cog;
	}

	double getGearInches()
	{
		return(getRatio()*(rimDiameter+(tireDiameter*2)));
	}
}

class Basic
{
	public static void main(String[] args) {
		Gear g1 = new Gear(52,11,26,1.5);
		double GI = g1.getGearInches();
		System.out.println(GI);
	}
}