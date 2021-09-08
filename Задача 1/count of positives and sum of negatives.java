public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int[] arr = new int[0];
      
        if( input == null)
        {
          return arr;
        }
      
        if((input.length == 0))
        {
          return arr;
        }
      
        int[] out = new int[2];
        int sum = 0;
        int count = 0;
      
        for(int i=0;i<input.length;i++)
        {
            if(input[i]>0)
            {
                count++;
            }
            else
            {
                sum = sum + input[i];
            }
        } 
      
        out[0] = count;
        out[1] = sum;
      
        return out; //return an array with count of positives and sum of negatives
    }
}