package selection;

import java.util.Arrays;
import java.util.Objects;

import utils.Util;

public class Selection
{
    
    public static void main(final String[] args)
    {
        final int[] valuesToSort = Util.createUnsortedArray();
        sort(valuesToSort);
        System.out.println(Arrays.toString(valuesToSort));
    }
    
    /*
    How selection works:
    Go from the left to right
        Example: [20, 35, -15, 6]
            - find the biggest value and save the index
            - swap the index found with the last index
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
            int indexOfHighestValue = 0;
            for (int index = 1; index <= lastIndex; ++index)
            {
                if(arrayToSort[index] > arrayToSort[indexOfHighestValue])
                {
                    indexOfHighestValue = index;
                }
            }
            Util.swapValues(arrayToSort, indexOfHighestValue, lastIndex);
        }
    }
}
