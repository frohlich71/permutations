import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        System.out.print(solution.permute(new int[]{1,2,3}));
//        solution.permute(new int[]{1, 2,3});

    }
}

class Solution {
    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        backtrack(ans, new ArrayList<>(), nums);

        return ans;
    }

    public void backtrack(List<List<Integer>> ans, ArrayList perms ,int[] nums) {
        if (perms.size() == nums.length) {
            ans.add(new ArrayList<>(perms));
            return;
        }


        for (int num : nums) {

            if (perms.contains(num)) {
                continue;
            }

            perms.add(num);
            backtrack(ans, perms, nums);
            perms.remove(perms.size() - 1);

        }

    }

}





