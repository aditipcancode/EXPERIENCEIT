class Foocorporation {


    public static void main(String[] arguments) {
        calwage(7.50,35);
        calwage(8.20,47);
        calwage(10.00,73);
    }
    public static void calwage(double basepay,int hrsworked)
    {
        int overtimehr=0;
        double totalpay=0;
        if(basepay>8 && hrsworked<=60) {
            if (hrsworked > 40) {
                overtimehr = hrsworked - 40;
                double overtimepay = overtimehr * 1.5 * basepay;
                double hrsworkedpay = (hrsworked - overtimehr) * basepay;
                totalpay = overtimepay + hrsworkedpay;
            } else {
                totalpay = basepay * hrsworked;
            }
            System.out.println(totalpay);
        }
        else
        {
            if(basepay<8)
            {
                System.out.println("base pay error");
            }
            if(hrsworked>60)
            {
                System.out.println("hours worked error");
            }
        }
    }
}


