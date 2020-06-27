package utils;

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
    
    public static void swapValues(final int[] array, final int firstIndex, final int secondIndex)
    {
        if(firstIndex == secondIndex)
        {
            return;
        }
        
        final int currentValue = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = currentValue;
    }
}
