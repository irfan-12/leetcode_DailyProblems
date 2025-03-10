class Solution {
    char[] vowels = new char[]{'a','e','i','o','u'};
    public long countOfSubstrings(String word, int k) {
        // exactly k consonants = (>= k consonants - >= k+1 consonants)
        return countOfSubstringsAtleast(word, k) - countOfSubstringsAtleast(word, k+1);
    }

    private long countOfSubstringsAtleast(String word, int k) {
        int[] window = new int[26];
        int n = word.length();
        int i = 0;
        long res = 0;
        for (int j = 0; j<n; j++) {
            char c = word.charAt(j);
            window[c-'a']++;
            while (consonantCount(window) >= k && hasAllVowels(window)) {
                res += (n-j);
                window[word.charAt(i)-'a']--;
                i++;
            }
        }
        return res;
    }

    private boolean isVowel(char c) {
        for (char v : vowels) {
            if (c == v) return true;
        }
        return false;
    }

    private boolean hasAllVowels(int[] window) {
        for (char v : vowels) {
            if (window[v-'a'] == 0) return false;
        }
        return true;
    }

    private long consonantCount(int[] window) {
        long sum = 0;
        for (int i = 0; i<26; i++) {
            if (!isVowel((char)(i+'a'))) {
                sum += (long)window[i];
            }
        }
        return sum;
    }
}