package test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Random;
import java.util.Scanner;

public class RandamNumber {

	public static void main(String[] args) throws Exception {
		RandamNumber obj=new RandamNumber();
		RandamNumber obj1=new RandamNumber();
		//int[] temp = {2,3,4,5,1,7};
		//obj.getmax(temp);
		//	System.out.println("the max "+obj.getmax(obj.randam()));
		//System.out.println("the min "+obj.getmin(obj.randam()));

		//		randam();
		fileinput();
	}

	public int div(int fnum, int snum)
	{
		int mydiv = 0;
		if(snum !=0)
		{
			mydiv = fnum/snum;
			return mydiv;
		}
		else 
		{
			return mydiv;
		}

	}
	public int multi(int fnum,int snum)
	{
		return fnum*snum;
	}

	public int getmax(int[] values)
	{
		int max = values [0];
		for (int i =0;i<values.length;i++) {

			if (values[i] > max) {
				max = values[i];
			}
		}
		return max;
	}
	public int getmin(int[] values)
	{
		int min = values [0];
		for (int i =0;i<values.length;i++) {

			if (values[i] < min) {
				min = values[i];
			}
		}
		return min;
	}


	public int[] randam()
	{

		int[] ranList = new int[20];

		Random t = new Random();//random is an interface we have to import
		int t1 = 0;
		for (int i = 0; i < ranList.length; i++) {
			t1=t.nextInt(500);//in random interface calling nextINt
			System.out.println(t1);
			ranList[i]=t1;
		}
		return ranList;

	}

	public static void fileinput() throws Exception

	{
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter a word ");
		String wordsearch = sc.nextLine();


		String path = "\\C:\\Users\\Administrator\\Desktop\\seleniumtest.txt\\";
		File f = new File (path);

		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);



		String line,s,word2;
		String[] words = null;
		//Reading every line form the file
		while((s=line=br.readLine())!=null)
		{
			// Spliting the line with - Seperator
			words=s.split("-");
			
			String mFound = "N";
			
			for (String myWord: words)
			{
				if(mFound.equals("Y"))
				{
					String[] words2 = myWord.split(",");
					for (String myWord2: words2)
					{
						System.out.println("Meaning = "+myWord2);
					}
				}
				if (wordsearch.equalsIgnoreCase(myWord))
				{
					System.out.println(myWord);
					mFound = "Y";

				}

				//System.out.println(myWord);
			}


		}
	}

}

