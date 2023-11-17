package com.giray;

public class Runner_SwitchCase {
    public static void main(String[] args) {
        /**
         * Java 8 den �nce-->
         */
        int value = 5;

        switch (value) {
            case 1:
                System.out.println("One");
                break;
            case 5:
                System.out.println("five");
                break;
            default:
                System.out.println("Unknown");
        }
        /**
         * Java 8 ile birlikte -->
         * STR�NG
         */

        String day = "Tuesday";
        switch (day) {
            case "Monday":
                System.out.println("Week day");
                break;
            case "Tuesday":
                System.out.println("Week day");
                break;
            case "Wednesday":
                System.out.println("Week day");
                break;
            case "Thursday":
                System.out.println("Week day");
                break;
            case "Friday":
                System.out.println("Week day");
                break;
            case "Saturday":
                System.out.println("Weekend");
                break;
            case "Sunday":
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Unknown");
        }
        /**
         * ENUM
         */

        enum DAYS {
            MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
        }

        DAYS days = DAYS.SUNDAY;

        switch (days) {
            case MONDAY:
                System.out.println("Weekdays");
                break;
            case TUESDAY:
                System.out.println("Weekdays");
                break;
            case WEDNESDAY:
                System.out.println("Weekdays");
                break;
            case THURSDAY:
                System.out.println("Weekdays");
                break;
            case FRIDAY:
                System.out.println("Weekdays");
                break;
            case SATURDAY:
                System.out.println("Weekends");
                break;
            case SUNDAY:
                System.out.println("Weekends");
                break;
            default:
                System.out.println("Unknown");
        }

        /**
         * 1- Switch statemen�� art�k bir switch expression�a d�n��t�.
         * Yani assign edilebilen, return edilebilen bir yap�ya kavu�tu.
         * Fakat return edilecek ifadeden �nce yield kullan�lmas� gerekiyor.
         */

        String type =
                switch (day) {
                    case "Monday":
                        yield "Weekday";
                    case "Tuesday":
                        yield "Weekday";
                    case "Wednesday":
                        yield "Weekday";
                    case "Thursday":
                        yield "Weekday";
                    case "Friday":
                        yield "Weekday";
                    case "Saturday":
                        yield "Weekend";
                    case "Sunday":
                        yield "Weekend";
                    default:
                        yield "Unknown";
                };
        /**
         * 2- case statement�� arrow operator olarak tan�mlanabilir hale geldi.
         * Yield yerine bu kullan�m daha okunur oldu�u i�in bu ifadenin tercih edilmesi daha faydal� olur.
         */

        type = switch (day) {
            case "Monday" -> "Week day";
            case "Tuesday" -> "Week day";
            case "Wednesday" -> "Week day";
            case "Thursday" -> "Week day";
            case "Friday" -> "Week day";
            case "Saturday" -> "Weekend";
            case "Sunday" -> "Weekend";
            default -> "Unknown";
        };
        /**
         * 3- switch i�inde yer alan de�erin farkl� case�leri i�in
         * ayn� i�lem yap�labilmesini sa�lamak i�in tek bir case ifadesine farkl� labellar yaz�labilir hale geldi.
         */

         type = switch (day) {
            case "Monday","Tuesday","Wednesday","Thursday","Friday" -> "Week day";
            case "Saturday", "Sunday" -> "Weekend";
            default->"Unknown";
        };
    }
}
