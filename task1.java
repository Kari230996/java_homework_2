
/**
 * В файле содержится строка с исходными данными в такой форме:
{"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
Значения null не включаются в запрос.
 */
public class task1 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String input = "{\"name\":\"Ivanov\",\"country\":\"Russia\",\"city\":\"Moscow\",\"age\":\"null\"}";


        String new_input = input.substring(1, input.length() - 1);
        String new_inp = new_input.replaceAll("\"", "");
        String new_inp2 = new_inp.replaceAll(":", " ");
        String new_inp3 = new_inp2.replaceAll(",", " ");

        String[] student = new_inp3.split(" ");

        System.out.println("SELECT * FROM students WHERE\n      name = \"" + student[1] + "\""+ "\nAND   country = \"" + student[3] + "\""+ "\nAND   city = \"" + student[5] + "\"");


        }  
    }

