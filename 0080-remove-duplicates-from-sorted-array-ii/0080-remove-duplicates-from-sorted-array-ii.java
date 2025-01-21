// class Solution {
//     public int removeDuplicates(int[] nums) {
//         int j=0;
//         int k=0;
//         for(int i=1;i<nums.length;i++){
//             if(nums[i]!=nums[j]&&k>=2){
//                 j=j+2;
//                 nums[j]=nums[i];
//                 k=1;
//             }
//             else{
//                 k++;
//             }
//         }
//         return j+1;
//     }
// }


class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0; // Pointer for the current position of allowed duplicates
        int count = 1; // Counter to track the occurrences of the current number

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                // Increment count if the current number is the same as the previous number
                count++;
            } else {
                // Reset count when a new unique number is encountered
                count = 1;
            }

            // If the count is within the allowed limit (2 in this case), update the array
            if (count <= 2) {
                j++;
                nums[j] = nums[i];
            }
        }

        // Return the length of the updated array
        return j + 1;
    }
}
