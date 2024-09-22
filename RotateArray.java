import java.util.LinkedList;

public class RotateArray {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
        RotateArraySolution rabks = new RotateArraySolution();
        rabks.rotate(nums, 3);
    }
}

class RotateArraySolution{
    public void rotate(int[] nums, int k) {
        LinkedList<Integer> ll = new LinkedList<>();
        for (int num : nums) {
            ll.offer(num); // this uses queue
        }
        for (int i = 0; i < nums.length; i++) {
            nums[(i + k) % nums.length] = ll.poll();
        }

    }
}
