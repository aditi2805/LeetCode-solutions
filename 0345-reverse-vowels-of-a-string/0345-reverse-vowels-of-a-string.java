class Solution {
    public String reverseVowels(String s) {
        char ch[] = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while (left <= right) {
            while (left < right && (!isVowel(s.charAt(left)))) {
                left++;
            }

            while (left < right && (!isVowel(s.charAt(right)))) {
                right--;
            }

            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;

        }
        return String.valueOf(ch);
    }

    static boolean isVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            return true;
        }
        return false;
    }
}