import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {

        //Task 1
        int[] dataPoints;
        dataPoints = new int[100];
        Random rnd = new Random();

        //part b
        for(int x=0; x<dataPoints.length; x++)
        {
            dataPoints[x] =rnd.nextInt(100)+1;
        }

        //part c
        for(int x=0; x<dataPoints.length; x++)
        {
            System.out.print(dataPoints[x] + " | ");
        }

        //part d
        int sum = 0;
        int ave =0;
        //sum
        for (int x =0; x < dataPoints.length; x++)
        {
            sum = sum + dataPoints[x]; //for each element it read it adds in to current sum
        }
        //average
        ave = sum/ dataPoints.length;
        //output
        System.out.println("\nThe sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: "+ ave);

        //Task 2
        Scanner in = new Scanner(System.in);
        int target=0;
        target = SafeInput.getRangedInt(in, "Enter an integer between 1 an 100", 1,100);

        //b
        occurrenceScan(dataPoints, target);

        //c
        int val = 0;
        boolean foundTarget= false;

        val = SafeInput.getRangedInt(in, "Enter an integer between 1 and 100",1,100 );
        for (int x =0; x < dataPoints.length; x++)
        {
            if (dataPoints[x]==val)
            {
                foundTarget = true;
                System.out.println("The value " + val + " was found at array index " + x);
                break;
            }
        }
        if (!foundTarget)
        {
            System.out.println("Value " + val + " was not found.");
        }

        //d
        int min = dataPoints[0];
        int max = dataPoints[0];

        for (int x =0; x<dataPoints.length; x++)
        {
            if (min > dataPoints[x])
            {
                min= dataPoints[x];
            }
            if(max < dataPoints[x])
            {
                max = dataPoints[x];
            }
        }
        System.out.println("The min is " +min);
        System.out.println("The max is " +max);

    }
    public static double getAverage(int values[])
    {
        double average= 0;
        double sum=0;
        for (int x = 0; x< values.length; x++)
        {
            sum = sum + values[x];
        }
        average = sum / values.length;
        System.out.printf("%.2f \nThe average is" , average);
        return average;
    }

    //extra credit
    //return the min value found
    public static int min(int values[])
    {
        int min = values[0];
        for (int x = 0; x< values.length; x++)
        {
            if(values[x]< min)
            {
                min = values[x];
            }
        }
        System.out.println("\nThe min value is "+ min);
        return min;
    }

    //returns the max value found
    public static int max(int values[])
    {
        int max = values[0];
        for (int x = 0; x< values.length; x++)
        {
            if(values[x]> max)
            {
                max = values[x];
            }
        }
        System.out.println("\nThe min value is "+ max);
        return max;
    }

    //returns the number of times target is found in the values array
    public static int occurrenceScan(int values[], int target)
    {
        int count =0;
        for (int x =0; x<values.length; x++)
        {
            if (target == values[x])
            {
                count++;
            }
        }
        System.out.println(target+ " appeared " + count + " time(s) in the array.");
        return count;
    }

    //returns the sum of the values array elements
    public static int sum(int values[])
    {
        int sum=0;
        for (int x=0; x < values.length; x++)
        {
            sum = sum + values[x];
        }
        return sum;
    }

    //return true if the values array contains target
    public  boolean contains(int values[], int target)
    {
        int match= -1;
        for (int x=0; x < values.length; x++)
        {
            if(target == values[x])
            {
                match = x;
                break;
            }
        }
        if(match !=-1)
        {
            System.out.println("The value " +target+ " was not found");
            return true;
        }
        else
        {
            System.out.println("The value " +target+ " was not found.");
            return false;

        }
    }

}