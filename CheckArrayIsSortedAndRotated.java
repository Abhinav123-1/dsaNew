public class CheckArrayIsSortedAndRotated {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 2, 3, 5 };
        CheckArrayIsSortedAndRotatedSolution ciaisls = new CheckArrayIsSortedAndRotatedSolution();
        System.out.println(ciaisls.check(nums));  
    }
}

class CheckArrayIsSortedAndRotatedSolution{
    public boolean check(int[] nums) {
        if (nums.length <= 1) {
            return true;
        }
        int n = nums.length;
        int sorted = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                sorted++;
            }
        }
        if (sorted > 1) {
            return false;
        }
        return true;
        
    }   
}
