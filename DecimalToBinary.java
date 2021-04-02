import java.util.Scanner;

public class DecimalToBinary {
    public int intToBinary(int num){
        int[] arr = new int[1000];
        for (int i = 0; i < 1000; i++) {
            arr[i] = -1;
        }
        int i = 0;
        while(num != 0){
            arr[i] = num % 2;
            num /= 2;
            i++;
        }
        int count = 0;
        for (int j = 0; j < 1000; j++) {
            if(arr[j] != -1){
                count++;
            }else break;
        }
        int res = 0;
        for (int j = count-1; j >= 0; j--) {
            res*=10;
            res+=arr[j];
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        DecimalToBinary obj = new DecimalToBinary();
        System.out.println(obj.intToBinary(num));
    }
}