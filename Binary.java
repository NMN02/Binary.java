/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Daday Rap Onion
 */
        /******************************************************************
 * Program 1: Conversion from binary to decimal representation
 * Programmer: Navarro, Lagata, Ronao, Groyon
 * 
 * Class: IT 121        Instructor: John Mark D. Gabrentina
 *        
 * Pledge: I have neither given nor received unauthorized aid
 * on this program.     (signature on file)
 *
 * Description: This program converts a binary number to decimal.
 *
 * Input: Binary number
 *
 * Output: Decimal number
 *
 ******************************************************************/

// Imported packages
   import javax.swing.*;

    public class Binary
   {
   
   // Main method
       public static void main(String[] args)
      {
      	
      	// Request 6-bit binary number
         String binaryString=JOptionPane.showInputDialog("Enter a 6-bit binary number");
      	
      	// Convert from String to integer type
         int binary=Integer.parseInt(binaryString);
      	
      	// Declaration of output value
         int decimal=0;
      
      	// Declaration of variable to hold the current bit
         int bit;
      
      	
       	//////////////////////////////////////
      	// ADD YOUR CODE HERE
      	// FOLLOW THE EXAMPLE PROVIDED
      	// FOR THE LAST BIT, THE 6th
      	//////////////////////////////////////
/*      				
         bit=binary%10;//get the last bit (6th)
         decimal=decimal+bit*1;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
      	
         bit=binary%10;//get the last bit (5th)
         decimal=decimal+bit*2;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 5th bit, now the 4th bit is last
      	
         bit=binary%10;//get the last bit (4th)
         decimal=decimal+bit*4;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 4th bit, now the 3rd bit is last
      	
         bit=binary%10;//get the last bit (3rd)
         decimal=decimal+bit*8;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 3rd bit, now the 2nd bit is last
      	
         bit=binary%10;//get the last bit (2nd)
         decimal=decimal+bit*16;//add it, multiplied by the corresponding power of 2
         binary=binary/10;//get rid of the 2nd bit, now the 1st bit is last 
      	
         bit=binary%10;//get the last bit (1st)
         decimal=decimal+bit*32;//add it, multiplied by the corresponding power of 2
*/

	int i=0;
	int power2=1;
	int len=binaryString.length();
	while (i<len) {
		bit=binary%10;//get the last bit (6th)
		decimal=decimal+bit*power2;//add it, multiplied by the corresponding power of 2
		binary=binary/10;//get rid of the 6th bit, now the 5th bit is last
		power2*=2;
		i++;
	}

      	// Format output String
         String binaryOutput="Binary: " + binaryString;
         String decimalOutput="Decimal: " + decimal;
      	
      	// Output message
         JOptionPane.showMessageDialog(null, binaryOutput + "\n" + decimalOutput,
            "Binary to Decimal Conversion", JOptionPane.INFORMATION_MESSAGE);
      		{
             // Convert from String to integer type
                    System.out.println("String to integer type");
         String str="25"; 
         int number = Integer.parseInt(str);
         System.out.println(number);
         }
                {
                    // Declaration of output value
                    System.out.println("Declaration of output value");
         int var1;
         var1=25;
         
         System.out.println(" The value of variable is " + var1);
                }
                {
                    // Declaration of variable to hold the current bit
                    System.out.println("Declaration of variable");
         int Variablebit;
         Variablebit = 11001;
         System.out.println(Variablebit);
         double varvalue;
         varvalue = 25;
         System.out.println(varvalue);
         boolean outputvalue;
         outputvalue = true;
         System.out.println(outputvalue);
                }
      	// Exit
         System.exit(0); 
          }
    }
