import java.lang.reflect.Array;

public class Loader {
        public static void main(String[] args) {
            String a = "22";
            String b = "22";

            Main main = new Main();
            Main main1 = main;
            String user0 = "Иван Иванов";
            String user1 = "Вован Иванов";
            System.out.println(checkUserName(user0, user1));
            System.out.println(main.hashCode());
            System.out.println(main1.hashCode());
        }

        public static String checkUserName(String user0, String user1)
        {
            String res;
            int countSymbols = 0;
            if (user1.equalsIgnoreCase(user0)) {
                res = "Выберите другое имя";
            }
            else  {
                res = String.format("Отличное имя! Ваше имя %s %d символов", "имеет длину", (user1.length()));
                System.out.printf("Отличное имя! Ваше имя %s %d символов", "имеет длину", (user1.length()));
                String[] nameArray = user1.split(" ");
                for (int i=0; i<nameArray.length; i++) {
                    countSymbols += nameArray[i].length();
                }
                res += " \nА без пробелов ваше имя занимает " + countSymbols   + " символов";
                }
            return res;
        }
    }

