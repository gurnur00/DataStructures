package arrays;

public class output {
    public static void main(String[] args) {
        int [] one=new int[3];
        one[0]=20;
        one[1]=40;
        one[2]=60;
        int[] two=one;
        two[1]=100;
        for(int i=0;i<one.length;i++)
        {
            System.out.println(one[i]);
        }
    }

}
