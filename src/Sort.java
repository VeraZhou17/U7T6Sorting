import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int count = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        count++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Selection sort, number of iterations: " + count);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int count = 0;
    for (int j = 1; j < elements.length; j++)
    {
      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        count++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Insertion sort, number of iterations: " + count);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int count = 0;

    for (int j = 0; j < words.size() - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < words.size(); k++)
      {
        count++;
        if (words.get(k).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = k;

        }
      }
      String temp1 = words.get(j);
      temp1 = words.get(minIndex);

      String temp2 = words.get(minIndex);
      temp2 = temp1;
    }
    System.out.println("Selection sort, number of iterations: " + count);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {    
    int count = 0;
    for (int j = 1; j < words.size(); j++)
    {
      String temp1 = words.get(j);
      int possibleIdx = j;
      String temp2 = words.get(possibleIdx);

      while (possibleIdx > 0 && temp2.compareTo(words.get(j - 1)) < 0)
      {
        count++;
        temp2 = words.get(possibleIdx - 1);
        possibleIdx--;
      }

      temp2 = temp1;
    }
    System.out.println("Insertion sort, number of iterations: " + count);
  }
}