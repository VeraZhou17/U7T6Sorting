import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {-21, -5, -4, 0, 5, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100, 120, 135, 140};
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {-21, -5, -4, 0, 5, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100, 120, 135, 140};
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));
  }
}
