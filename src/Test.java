import java.util.Arrays;
public class Test extends Thread{
    int[] arr=new int[50];
    public Test(int[] a){
        arr=a;
    }
    public void run(){
        int sum=0;
        try {
            for (int i = 0; i < 50; i++) {
                sum += arr[i];
            }
        }catch(Exception e) {
        }
    }
    public static void main(String[] args){

        int[] array=new int[100];
        for(int i=0;i<100;i++){
            array[i]=i;
        }
        Test th1=new Test(Arrays.copyOfRange(array,0,49));
        Test th2=new Test(Arrays.copyOfRange(array,50,99));
    }
}
