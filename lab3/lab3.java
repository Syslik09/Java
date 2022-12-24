package lab3;

import java.util.*;

public class lab3 {
    public static void main(String[] arg) {
        Scanner n = new Scanner(System.in);
        int N = n.nextInt();
        switch (N) {
            case 1:
                String a = n.next();
                for (int i = 0; i < a.length() / 2; ++i) {
                    if (a.charAt(i) != a.charAt(a.length() - i - 1)) {
                        System.out.println("Слово не палиндром");
                    }
                }
                System.out.println("Слово палиндром");
                break;

            case 2:
                String b = "qwwweeerty";
                StringBuffer sb = new StringBuffer();
                int idx;
                String result = "";
                for (int i = 0; i < b.length(); i++) {
                    char c = b.charAt(i);
                    idx = b.indexOf(c, i + 1);
                    if (idx == -1){
                        sb.append(c);
                    }
                }
                System.out.println((sb));
                break;

            case 3:
                String str1 = "god";
                String str2 = "dog";
                if (str1.length() != str2.length()) {
                    System.out.println("Слова не является анаграммами");
                }
                else {
                    StringBuilder s1 = new StringBuilder(str1.toLowerCase());
                    StringBuilder s2 = new StringBuilder(str2.toLowerCase());
                    int x, y;
                    x = -1;
                    while (++x < s1.length()) {
                        y = -1;
                        while (++y < s2.length()) {
                            if (s1.charAt(x) == s2.charAt(y)) {
                                s2.deleteCharAt(y);
                                break;
                            }
                        }
                    }
                    System.out.println("Слова являются анаграммами");
                }
                    break;

            case 4:
                String str3 = "Привет";
                String str4 = "Привет";
                System.out.println(str3.compareTo(str4));
                break;

            case 5:
                String str5 = "Привет";
                String str6 = "прИвЕт";
                System.out.println(str5.compareToIgnoreCase(str6));
                break;

            case 6:
                String str7 = "Привет";
                String str8 = "Андрей";
                System.out.println(str7+" "+str8);
                break;

            case 7:
                String str9 = "Привет";
                CharSequence str10 = "Привет";
                if (str9.contentEquals(str10) == true) {
                    System.out.println("Строки совпадают");
                }
                else {
                    System.out.println("Строки различны");
                }
                break;

            case 8:
                String str11 = "конец";
                String str12 = "Это был конец";
                System.out.println(str12.endsWith(str11));
                break;

            case 9:
                String str13 = "qwerty";
                String str14 = "qwerty";
                System.out.println(str13.equals(str14));
                break;

            case 10:
                String str15 = "Здравствуйте";
                System.out.println("Длина строки: "+ str15.length());
                break;

            case 11:
                String str16 = "ПриВеТ";
                System.out.println(str16.toLowerCase());
                break;

            case 12:
                String str17 = "ПриВеТ";
                System.out.println(str17.toUpperCase());

            case 13:
                Map <String, Integer> letters = new HashMap<String,Integer>();
                String words = "fggthhhjjjjj";
                int wordLen = words.length();
                int countLetter = 0;
                for (int i = 0; i < wordLen; ){
                    int count=0;
                    char t = words.charAt(i);
                    int index = i;
                    boolean f = true;
                    while (f) {
                        if(words.indexOf(t, index) != -1) {
                            count++;
                            index++;
                        }
                        else {
                            f = false;
                            i=index;
                        }
                    }
                    letters.put(Character.toString(t),count);
                }

                String maxKey = null;
                for (String key : letters.keySet()) {
                    if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                        maxKey = key;
                    }
                }

                letters.remove(maxKey);
                maxKey = null;
                for (String key : letters.keySet()) {
                    if (maxKey == null || letters.get(key) > letters.get(maxKey)) {
                        maxKey = key;
                    }
                }
                System.out.println(maxKey);
                break;

            case 14:
                String u = "qqwwerty";
                int len;
                do {
                    len = u.length();
                    u = u.replaceAll("([^a-z])\\1", "");


                }
                while (len != u.length());
                System.out.println(u);

            case 15:
                String str18 = "qqwwerrty";
                boolean f = true;
                for (int i = 0; i < str18.length() && f; i++) {
                    if (str18.indexOf(str18.charAt(i)) == str18.lastIndexOf(str18.charAt(i))) {
                        System.out.print(str18.charAt(i));
                        f = false;
                    }
                }
                break;
            case 16:
                String str19 = "qwerqw";
                String begin = (str19.substring(0,2)).toLowerCase();
                String end = (str19.substring(str19.length()-2)).toLowerCase();
                System.out.println(begin.equals(end));
                break;

            case 17:
                String str20 = "qqqwwweeerrrty";
                int len17 = str20.length();
                int countW = 0;
                for (int i = 0; i < len17; ){
                    int countN=0;
                    char t1 = str20.charAt(i);
                    int index = i;
                    boolean b1 = true;
                    while (b1) {
                        if(str20.indexOf(t1, index) != -1) {
                            countN++;
                            index++;
                        }else{
                            b1 = false;
                            i=index;
                        }
                    }
                    if(countN == 3){
                        countW++;
                    }
                }
                System.out.println(countW);
                break;

            case 18:
                String str21 = "ab232cd";
                str21 = str21.replaceAll("[^0-9]", "");
                if (str21.isEmpty()){
                    System.out.println("сумма = 0");
                }
                else{
                    int sum = 0;
                    boolean b2 = true;
                    int num = Integer.parseInt(str21);
                    while (b2){
                        sum+=num%10;
                        num/=10;
                        if(num <= 0){
                            b2 = false;
                        }
                    }
                    System.out.println(sum);
                }
        }

    }
}
