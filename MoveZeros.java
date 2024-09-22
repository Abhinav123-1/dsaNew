public class MoveZeros {
    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        MoveZerosSolution mzs  = new MoveZerosSolution();
        mzs.moveZeroes(nums);

    }
}

class MoveZerosSolution {
    public void moveZeroes(int[] nums) {
        int low = 0;
        int high = 0;
        while(high<nums.length){
            if(nums[low]==0 && nums[high] == 0){
                high++;
            }else if (nums[low] == 0 && nums[high]!=0){
                nums[low] = nums[high];
                nums[high] = 0;
                low++;
            }else{
                low++;
                high++;
            }
        }
    }

    private void swap(int low, int high){
        int temp = high;
        high = low;
        low = temp;
    }
}
