public class Kata
{
  public static String reverseWords(final String original)
  {
        String array[] = null;

        array = original.split(" ");
        String popa = "";
        String pusha = "";

        if(array.length == 0)
        {
            return original;
        }
        else
        {
			for(int i = 0;i<array.length;i++)
			{
				popa="";
			  
				for(int j=array[i].length(); j>0; j--)
				{
					popa = popa + array[i].charAt(j-1);
				}

				pusha= pusha + popa;
			  
				if(i != array.length - 1)
				{
				  pusha += " ";   
				}   
			}
			return pusha;
        }
  }
}