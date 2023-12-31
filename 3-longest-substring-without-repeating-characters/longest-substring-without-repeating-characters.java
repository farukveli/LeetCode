class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        HashMap<Character, Integer> charIndexMap = new HashMap<>();
        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < n; end++) {
            char currentChar = s.charAt(end);

            if (charIndexMap.containsKey(currentChar)) {
                if(charIndexMap.get(currentChar) + 1 > start){
                    start = charIndexMap.get(currentChar) + 1;
                }
            }

            charIndexMap.put(currentChar, end);
            if( maxLength < end-start+1){
                maxLength = end - start + 1;
            }
            
        }

        return maxLength;
    }
}