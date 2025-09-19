class Solution {
    public int findNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] >= 10 && arr[i] <= 99) || (arr[i] >= 1000 && arr[i] <= 9999) || arr[i] == 100000) {
                count++;
            }
        }
        return count;
    }
}