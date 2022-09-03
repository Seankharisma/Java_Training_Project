package leetcode_Java;

public class searchInsert_q2 {

    /**
     * 将一个是数字插入一个有序的数组，返回它自己的下标；
     * 如果它本身存在则，返回其下标。
     */
    public static void main(String[] args) {
        int a[] = {1,3,4,5,7};
        int b = 6;
        searchInsert_q2 searchInsert_q2 = new searchInsert_q2();

        int return_number = searchInsert_q2.searchInsert(a, b);
        System.out.println(a);
        System.out.println("目标位置：" + return_number);
    }

    public int searchInsert(int[] nums, int target) {
        //数组的第一个元素下标
        int start_index = 0;
        //数组的最后一个下标
        int end_index = nums.length - 1;
        //取得中间下标
        int mid_index = (int) Math.ceil((nums.length - 1) / 2);

        //如果是一个空数组或者只有一个元素的时候
        if (end_index <= 0 || nums[0] >= target||(nums[end_index] <= target)) {

            if(nums[end_index] ==target)
            {
                return end_index;
            }
            else if(nums[end_index] <target){
                return ++end_index;
            }
            //当存在一个元素，并且targe比这个元素大，返回下标1
            else if (nums[0] < target) {
                return 1;
            } else {
                //不存在元素或者target比这个元素小，返回下标0
                return 0;
            }
        } else {
            //2个元素或者两个元素以上，使用二分法
            int s_count = start_index;
            int end_count = end_index;
            int mid_count = mid_index;
            while (s_count <end_count) {
                mid_count = (int) Math.ceil((s_count + end_count) / 2);
                if (nums[mid_count] > target) {
                    end_count = mid_count;
                    if(end_count==0){
                        return ++mid_count;
                    }
                } else if(nums[mid_count] < target){
                    if(s_count==mid_count){
                        return ++mid_count;
                    }
                    s_count = mid_count;
                }
                else {
                    return mid_count;
                }

            }
            return mid_count;
        }
    }
}