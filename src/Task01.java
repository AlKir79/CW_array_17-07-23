import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int [] arr1 = new int[10];
        int [] arr2 = new int[10];
        for (int i = 0; i<arr1.length;i++){
            arr1[i] = (int) ((Math.random())*10);
        }
        for (int i = 0; i<arr2.length;i++){
            arr2[i] = (int) ((Math.random())*10);
        }
        int []arr3 = new int[20];
        // все сразу
        int k=0;
        for (int i = 0;i<arr3.length;i++){
            if(i<10) arr3[i] = arr1[i];
            else {arr3[i] = arr2[k];k++;}
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println();
        System.out.println(Arrays.toString(arr2));
        System.out.println();
        System.out.println(Arrays.toString(arr3));
        // без повторений
        k=0;
        for (int i=0;i<arr1.length;i++){
            
        }
    }
}
