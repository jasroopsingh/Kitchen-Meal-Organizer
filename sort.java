public class sort 
{
    //Bubble sort for sorting ingredients by quantity.
    public static void bubbleSort(Quantity list[], int n)
    {
        int count = 0;

        for (int i = 0; i < n-1; i++)
            if(list[i].getAmount() > list[i + 1].getAmount())
            {
                Quantity temp = list[i];
                list[i] = list[i + 1];
                list[i + 1] = temp;
                    count = count + 1;
            }

            if (count == 0)
                return;
            bubbleSort(list, n-1);
    }
}
