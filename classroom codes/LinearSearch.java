package stud;//package Bank;

public class LinearSearch
{
    public int linearSearch(int arr[], int number)
    {
        for (int i=0; i<arr.length; i++)
        {
            if (arr[i] == number)
            {
                return i;
            }
        }
        return -1; // Return -1 if not found
    }
}

/*
        int[] array = {1, 5, 9, 12, 15, 20};
        int searchNumber = 12;
        stud.LinearSearch search = new stud.LinearSearch();

        int index = search.linearSearch(array, searchNumber);

        if (index != -1)
        {
            System.out.println("Number " + searchNumber + " found at index: " + index);
        }
        else
        {
            System.out.println("Number " + searchNumber + " not found in the array");
        }

         */