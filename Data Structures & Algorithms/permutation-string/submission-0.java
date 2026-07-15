class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency of s1
        for (char ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // Keep window size equal to s1 length
            if (right - left + 1 > s1.length()) {

                char remove = s2.charAt(left);
                window.put(remove, window.get(remove) - 1);

                if (window.get(remove) == 0) {
                    window.remove(remove);
                }

                left++;
            }

            if (window.equals(need)) {
                return true;
            }
        }

        return false;
    }
}