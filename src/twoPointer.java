public class twoPointer {
    public static int maxSubArray(int [] arr,int s){
        int N = arr.length;
        int left = 0;
        int right = 0;
        int sum = arr[0];
        int maxLen = 0;

        while(right < N){
            while(left <= right && sum > s){
                sum = sum - arr[left];
                left++;
            }
            if(sum == s){
                maxLen = Math.max(maxLen,right-left+1);
            }
            right++;
            if(right < N){
                sum = sum + arr[right];
            }
        }
        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,1};
        int s = 1;
        System.out.println(maxSubArray(arr,s));
    }
}
