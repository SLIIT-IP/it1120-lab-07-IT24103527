import java.util.Scanner ; 
          public class IT24103527Lab7Q3  {
          public static void main(String[] args)  {
//Create an object called input to Scanner class
        Scanner input=new Scanner(System.in) ; 
//Declaring variables
       int count=1 ; 
       double totBill , discount , Finalamount=0 ; 
       char mode ; 
//Taking user inputs inside the while loop
         while(count<=5)
   {         System.out.println("Customer" + count + " ") ; 
             System.out.print("Enter total bill amount :") ; 
             totBill=input.nextDouble() ;   
             System.out.print("Enter mode of payment(C for cash,O for other):") ; 
             mode= input.next().charAt(0) ; 
          switch(mode)  {
            case 'C' : 
            case 'c' :
                  discount = totBill * (0.05) ;
                  System.out.println("Discount is :" +discount) ;  
                  Finalamount = totBill-discount  ; 
                  System.out.println("Amount to be paid :" +Finalamount)  ;  break;
            case 'O' :
            case 'o' :
                   System.out.println("No discount applicable") ;
                   Finalamount=totBill ;  
                   System.out.println("Amount to be paid :" +Finalamount)  ;  break ;
            default :
                  System.out.println("Payment mode is not availble.") ; 
                          break ;      }

      
//increment of customer number
           count++ ; 
           System.out.println() ; //new line 
    }

}
}