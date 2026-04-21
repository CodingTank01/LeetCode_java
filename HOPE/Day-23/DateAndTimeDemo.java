import java.time.*;

class DateAndTimeDemo {
    public static void main(String[] args) {
        LocalTime l = LocalTime.now();
        System.out.println(l);

        LocalDate l1 = LocalDate.now();
        System.out.println(l1);

        ZonedDateTime z = ZonedDateTime.now();
        System.out.println(z);

        LocalDateTime l2 = LocalDateTime.now();
        System.out.println(l2);

        //custom date
        LocalDate l3 = LocalDate.of(2026, 04, 21);
        System.out.println(l3);

        //adding
        LocalDate l4 = l3.plusDays(15);
        System.out.println(l4);

        //subtracting
        LocalDate l5 = l3.minusMonths(2);
        System.out.println(l5);
        
        //Fetching values
        System.out.println(l1.getMonth());
        System.out.println(l1.getDayOfMonth());
        System.out.println(l1.getYear());

        LocalDate l6 = LocalDate.of(2026,01,01);
        LocalDate l7 = LocalDate.now();
        System.out.println(l6.isBefore(l7));
        System.out.println(l6.isAfter(l7));

        //Thread safety
        LocalDate l8 = LocalDate.now();
        LocalDate l9 = l8.plusDays(10);
        System.out.println(l8);
        System.out.println(l9);

    }    
}
