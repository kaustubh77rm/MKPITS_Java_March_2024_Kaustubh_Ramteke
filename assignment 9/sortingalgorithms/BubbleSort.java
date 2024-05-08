package sortingalgorithms;

public class BubbleSort implements SortingAlgorithm {
    @Override
    public void sort() {
        int i,j;
    int[] arr={11,55,44,22,33};

    for(i=0;i< arr.length;i++)
    {
     for(j=0;j< arr.length;j++)
     {
       if(arr[j]<arr[j+1])
           arr[j]=arr[j+1];
     }
    }
        for( i=0;i< arr.length;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }
}