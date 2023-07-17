import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        int [][] arr1 = new int[5][5];
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++) {
                arr1[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        int min = arr1[0][0];
        for (int i=1;i< arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                if (arr1[i][j]<min) min = arr1[i][j];
            }
      }
     System.out.println(min);
        int max = arr1[0][0];
        for (int i=1;i< arr1.length;i++){
            for (int j=0;j<arr1[i].length;j++){
                if (arr1[i][j]>max) max = arr1[i][j];
            }
        }
        System.out.println(max);

    }
}
