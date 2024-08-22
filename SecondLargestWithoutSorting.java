import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class SecondLargestWithoutSorting {
    public static void main(String[] args) {
        
    }
}

class SecondLargestWithoutSortingSolution{
    int secondLargestWithoutSorting(int[] arr){
        Optional<Integer> opt = Arrays.stream(arr)
                .boxed().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
                return opt.get();
    }
}
