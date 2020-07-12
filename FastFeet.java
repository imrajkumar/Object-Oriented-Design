package learnjava;

class Bicycle
{
	private double size;
	private String chain;
	private double tireSize;

	Bicycle(double size,String chain,double tireSize )
	{
		this.size=size;
		this.chain=chain;
		this.tireSize=tireSize;
	}
}

class RoadBike extends Bicycle
{
	String tapeColor;

	RoadBike(String tapeColor,double size,String chain,double tireSize)
	{
		super(size,chain,tireSize);
		this.tapeColor=tapeColor;
	}

	String getTapeColor()
	{
		return tapeColor;
	}
}

class MountainBike extends Bicycle
{
	double frontShock;
	double rearShock;

	MountainBike(double frontShock, double rearShock,double size,String chain,double tireSize)
	{
		super(size,chain,tireSize);
		this.frontShock=frontShock;
		this.rearShock=rearShock;
	}

	double mergeShock()
	{
		return frontShock+rearShock;
	}
}

public class FastFeet
{
	public static void main(String[] args) {
		
	}
}