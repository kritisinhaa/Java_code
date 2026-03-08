
public class Program2 {
 static boolean isPalindrome(String s) {
        String rev = "";
        for(int i=s.length()-1;i>=0;i--)
        {
          rev = rev + s.charAt(i);

        }
        return rev.equals(s);
    }

    public static void main(String[] args) {
        String s = "hello hi level bye eye abbcbba welcom";
        String[] arr1 = s.split("");
        for (String ele : arr1) {
            if (isPalindrome(ele)) {
                System.out.print(ele);
            }
        }
    }

}
