class Solution {
    static int ans(int[] arr, int target){
        int pivot = findpivot(arr);
        if(pivot==-1){
            return binarysearch(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        } else if (target>=arr[0]) {
            return binarysearch(arr,target,0,pivot-1);
        }
        else if (target<arr[0]){
            return binarysearch(arr,target,pivot+1,arr.length-1);
        }
        return -1;
    }
    static int binarysearch(int[] arr,int ele, int s, int e){
        while(s<=e){
//            int mid = (s+e)/2; there is a possibility that it might can exceed integer value so...
            int mid = s + (e-s)/2;
            if(ele==arr[mid]){
                return mid;
            }
            else if(ele>arr[mid]){
                s = mid+1;
//                e = mid-1; // for descending order
            } else if (ele<arr[mid]) {
                e = mid-1;
//                s = mid+1; // for descending order
            }
        }
        return -1;
    }
    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid-1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }
        return -1;
    }
    public int search(int[] nums, int target) {
        return ans(nums,target);
    }
}