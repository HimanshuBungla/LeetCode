class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {

				// Checking elements
				int temp = 0;
				if (nums[j] < nums[i]) {

					// Swapping
					temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
        return nums;
    }
}