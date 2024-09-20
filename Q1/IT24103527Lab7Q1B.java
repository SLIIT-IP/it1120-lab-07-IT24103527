import java.util.Scanner ; 
          public class IT24103527Lab7Q1B  {
          public static void main(String[] args)  {
//Declaring variables
         int  number=1 ; 
         double marks , avg ; 
         
//Create an object called input to Scanner class
            Scanner input=new Scanner(System.in) ; 
             
//Taking user inputs inside looping statments
     while(number<=3)
{   System.out.println("Student" + number + " ") ; 
         int count=1 ; 
         double sum=0.0 ;
           while(count<=4)
     {       System.out.print("Enter the marks of subject" +count+ " :") ;
             marks=input.nextDouble() ; 
                    //checking the conditions
                          if(marks<0 || marks>100)
                  {     
                      System.out.println("Invalid input for marks. It must be between 0 and 100.") ;  
                                   continue ;   }
                 sum+=marks ; 
                 count++ ;     }
//calculating for average
           avg = (sum/4.0) ;
           System.out.println("The average is :" +avg) ;  
//Determine the grade 
          if(avg>=75 && avg<=100)
  {       System.out.println("The grade is : Distinction") ;  }
          else if (avg>=50 && avg<=74) 
  {       System.out.println("The grade is : Credit") ;   }
          else if(avg>=0 && avg<=49)
  {       System.out.println("The grade is : Fail") ;      }
 
        number++ ; 
        System.out.println("\n") ;
        
          
}

     }
}