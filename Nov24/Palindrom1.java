public class Palindrom1 {
    public static void Pal(String str) {
        int start=0;
        int end=str.length()-1;
        while(start<end) {
            if(str.charAt(start)!=str.charAt(end)) {
                System.out.println("no Not a Plindorme");
                break;
            }
            start++;
            end--;
        }
        System.out.println(str+" no Is a Plindorme");
    }
    public static void main(String[] args) {
        String s="a00ll00a";
        Pal(s);
    }

}