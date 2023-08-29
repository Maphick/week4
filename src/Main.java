import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Tank plane = new Tank();
        plane.flyStraight(50);
        plane.flyUp(80,90);
        plane.turnRight();
        plane.flyStraight(30);
        plane.dropBombs();
        plane.flyStraight(40);
        plane.flyDown(100,10);
        plane.fillFuel();
        plane.flyDown(100,10);
        plane.fillFuel();
    }

    public static void exercises() {
        //exercise0();
        //exercise1();
        //exercise2();
        //exercise4();
        //exersise9();
        //exersise10();
        exersise11();
    }

    private static void exersise11(){
        String text1 = "Lorem ipsum is a placeholder text commonly used to demonstrate" +
                " the visual form of a document or a typeface without relying on meaningful content. Lorem ipsum may be used as a placeholder before final copy is available. It is also used to temporarily replace text in a process called greeking, which allows designers to consider the form of a webpage or publication, without the meaning of the text influencing the design.";
        String text = "VWXYZ";
        String outText = encrypt(text, 5);
        System.out.println(outText);
        String inText = encrypt(outText, -5);
        System.out.println(inText);
    }

    public static String encrypt(String text, int shift) {
        String resStr = "";
        //65 - 90 97 - 122
        for (int i =0; i< text.length(); i++) {
            char ch = text.charAt(i);

            if (('A'<=ch)&(ch<='Z'))
            {
                ch += shift;
                ch = (ch > 'Z') ? (char) ('A' + (ch - 'Z') -1 ) : ch;
                ch = (ch < 'A') ? (char) ('Z' - ('A'- ch - 1) ) : ch;
            }
            else if (('a'<=ch)&(ch<='z'))
            {
                ch += shift;
                ch = (ch > 'z') ? (char) ('a' + (ch - 'z') -1 ) : ch;
                ch = (ch < 'a') ? (char) ('z' - ('a'- ch - 1) ) : ch;
            }
            resStr += ch;
        }
        return resStr;
    }

    public static String decrypt(String text, int shift) {
        String resStr = "";
        for (int i =0; i< text.length(); i++) {
            resStr += (char) (text.charAt(i) - shift);
        }
        return resStr;
    }

    private static void exersise10() {
         String str = "VWXYZ";
         for (int i =0; i<= str.length()/2; i++) {
             System.out.println(str.substring(i,str.length()-i));
         }
    }

    private static void exersise9() {
    String[][] strings;
    short size = 5;
    strings = exersise90(size);
    for (int i = 0; i < size; i++) {
        System.out.println(String.join(" ", strings[i]));
    }
    }

    private static String[][] exersise90( int size) {
        String[][] s = new String[size][size];
        char ch = 'A';
        for (int i =0; i<size; i++)
        {
            for (int j =0; j<size; j++) {
                s[i][j] = "" + (char)(ch + j) + (size-i); // + (size - i);
            }
        }
        return s;
    }

    private static void exersise8() {
        Character[] output;
        String[] strings = new String[]{
                "Claudius, King of Denmark.",
                "Hamlet, Son to the former, and Nephew to the present King.",
                "Polonius, Lord Chamberlain.",
                "Horatio, Friend to Hamlet.",
                "Laertes, Son to Polonius.",
                "Voltimand, Courtier.",
                "Cornelius, Courtier.",
                "Rosencrantz, Courtier.",
                "Guildenstern, Courtier.",
                "Osric, Courtier.",
                "A Gentleman, Courtier.",
                "A Priest.",
                "Marcellus, Officer.",
                "Bernardo, Officer.",
                "Francisco, a Soldier",
                "Reynaldo, Servant to Polonius.",
                "Players.",
                "Two Clowns, Grave-diggers.",
                "Fortinbras, Prince of Norway.",
                "A Captain.",
                "English Ambassadors.",
                "Ghost of Hamlet's Father."
        };
        output = getNthItem(3, strings);
        Arrays.stream(output).forEach(System.out::print);
    }

    private static Character[] getNthItem(int n,  String[] strings)
    {
        int arrayLength = strings.length;
        Character[] output = new Character[arrayLength];
        for (int i=0; i< arrayLength; i++) {
            output[i] = strings[i].charAt(n);
          //  System.out.println( output[i] + " " + i);
        }
        return output;
    }

    private static void exercise7()
    {
        short size = 8;
        int[][] ints = new int[size][];

        ints[0] = new int[]{1};
        ints[1] = new int[]{1,1};

        for(int i = 2; i < size; i++)
        {
            ints[i] = new int[i+1];
            ints[i][0] = 1;
            for (int j = 1; j<i; j++)
            {
                ints[i][j] = ints[i-1][j-1] + ints[i-1][j];
            }
            ints[i][i] = 1;
        }

        for (int i = 0; i < size; i++) {
            System.out.println(Arrays.toString(ints[i]));
        }
    }


    private static void exercise4()
    {
        BookStore bookStore = new BookStore();
        Book book1 = new Book("The Hobbit", 1937, 999);
        Book book2 = new Book("fjhdyhjydtjtj", 1966, 969);
        Book book3 = new Book("The Hobbit", 1937, 999);
        Book book4 = new Book("gjhhsrtewrtert", 1997, 999);
        Book book5 = new Book("The", 1937, 999);
        Book book6 = new Book("The Hobbit", 1937, 999);
        bookStore.addNewBook(bookStore.booksList, book1);
        bookStore.addNewBook(bookStore.booksList, book2);
        bookStore.addNewBook(bookStore.booksList, book3);
        bookStore.addNewBook(bookStore.booksList, book4);
        bookStore.addNewBook(bookStore.booksList, book5);
        bookStore.addNewBook(bookStore.booksList, book6);
        bookStore.outBooksInfo(bookStore.booksList);
    }

    public static void exercise0() {
        int[] array = {5, 24, 3, 66, 38, 16, 27};
        Arrays.sort(array);
        System.out.println(array[2]);
    }




    public static void exercise1() {
        String userName = "";
        String userPassword = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = scanner.nextLine(); //Считывает строку из System.in
        System.out.println("Введите пароль: ");
        boolean isCorrectPass = false;
        while (!isCorrectPass) {
            String pass = scanner.nextLine(); //
            isCorrectPass = checkPass(pass);
            if (!isCorrectPass) {
                System.out.println("Пароль должен содержать от 8 до 15 символов");
                System.out.println("Введите новый пароль: ");
            } else {
                System.out.println(pass + " - Корректный пароль");
            }
        }
    }

    private static void exercise2(){
        String[] namesPlayers = {"Саша", "Игорь", "Миша", "Коля", "Владимир", "Геннадий"};
        int[][] pointTable = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5} };
        points(pointTable, namesPlayers);
    }

    private static String[] points(int[][] pointTable, String[] namesPlayers)
    {
        String player;

        int countPlayers = pointTable.length;
        int countSubject = pointTable[0].length;
        String[] resultArray = new String[countPlayers];
        for (int i = 0; i < countPlayers; i++)
        {
            int playerpoints = 0;
            for (int j = 0; j< countSubject; j++)
            {
                 playerpoints += pointTable[i][j];
            }
            player = namesPlayers[i] + " " + playerpoints;
            resultArray[i] = player;
        }
        return resultArray;
    }

    private static boolean checkPass(String pass) {
        if ((pass.length() > 15) || (pass.length() < 8))
            return false;
        else {
            return true;
        }
    }

    private static boolean checkName(String name) {
        String[] nameArray = formatName(name).trim().split(" ");
        sortByLength(nameArray);
        return (nameArray.length == 3);
    }

    private static String formatName(String name) {
        String res = "";
        String[] words = name.trim().split(" ");
        sortByLength(words);
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            char firstChar = word.charAt(0);
            if (!Character.isUpperCase(firstChar)) {
                res += Character.toUpperCase(firstChar) + word.substring(1);
            } else
                res += word;
            res += " ";
        }
        res = res.substring(0, res.length() - 2);
        return res;
    }

    private static void sortByLength(String[] words) {
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - 1; j++) {
                if (words[j].length() > words[j + 1].length()) {
                    String tempWord = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = tempWord;
                }
            }
        }
    }


    public static void divmod() {

        System.out.println(333 % 81);
        System.out.println((333 - 8) / 81);
        System.out.println(9 / 4 + 1);
    }
}