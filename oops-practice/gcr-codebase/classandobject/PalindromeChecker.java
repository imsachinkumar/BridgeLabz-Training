public class PalindromeChecker{
    String text;
    //Method to check palindrome
    boolean isPalindrome(){
        //Converting to Lowercase and removing spaces
        String clean=text.replaceAll("\\s","").toLowerCase();
        String rev="";
        for(int i=clean.length()-1;i>=0;i--){
            rev+=clean.charAt(i);
        }
        return clean.equals(rev);
    }
     //Method to display 
    void display(){
        if(isPalindrome())
            System.out.println(text+" is palindrome");
        else
            System.out.println(text+" is not Palindrome");
    }
    public static void main(String[] args){
        //Creating Objects
        PalindromeChecker p1=new PalindromeChecker();
        p1.text="A man a plan a canal Panama";
        PalindromeChecker p2=new PalindromeChecker();
        p2.text="Hello";
        p1.display();
        p2.display();
    }
}
