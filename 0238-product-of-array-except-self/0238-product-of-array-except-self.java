class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        // 1. Prefix (Ön Çarpım) Hesaplama
        int[] prefix = new int[n];
        prefix[0] = 1;
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * nums[i - 1];
        }

        // 2. Suffix (Arka Çarpım) Hesaplama ve Sonuç Diziye Yazma
        int suffix = 1;
        for (int i = n - 1; i >= 0; i--) {
            result[i] = prefix[i] * suffix;
            suffix *= nums[i];
        }

        return result;
    }
}
