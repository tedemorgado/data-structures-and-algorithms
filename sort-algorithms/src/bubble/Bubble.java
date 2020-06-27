package bubble;

import java.util.Arrays;

public class Bubble
{
    
    public static void main(final String[] args)
    {
        final int[] valuesToSort = createArray();
        bubbleSort(valuesToSort);
        System.out.println(Arrays.toString(valuesToSort));
    }
    
    private static int[] createArray()
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
    private static void bubbleSort(final int[] arrayToSort)
    {
        for (int lastIndex = arrayToSort.length - 1; lastIndex > 0; --lastIndex)
        {
            for (int firstIndex = 0; firstIndex < lastIndex; ++firstIndex)
            {
                final int nextPosition = firstIndex + 1;
                if(arrayToSort[firstIndex] > arrayToSort[nextPosition])
                {
                    swapValues(arrayToSort, firstIndex, nextPosition);
                }
            }
        }
    }
    
    private static void swapValues(final int[] array, final int firstIndex, final int secondIndex)
    {
        final int currentValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = currentValue;
    }
}
