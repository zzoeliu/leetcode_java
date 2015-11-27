package sort;

/**
 * Created by ZoeLiu on 7/29/15.
 */
public class MergeSort2 {
    public int[] mergeSort(int[] array) {
        // Write your solution here.
        if(array==null || array.length<=1) return array;
        //int[] results=new int[array.length];
        sort(array,0,array.length-1);
        return array;
    }
    public void sort(int[] array, int start,int end)
    {
        int mid=start+(end-start)/2;
        if(start<end)
        {
            sort(array,start,mid);
            sort(array,mid+1,end);
            merge(array,start,mid,end);
        }

    }
    public void merge(int[] array,int start,int mid, int end)
    {
        int temp[]=new int[end-start+1];
        int i=start;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=end)
        {
            if(array[i]<array[j])
            {
                temp[k++]=array[i++];
            }else
            {
                temp[k++]=array[j++];
            }
        }
        while(i<=mid)
            temp[k++]=array[i++];
        while(j<=end)
            temp[k++]=array[j++];

        for(int l=0;l<temp.length;l++)
        {
            array[l+start]=temp[l];
        }

    }
}
