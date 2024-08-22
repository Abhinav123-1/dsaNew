import java.util.Arrays;

public class LargestElement {
    public static void main(String[] args) {
        LargestElementSolution les = 
        new LargestElementSolution();
        int[] arr = {5,5,5};
        System.out.println(les.largestElement(arr));
    }
}

class LargestElementSolution{
    int largestElement(int[] arr){
        if(arr.length ==1){
            return arr[0];
        }
        return Arrays.stream(arr).max().getAsInt();
    }
}