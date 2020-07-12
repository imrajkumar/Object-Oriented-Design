package learnjava;

class Wheel
{
	private double rim;
	private double tire;

	Wheel(double rim, double tire)
	{
		this.rim =rim;
		this.tire=tire;
	}

	double getDiameter()
	{
		return rim+(tire*2);
	}
	double getCircumference()
	{
		return getDiameter()*3.14;
	}
}

class Gear extends Wheel
{
	private int chainring;
	private int cog;
	

	Gear(int chainring, int cog,double rim, double tire)
	{
		super(rim,tire);
		this.chainring=chainring;
		this.cog=cog;
	}

	double getRatio()
	{
		return chainring/(double)cog;
	}

	double getGearInches()
	{
		return(getRatio()*(getDiameter()));
	}
}

public class Basic
{
	public static void main(String[] args) {
		Gear g1 = new Gear(52,11,26,1.5);
		double GI = g1.getGearInches();
		System.out.println(GI);
	}
}