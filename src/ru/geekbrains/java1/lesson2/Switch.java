package ru.geekbrains.java1.lesson2;

public class Switch {

    public static void main(String[] args) {
        int numberOfMonth = 2;

//        printMonthByNumberIf(numberOfMonth);
//        printMonthByNumberSwitch(numberOfMonth);
//        printMonthByNumberSwitchV2(numberOfMonth);

        int daysInMonth = getNumberDaysInMonth("May");
        System.out.println(daysInMonth);
    }



    private static void printMonthByNumberIf(int numberOfMonth) {
        if (numberOfMonth == 1) {
            System.out.println("January");
        } else if (numberOfMonth == 2) {
            System.out.println("February");
        } else if (numberOfMonth == 3) {
            System.out.println("March");
        } else if (numberOfMonth == 4) {
            System.out.println("April");
        } else if (numberOfMonth == 5) {
            System.out.println("May");
        } else if (numberOfMonth == 6) {
            System.out.println("June");
        } else {
            System.out.println("I know only first six months!");
        }
    }

    private static void printMonthByNumberSwitch(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            default:
                System.out.println("I know only first six months!");
        }
    }


    private static void printMonthByNumberSwitchV2(int numberOfMonth) {
        switch (numberOfMonth) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 7 -> System.out.println("June");
            default -> System.out.println("I know only first six months!");
        }
    }

    private static int getNumberDaysInMonthV0(String monthName) {
        int result = 0;
        switch (monthName) {
            case "January":
                result = 31;
                break;
            case "February":
                result = 28;
                break;
            case "March":
                result = 31;
                break;
            case "April":
                result = 30;
                break;
            case "May":
                result = 31;
                break;
            case "June":
                result = 30;
                break;
            case "July":
            case "August":
                result = 31;
                break;
            case "September":
                result = 30;
                break;
            case "October":
                result = 31;
                break;
            case "November":
                result = 30;
                break;
            case "December":
                result = 31;
                break;
        }

        return result;
    }
    
    private static int getNumberDaysInMonth(String monthName) {
        switch (monthName) {
            case "January":
                return 31;
            case "February":
                return 28;
            case "March":
                return 31;
            case "April":
                return 30;
            case "May":
                return 31;
            case "June":
                return 30;
            case "July":
            case "August":
                return 31;
            case "September":
                return 30;
            case "October":
                return 31;
            case "November":
                return 30;
            case "December":
                return 31;
            default:
                System.out.println("Unknown month name");
                return 0;
        }
    }

    private static int getNumberDaysInMonthV2(String monthName) {
        switch (monthName) {
            case "January":
            case "March":
            case "May":
            case "July":
            case "August":
            case "October":
            case "December":
                return 31;
            case "February":
                return 28;
            case "April":
            case "June":
            case "September":
            case "November":
                return 30;
            default:
                System.out.println("Unknown month name");
                return 0;
        }
    }

    private static int getNumberDaysInMonthV3(String monthName) {
        return switch (monthName) {
            case "January", "March", "May", "July", "August", "October", "December" -> 31;
            case "February" -> 28;
            case "April", "June", "September", "November" -> 30;
            default -> 0;
        };
    }
}
