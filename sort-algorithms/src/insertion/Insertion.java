package insertion;

import java.util.Arrays;
import java.util.Objects;

import utils.Util;

public class Insertion
{
    
    public static void main(final String[] args)
    {
        final int[] valuesToSort = Util.createUnsortedArray();
        sort(valuesToSort);
        System.out.println(Arrays.toString(valuesToSort));
    }
    
    /*
    We peek the value and we compare with left values.
    While the value is at left is higher than the value, we swap the values and we compare until the end or the value at left is less
    than the value we are comparing
     */
    private static void sort(final int[] arrayToSort)
    {
        if(Objects.isNull(arrayToSort) || arrayToSort.length <= 1)
        {
            return;
        }
        
        for (int index = 1; index < arrayToSort.length; ++index)
        {
            final int value = arrayToSort[index];
            for (int swapIndex = index - 1; swapIndex >= 0; --swapIndex)
            {
                if(arrayToSort[swapIndex] > value)
                {
                    arrayToSort[swapIndex + 1] = arrayToSort[swapIndex];
                } else
                {
                    arrayToSort[swapIndex + 1] = value;
                    break;
                }
                
                if(swapIndex == 0)
                {
                    arrayToSort[swapIndex] = value;
                }
            }
        }
    }
}
