package bubble;

import java.util.Arrays;
import java.util.Objects;

import utils.Util;

public class Bubble
{
    
    public static void main(final String[] args)
    {
        final int[] valuesToSort = Util.createUnsortedArray();
        sort(valuesToSort);
        System.out.println(Arrays.toString(valuesToSort));
    }
    
    /*
    How bubble sort works:
        Go from the left to right
        Example: [20, 35, -15, 6]
            - compare 20 with 35
            - compare 35 with -15
                - 35 is bigger than -15, so we swap them
            - compare 35 with 6
                - 35 is bigger than -15, so we swap them
            - repeat
     */
    private static void sort(final int[] arrayToSort)
    {
        if(Objects.isNull(arrayToSort) || arrayToSort.length <= 1)
        {
            return;
        }
    
        for (int lastIndex = arrayToSort.length - 1; lastIndex > 0; --lastIndex)
        {
            for (int firstIndex = 0; firstIndex < lastIndex; ++firstIndex)
            {
                final int nextPosition = firstIndex + 1;
                if(arrayToSort[firstIndex] > arrayToSort[nextPosition])
                {
                    Util.swapValues(arrayToSort, firstIndex, nextPosition);
                }
            }
        }
    }
}
