class Main
{
public static void main( String args[] )
   {
      
       
       String sn=BIO.getString();
       String result = "";
       while (!(sn.equals("END"))){
          
           int Mark=BIO.getInt();
            int CW=BIO.getInt();
       if (Mark >=70){ result = "1st";
        }
        
       else if (Mark >=60) {result = "2.1";
        }
         else if (Mark >=50){result = "2.2";
        }
        else if (Mark >=40) {result= "3rd";
        }
        else if (Mark <40) {result= "Fail";
        }
       if (){
        System.out.print( sn +" ["CW + Mark "]" + result);}
    else 
    {System.out.print( sn + " [" + m + "]" + "fails");}
    
     
       
       
       sn=BIO.getString();
       
       
       
       
       
       
    }
}
}  

    
  
        
   
    
    


