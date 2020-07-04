package shell;

import java.util.Arrays;
import java.util.Objects;

import utils.Util;

public class Shell
{
    
    public static void main(final String[] args)
    {
        final int[] valuesToSort = Util.createUnsortedArray();
        sort(valuesToSort);
        System.out.println(Arrays.toString(valuesToSort));
    }
    
    /*
     with a gap swap the gap value and increment
     1 - create a gap with length/2
     2 - start performing the cycle starting on gap and incrementing it by 1
     3 - compare the index with the index-gap and swap if needed
        decrease the index to index-gap and repeat the 2
     4 - continue the cycle on 2
     5 - decrease the gap to gap/2 and repeat all
     
     */
    private static void sort(final int[] arrayToSort)
    {
        if(Objects.isNull(arrayToSort) || arrayToSort.length <= 1)
        {
            return;
        }
        
        for (int gap = arrayToSort.length / 2; gap > 0; gap /= 2)
        {
            for (int indexFromGap = gap; indexFromGap < arrayToSort.length; ++indexFromGap)
            {
                for (int idx = indexFromGap; idx > 0; idx -= gap)
                {
                    final int back = idx - gap;
                    if(back >= 0 && arrayToSort[idx] < arrayToSort[back])
                    {
                        final int temp = arrayToSort[idx];
                        arrayToSort[idx] = arrayToSort[back];
                        arrayToSort[back] = temp;
                    }
                }
            }
        }
    }
}
