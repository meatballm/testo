import java.util.Arrays;
public class Test extends Thread{
    int[] arr=new int[50];
    public Test(int[] a){
        arr=a;
    }
    public static void main(String[] args){

        int[] array=new int[100];
        for(int i=0;i<100;i++){
            array[i]=i;
        }
        int[] t1=Arrays.copyOfRange(array,0,49);
        int[] t3=Arrays.copyOfRange(array,50,99);
        Test th1=t1;
    }
}
