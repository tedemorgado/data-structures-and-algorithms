package utils;

import java.util.Random;

public class Util
{

    public static int[] createUnsortedArray()
    {
        final int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        return intArray;
    }

    public static RangeData createUnsortedArrayWithPositiveNumbersAndRange()
    {
        final int[] array = new Random().ints(1, 100).limit(25).toArray();
        return new RangeData(1, 100, array);
    }

    public static void swapValues(final int[] array, final int firstIndex, final int secondIndex)
    {
        if (firstIndex == secondIndex)
        {
            return;
        }

        final int currentValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = currentValue;
    }
}
