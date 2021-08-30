package utils;

public class RangeData
{

	private final int lowest;
	private final int highest;
	private final int[] unsortedArray;

	public RangeData(final int min, final int max, final int[] array)
	{
		this.lowest = min;
		this.highest = max;
		this.unsortedArray = array;
	}

	public int getLowest()
	{
		return lowest;
	}

	public int getHighest()
	{
		return highest;
	}

	public int[] getUnsortedArray()
	{
		return unsortedArray;
	}

}
