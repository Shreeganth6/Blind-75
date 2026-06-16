import java.util.Arrays;

public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        char[] chs = s.toCharArray();
        Arrays.sort(chs);
        char[] cht = t.toCharArray();
        Arrays.sort(cht);
        return Arrays.equals(chs,cht);
    }
}
