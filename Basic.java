package learnjava;


class Gear
{
	private int chainring;
	private int cog;

	Gear(int chainring, int cog)
	{
		this.chainring=chainring;
		this.cog=cog;
	}

	double getRatio()
	{
		return chainring/(double)cog;
	}
}

class Basic
{
	public static void main(String[] args) {
		Gear g1 = new Gear(52,11);
		double ratio = g1.getRatio();
		System.out.println(ratio);
	}
}