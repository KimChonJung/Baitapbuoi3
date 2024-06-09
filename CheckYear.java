

public class CheckYear {
     static void CheckLeapYear(int year) {
        if ((year %4 ==0 && year %100 !=0)||year %400 ==0){
            System.out.println("Day la nam nhuan");
        }
        else{
            System.out.println("Day la nam khong nhuan");
        }
    }
}
