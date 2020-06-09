import java.util.*; 
import java.io.*;
class phone2word{

	public static String[] mapping = new String[]{"ABC", "DEF", "GHI", "JKL", "MNO", "PRS", "TUV", "WXY"};    

	public static void findMappings(String n, int number_index, String answer, Formatter fw)
	{
  
		if(number_index>n.length()-1)
		{
			fw.format(answer);
			fw.format("\n");
			System.out.println(answer);
			return;
		}

		char digit =  n.charAt(number_index);
		int j = digit - '0';

		for(int i=0;i<3;i++)
		{
			char letter = mapping[j-2].charAt(i);			
			findMappings(n,number_index+1, answer+letter, fw);
		}
	}

	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		
		try{
			Formatter fw = new Formatter("output.txt");
			String n= sc.nextLine();   	
			findMappings(n,0, "", fw);
			fw.close();
		}
		catch(Exception e)
		{
			System.out.println("File not found"+e);
			return;
		}
		
	
	}

};


