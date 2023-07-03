class Solution {
    public String longestCommonPrefix(String[] strs) {
         if (strs == null || strs.length == 0) {
        return "";
    }

    String shortest = strs[0];
    for (int i = 1; i < strs.length; i++) {
        if (strs[i].length() < shortest.length()) {
            shortest = strs[i];
        }
    }

    for (int i = 0; i < shortest.length(); i++) {
        char c = shortest.charAt(i);
        for (int j = 0; j < strs.length; j++) {
            if (strs[j].charAt(i) != c) {
                return shortest.substring(0, i);
            }
        }
    }

    return shortest;
    }
}
