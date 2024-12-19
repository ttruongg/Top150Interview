import java.util.HashMap;
import java.util.Map;

public class Main {

    public static String reformatDate(String date) {
        String[] formatDate = date.split("\\s+");
        String result = formatDate[formatDate.length - 1] + "-";

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        result = result + months.get(formatDate[1]) + "-";

        String day = formatDate[0].substring(0, formatDate[0].length() - 2);
        String dayFinal = (day.length() == 1) ? "0" + day : day;

        result += dayFinal;

        return result;


    }

    public static void main(String[] args) {
        String date = "6th Jun 1933";
        System.out.println(reformatDate(date));
    }
}