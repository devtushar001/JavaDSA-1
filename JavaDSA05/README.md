Euclidean GCD Algorithm


O(log(min(a, b))); Time complexity

3411---------------------------------------------------------------


class Solution {
    public int maxLength(int[] nums) {

        int ans 0;

        for(int i = 0; i < nums.length; i++) {
            int p = nums[i], gcd = nums[i], lcm = nums[i];

            for(int j = i+1; j <nums.length; j++) {
                p *= nums[j];
                gcd = GCD(gcd, nums[j]);
                lcm = LCM(lcm, nums[j]);
                if(p == gcd*lcm) ans = Math.max(ans, j-i+1)
            }
        }
        return ans;
        
    }
}

-----------------------------------------------

Array problem ---

1) same elements
2) fixed size
3) space optimized
4) Insertion at end only

to avoid this problem we use ArrayList in java

-- List are two types (and they are framework or libray of List collection);

ArrayList is a dynamic data structure (DS)  -- Linear, Run time size change, same type default/ diff(generic) -- unsafe [-x lint compilationn problem], indexing based on 0 based and 1 based, 
1) ArrayList
2) LinkedList


-- default insertion at end of LinkedList, insert at any index

