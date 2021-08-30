package counting;

import java.util.Arrays;
import java.util.Objects;

import utils.RangeData;
import utils.Util;

public class Counting
{

    public static void main(final String[] args)
    {
        final RangeData rangeData = Util.createUnsortedArrayWithPositiveNumbersAndRange();
        final int[] unsortedArray = rangeData.getUnsortedArray();
        for (int i = 0; i < unsortedArray.length; ++i)
        {
            System.out.println(i + " - " + unsortedArray[i]);
        }

        final int[] count = count(rangeData);

        for (int i = 0; i < count.length; ++i)
        {
            System.out.println("index: " + (i + rangeData.getLowest()) + " - Real index: " + i + " - " + count[i]);
        }
    }

    /*
    How counting sort works:
        We need to know the range and it needs to be all positive number. Start in 1
        We create an array with the range
        we iterate the array and with the value, we increment in 1 the position (value) on the new array
     */
    private static int[] count(final RangeData rangeData)
    {
        if (Objects.isNull(rangeData) || Objects.isNull(rangeData.getUnsortedArray()) || rangeData.getUnsortedArray().length <= 1)
        {
            return new int[] {};
        }

        final int[] newArray = new int[rangeData.getHighest() - rangeData.getLowest() + 1];
        final int[] unsortedArray = rangeData.getUnsortedArray();

        Arrays.stream(unsortedArray).forEach(value -> newArray[value - rangeData.getLowest()]++);

        return newArray;
    }

}
