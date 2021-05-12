package Strings;

public class findTarget {
        public static int searchRotatedSortedArray(int a[], int target)
        {
            int min = a[0];
            target = -1;
            for (int i = 0; i < a.length; i++)
            {
                if (min > a[i])
                {
                    min = a[i];
                    target = i+1;
                }
            }
            int val=-1;
            for(int j = 0;j<a.length;j++){
                if(a[j]==target){
                    val=j;
                }
            }

            return val;
        }

    public static void main(String[] args) {

    }
}
