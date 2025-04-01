public class NaiveStringMatching {

    // Function to implement Naïve String Matching
    public static void naiveStringMatch(String text, String pattern) {
        int n = text.length(); // Length of the text
        int m = pattern.length(); // Length of the pattern

        // Loop through all possible positions where the pattern could match
        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            // Compare the substring of text with the pattern
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            // If all characters of the pattern are matched
            if (j == m) {
                System.out.println("Pattern found at index " + i);
            }
        }
    }

    // Main function to test the algorithm
    public static void main(String[] args) {
        String text = "ababcababcabc";
        String pattern = "abc";
        
        // Call the naive string matching function
        naiveStringMatch(text, pattern);
    }
}