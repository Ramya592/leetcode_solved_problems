class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the prefix as the first string
        String prefix = strs[0];

        // Compare with all other strings
        for (int i = 1; i < strs.length; i++) {
            // Reduce prefix until it matches the start of strs[i]
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }
}