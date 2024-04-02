//Exception :- Basically removing the unwanted /unexcepted /abnormal situtaion that occured at runtime  

//Ex:- powercutException ---suppose u r doing a a project and its about to finish but suddenly power supply is off
//   nd ur system shut down ,and  u have to restart the programme (no power backup becuase u have not save the file )

//Suppose we want to the read the data through Java  program , but its showing file not found
//               ( It means the file is not available in the system ) 



public class Exception {
    public static void main(String[] args){
        int a =10;
       // int b=0,c;
       int b=1,c;
        c=a/b; 
         // here when the value of b=0 ,the compiler is printing the error ,
        //but when we replace the values of b by 1 its givies values as 10
        //so this is called exceptions handling 
        System.out.println(c);






    }
    
}



// ****----  Exception Handling :- Whenever there is a unwanted ,abnormal ,unexcepted runtime error during program execution ,
 //           we go through an alternate source with the help of which exception can be handle easily is known as exception handling      
         


 // Example:-In above we have discussed powercutException , but if have power backup we can save our program before the system shut down  
 

 //-->> Now the question is how  can we handle the exception in java , so there' are a lot of technique to work with exception 
 //     (object oriented mechanism has provide technique to handle exception )



 // --.. 1> Try   2> Catch  3>throw  4> throws  5> finally  ( for predefined Try and catch used , & for userdefined exception  throw and throws )



 class  Test {
    
    public static void main (String[] args){
      int a=10,b=0,c;
      try{       //try statement allows to define a block of code to be tested for error while executed
          c=a/b;
      
        System.out.println(c);
  
    }
    catch(ArithmeticException e){     //catch statement allows to define a block of code to be executed to handle the error
  
    
    System.out.println(e);  //System.out.println("cannot devide by zero");
   }
   System.out.println("hello");
  
   }
  }
// the above code is handling the exzception and printing the output as 
//  java.lang.ArithmeticException: / by zero
//   hello


// but when we replace the value of b by 1 it printing no outputlike that its directly printing 10 and hello 
