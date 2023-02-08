import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        solution.permute(new int[]{1, 2, 3, 4});


    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();

        traverse(nums, ans, permutation, 0, 0);
        System.out.print(ans.toString());
        return ans;
    }

    public void traverse (int nums[], List<List<Integer>> ans, List<Integer> permutation , int i, int first) {

        if (permutation.size() == nums.length) {
            List<Integer> temp = new ArrayList<>(permutation);
            ans.add(temp);
            return;
        }

        if (permutation.size() < nums.length) {
            permutation.add(nums[first]);

            for (int j = i + 1; j < nums.length; j++) {
                permutation.add(nums[j]);
            }

            traverse(nums, ans, permutation,i + 1, first);
            permutation.remove(permutation.size() - 1);
        }

    }

}