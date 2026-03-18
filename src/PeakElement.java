import java.util.Scanner;
public class PeakElement {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);
                int len= sc.nextInt();
                int[] arr= new int[len];
                for (int i=0;i<len;i++){
                        arr[i]=sc.nextInt();
                }

                if (arr[0] >= arr[1]) {
                        System.out.println(0);
} 

                else {
                boolean found = false;

                for (int i = 1; i < len - 1; i++) {
                 if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                                System.out.println(i);
                                 found = true;
                                break;
        }
    }

    if (!found && arr[len - 1] >= arr[len - 2]) {
        System.out.println(len - 1);
    }
}
    
}
        }


