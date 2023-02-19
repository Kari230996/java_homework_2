

/*
 * В файле содержится строка с данными:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */


public class task3 {

    public static void main(String[] args) {
        String input = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        input = cut(input);
        String[] students = input.split(", ");

        for (String a : students) {
            a = cut(a);
            String[] keyValues = a.split(",");
            String name = "", grade = "", subject = "";

            for (String b : keyValues) {
                String[] keyValueParts = b.split(":");
                String key = cut(keyValueParts[0]);
                String value = cut(keyValueParts[1]);
                
                if (key.equals("фамилия"))
                    name = value;
                else if (key.equals("оценка"))
                    grade = value;
                else if (key.equals("предмет"))
                    subject = value;
                else 
                    throw new IllegalStateException("Ошибка");
                
                    
            }
            System.out.printf("Студент %s получил %s по предмету %s.\n", name, grade, subject);
        }

        
    }

    private static String cut (String str) {
        return str.substring(1, str.length() - 1);

    }
        
   
}

