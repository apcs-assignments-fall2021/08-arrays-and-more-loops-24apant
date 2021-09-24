import java.util.Arrays;

public class MyMain {

    // Rotates all values in an array to the left
    // Ex. rotateLeft([1, 2, 3, 4, 5]) => [2, 3, 4, 5, 1]
    public static int[] rotateLeft(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            if(i != arr.length - 1){
                newArr[i] = arr[i + 1];
            }
            else{
                newArr[i] = arr[0];
            }
        }
        return newArr;
    }

    // Rotates all values in an array to the right
    // Ex. rotateRight([1, 2, 3, 4, 5]) => [5, 1, 2, 3, 4]
    public static int[] rotateRight(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int[] newArr = new int[arr.length];
        for(int i = 0; i < arr.length; i ++){
            if(i != 0){
                newArr[i] = arr[i - 1];
            }
            else{
                newArr[i] = arr[arr.length - 1];
            }
        }
        return newArr;
    }

    // Replaces all duplicate values with -1
    // Ex. duplicateReplacer([1, 2, 1, 2, 1, 1]) => [1, 2, -1, -1, -1, -1]
    public static int[] duplicateReplacer(int[] arr) {
        // REPLACE WITH YOUR CODE HERE
        int[] newArr = arr.clone();
        for (int i=0;i<arr.length;i++){
            if (i != 0){
                for (int j=0;j<i;j++){
                    if (arr[j] == arr[i]){
                        newArr[i] = -1;
                    }
                }
            }

        }

        return newArr;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
        System.out.println(Arrays.toString(rotateLeft(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(rotateRight(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(duplicateReplacer(new int[]{1, 2, 1, 2, 1, 1})));


    }
}
