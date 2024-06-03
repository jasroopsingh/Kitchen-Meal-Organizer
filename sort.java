import java.util.List;

public class sort 
{
    //Bubble sort for sorting ingredients by quantity.
    public static void bubbleSort(List<Ingredient> quantitySortList, int n)
    {
        int count = 0;

        for (int i = 0; i < n-1; i++)
            // in quantitySortList, gets the quantity and amount of the item at position i & i + 1 and compares it
            if(quantitySortList.get(i).getQuantity().getAmount() > quantitySortList.get(i + 1).getQuantity().getAmount())
            {
                Ingredient temp = quantitySortList.get(i);
                quantitySortList.set(i, quantitySortList.get(i + 1));
                quantitySortList.set(i + 1, temp);
                    count = count + 1;
            }

            if (count == 0)
                return;
            bubbleSort(quantitySortList, n-1);
    }
}
