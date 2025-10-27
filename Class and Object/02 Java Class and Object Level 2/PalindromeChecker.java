public class PalindromeChecker {
    String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        String cleaned = text.replaceAll("\\s+", "").toLowerCase();
        int n = cleaned.length();
        for (int i = 0; i < n / 2; i++) {
            if (cleaned.charAt(i) != cleaned.charAt(n - 1 - i)) return false;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text);
        if (isPalindrome())
            System.out.println("Palindrome: Yes");
        else
            System.out.println("Palindrome: No");
    }

    public static void main(String[] args) {
        PalindromeChecker pc = new PalindromeChecker("Madam");
        pc.displayResult();
    }
}
