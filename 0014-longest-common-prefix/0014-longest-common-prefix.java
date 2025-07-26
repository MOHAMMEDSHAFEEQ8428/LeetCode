class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        int n = strs.length;
        String prefix = strs[0];
        for(int i = 1; i < n; i++) {
            while(!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if(prefix == "") {
                    return prefix;
                }
            }
        }

        return prefix;
    }
}