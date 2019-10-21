public class Ex2 {
    public static void main(String [] args)
    {
         /*int x=4;
      int y=2;
      int result=(x*y)+(20/x);

        System.out.println(result);*/
        int Abankaccount=100;
        int Bbankaccount=50;


        int newbalance;
        int interest;

        if(Abankaccount>=75)
        {
            interest=(10*Abankaccount)/100 ;
            newbalance=interest+Abankaccount;

            System.out.println("Abankaccount" + "="+ newbalance);
        }
        else
        {
            interest=(5*Abankaccount)/100;
            newbalance=interest+Abankaccount;
            System.out.println("Abankaccount" +"="+ newbalance);
        }

        if(Bbankaccount>=75)
        {
            interest=(10*Bbankaccount)/100 ;
            newbalance=interest+Bbankaccount;
            System.out.println("Bbankaccount" + "="+ newbalance);
        }
        else {
            interest = (5 * Bbankaccount) / 100;
            newbalance = interest + Bbankaccount;
            System.out.println("Bbankaccount" + " " + newbalance);
        }

    }
}

