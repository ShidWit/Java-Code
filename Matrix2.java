//places I went for help
//csawesome
//codehs.com
//https://docs.oracle.com/javase/tutorial/java/nutsandbolts/switch.html
//previous matrix sandbox :)

//imports
import java.util.Random;



public class Matrix2
{
    public static void main(String[] args)
    {   
        //counts
        int counta = 0;
        int countb = 0;
        int countc = 0;
        int countx = 0;
        int count2 = 0;
        int count7 = 0;
        int count9 = 0;
        //array
        //you can change the size too if you want
        char[][] arr = new char[20][20];
        //call in random
        Random randNum = new Random();
        //goes through and populates the array with all 
        //the characters needed using math.random
        for (int row = 0; row < arr.length; row++)
        {
            
            for (int col = 0; col < arr[row].length; col++)
			{
			    //try messing with the number here defualt should be 7
			    //this affects the number of random digits
			    //if theres more than 7 there will be missing spots!
			    int x = randNum.nextInt(7);
			    
			    //switch statments make life so easy
			    switch (x) 
			    {
			     
			        
			        case 0:
			        {
			            arr[row][col] = 'a';
			            counta++;
			            break;
			        }
			        case 1:
			        {
			            arr[row][col] = 'b';
			            countb++;
			            break;
			        }
			        case 2:
			        {
			            arr[row][col] = 'c';
			            countc++;
			            break;
			        }
			        case 3:
			        {
			            arr[row][col] = '7';
			            count7++;
			            break;
			        }
			        case 4:
			        {
			            arr[row][col] = '9';
			            count9++;
			            break;
			        }
			        case 5:
			        {
			            arr[row][col] = 'x';
			            countx++;
			            break;
			        }
			        case 6:
			        {
			            arr[row][col] = '2';
			            count2++;
			            break;
			        }
			    }
			}
        }
        // prints the array
        for (char[] x : arr)
        {
            for (char y : x)
                {
                    System.out.print(y + " ");
                }
            System.out.println();
        }
        // debug
        
        //System.out.println("");
        //System.out.println("--debugging code to help see if the algorithm is working--");
        //System.out.println("--these println statements can be added to the max method--");
        System.out.println("");
        // print counts
		System.out.println("a count is " + counta);
		System.out.println("b count is " + countb);
		System.out.println("c count is " + countc);
		System.out.println("x count is " + countx);
		System.out.println("2 count is " + count2);
		System.out.println("7 count is " + count7);
		System.out.println("9 count is " + count9);
		System.out.println("");
		
		if (counta > countb && counta > countc && counta > countx && counta > count2 && counta > count7 && counta > count9)
		{
		    System.out.println("A has the highest count");
		}
		else if (countb > counta && countb > countc && countb > countx && countb > count2 && countb > count7 && countb > count9)
		{
		    System.out.println("B has the highest count");
		}
		else if (countc > counta && countc > countb && countc > countx && countc > count2 && countc > count7 && countc > count9)
		{
		    System.out.println("C has the highest count");
		}
		else if (countx > counta && countx > countb && countx > countc && countx > count2 && countx > count7 && countx > count9)
		{
		    System.out.println("X has the highest count");
		}
		else if (count2 > counta && count2 > countb && count2 > countc && count2 > countx && count2 > count7 && count2 > count9)
		{
		    System.out.println("2 has the highest count");
		}
		else if (count7 > counta && count7 > countb && count7 > countc && count7 > countx && count7 > count2 && count7 > count9)
		{
		    System.out.println("7 has the highest count");
		}
		else if (count9 > counta && count9 > countb && count9 > countc && count9 > countx && count9 >  count2 && count9 > count7)
		{
		    System.out.println("9 has the highest count");
		}
		else
		{
		    System.out.println("mulitple high amounts present!");
		}
		
		
    }
}
