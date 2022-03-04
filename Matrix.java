// What is this? down below we have a 2d array matrix full of numbers, we then print it out, and then we determine how many of a select few numbers exist in the matrix.
//places i went for help
//csawesome
//codehs
public class Matrix
{
    public static void main(String[] args)
    {
        
        //matrix array
        int[][] arr = 
        {
            {1,2,3,4,5},
            {6,7,8,9,0},
            {6,7,1,2,5},
            {6,7,8,9,0},
            {5,4,3,2,1}
        };
        
        //prints array
        for (int[] x : arr)
        {
            for (int y : x)
                {
                    System.out.print(y + " ");
                }
            System.out.println();
        }
        //int for each
        int seven = 7;
        int eight = 8;
        int six = 6;
        int twentyone = 21;
        
        //count for each
        int count7 = 0;
        int count8 = 0;
        int count6 = 0;
        int count21 = 0;
        
        
        //searches each piece of each array in the 2d array for the integer and counts for each one
        for (int row = 0; row < arr.length; row++)
		{
			for (int col = 0; col < arr[row].length; col++)
			{
				if(seven == arr[row][col])
				{
				    count7++;
				}
				else if(eight == arr[row][col])
				{
				    count8++;
				}
				else if(six == arr[row][col])
				{
				    count6++;
				}
				else if(twentyone == arr[row][col])
				{
				    count21++;
				}
			}
		}
		
        //prints
        System.out.println("");
        System.out.println("The 7 value is: " + count7);
        System.out.println("The 8 value is: " + count8);
        System.out.println("The 6 value is: " + count6);
        System.out.println("The 21 value is: " + count21);
        
        
    }
}
