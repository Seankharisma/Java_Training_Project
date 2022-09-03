package leetcode_Java;
/*
* 删除数组重复项目
* */
public class arrayDrop_q1 {
    public static void main(String[] args) {
        //
        int[] a1={1,1,2,3,4,5,5};
        Solution solution = new Solution();
        solution.removeDuplicates(a1);



    }
}
class Solution {
    public void removeDuplicates(int[] nums) {
        int i=1;
        int j;
        for(j=1;j<nums.length;j++){
            if(nums[i-1]!=nums[j]){
                nums[i]=nums[j];
                i++;
            }
        }
        System.out.println("更新后数组长度:"+i);
        selectArray(nums,i);

    }
    public void selectArray(int []a,int m){
        for(int i=0;i<a.length;i++){
            //System.out.println(a[i]);
            System.out.print(a[i]+"\t");
        }
        System.out.println("\n");
        //删除后了的数组输出
        for(int i=0;i<m;i++){
            //System.out.println(a[i]);
            System.out.print(a[i]+"\t");
        }
    }
}