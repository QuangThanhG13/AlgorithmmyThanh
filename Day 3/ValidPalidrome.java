package baicodethieunhi;

public class ValidPalidrome {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;

            while (left < right) {

                char leftChar = Character.toLowerCase(s.charAt(left));
                char rightChar = Character.toLowerCase(s.charAt(right));

                if (!Character.isLetterOrDigit(leftChar)) {
                    left++;
                } else if (!Character.isLetterOrDigit(rightChar)) {
                    right--;
                } else if (leftChar == rightChar) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
            return true;
        }


    public static void main(String[] args) {
        String checkPalidrome = "A man, a plan, a canal: Panama";
        ValidPalidrome validPalidrome = new ValidPalidrome();

       boolean check =  validPalidrome.isPalindrome(checkPalidrome);
        System.out.println("Kiem tra = " + check);
    }
}
