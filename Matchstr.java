// public class Matchstr {
//     public static void main(String[] args) {
//            String s = "geeksforgeeks";
//            String x = "for";
//           System.out.println(s.indexOf(x));
//     }
// }






class Matchstr {

    public static int myIndexOf(String s, String x) {
        char[] str = s.toCharArray();
        char[] substr = x.toCharArray();
        int len = str.length;
        int sublen = substr.length;
        int count = 0;
        if (sublen > len) {
            return -1;
        }
        for (int i = 0; i < len - sublen + 1; i++) {
            for (int j = 0; j < sublen; j++) {
                if (str[j+i] == substr[j]) {
                    count++;
                    if (count == sublen) {
                        return i;
                    }
                } else {
                    count = 0;
                    break;
                }
            }
        }
        return -1;
    }

    // public static int compareFunc(String s1, String s2)
    // {
    //     // int r1 = s1.indexOf(s2);
    //     int r2 = myIndexOf(s1.toCharArray(), s2.toCharArray());
    //     // boolean ret = (r1==r2);
    //     // System.out.println(ret + " for '" + s1 + "' '" + s2 + "' -> " + r1 + " " + r2);
    //     System.out.println(r2);
    //     return r2;
    // }

    public static void main (String[] args)
    {
        // Empty string
        // compareFunc("", "");
        // compareFunc("A", "");
        // compareFunc("AB", "");
        // compareFunc("", "A");
        // compareFunc("", "AB");
        // Equal non-empty strings
        // compareFunc("A", "A");
        // compareFunc("AB", "AB");
        // compareFunc("ABC", "A");
        // // Match at the beginning
        // compareFunc("A", "AB");
        // compareFunc("AB", "ABC");
        // compareFunc("ABC", "ABD");
        // // Match at the end
        // compareFunc("B", "AB");
        // compareFunc("BC", "ABC");
        // compareFunc("ABC", "DBC");
        // // Match at the middle
        // compareFunc("BC", "ABCD");
        // compareFunc("CD", "ABCDEF");
        // // No match on longer strings
        // compareFunc("QWERTYUIOPASDFGHJKL", "ZXCVBNM");
        System.out.println(myIndexOf("geeksforgeeks","for"));
        System.out.println("Test successful");
    }
}