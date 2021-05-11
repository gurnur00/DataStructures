package arrays;

public class swap {
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
            int [] arr=new int[3];
            arr[0]=20;
            arr[1]=40;
            arr[2]=60;
            swap(arr,0,2);
            for(int i=0;i<arr.length;i++)
            {
                System.out.println(arr[i]);
            }
    }

}
