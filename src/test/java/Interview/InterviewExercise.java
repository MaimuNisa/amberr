package Interview;

import java.util.HashMap;
import java.util.Map;

public class InterviewExercise {


//       String str = "ffdecgahvjsbqkehagsgaa";
//
//        HashMap<Character,Integer> map = new HashMap<>();
//
//   for(int i =0;i<str.length();i++){
//    if(map.containsKey(str.charAt(i))){
//        int count = map.get(str.charAt(i));
//        map.put(str.charAt(i),count+1);
//
//    }else {
//        map.put(str.charAt(i),1);
//    }
//}
//        System.out.println(map);
//
//

// Function to check if a character is
        // vowel or not
        static boolean isVowel(char ch)
        {
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o'
                    && ch != 'u') {
                return false;
            }
            return true;
        }

        // Function that replaces consonant with
        // next immediate consonant alphabetically
        static String replaceConsonants(char[] s)
        {
            // Start traversing the string
            for (int i = 0; i < s.length; i++) {
                if (!isVowel(s[i])) {

                    // if character is z,
                    // than replace it with character b
                    if (s[i] == 'c') {
                        s[i] = 'e';
                    }

                    // if the alphabet is not z
                    else {

                        // replace the element with
                        // next immediate alphabet
                        s[i] = (char)(s[i] + 1);

                        // if next immediate alphabet is vowel,
                        // than take next 2nd immediate alphabet
                        // (since no two vowels occurs
                        // consecutively in alphabets) hence no
                        // further checking is required
                        if (isVowel(s[i])) {
                            s[i] = (char)(s[i] + 1);
                        }
                    }
                }
            }
            return String.valueOf(s);
        }

        // Driver code
        public static void main(String[] args)
        {
            String s = "£7eBm ";
            System.out.println(
                    replaceConsonants(s.toCharArray()));
        }




    }




// This code is contributed by Rajput-Ji

