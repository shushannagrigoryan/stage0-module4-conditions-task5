package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean a = year % 4 == 0;
        boolean b = year % 100 != 0;
        boolean c = year % 400 == 0;
        boolean d = a && (b || c);
        int t = d?1:0;
         switch(t){
             case(1):
                 System.out.println("leap");
             case(0):
                 System.out.println("not leap");
             default:
                 System.out.println("not leap");
         }
    }
}
