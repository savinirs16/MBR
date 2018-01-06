import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class mbr {
public static void main(String[] args) throws IOException, InterruptedException {
	Scanner sc=new Scanner(System.in);
	String s1="sudo dd if=/dev/sda of=sda123.mbr count=66 bs=1 skip=446";
	mbr m= new mbr();
	m.systemcall(s1);
	String s2="xxd sda123.mbr > output.txt";
	File nn=new File("");
	nn.createNewFile();
	String fname="output.txt";
	m.systemcall(s2);
	String[] data=dataarray();
	printdata(data);
	
}


private static void printdata(String[] data) {
	for(int i=0;i<data.length;i++)
		System.out.println(data[i]);
	
}


public static void systemcall(String s) throws IOException, InterruptedException
{
	Runtime r = Runtime.getRuntime();
	Process p = r.exec(s);
	p.waitFor();
	BufferedReader b = new BufferedReader(new InputStreamReader(p.getInputStream()));
	String line = "";

	while ((line = b.readLine()) != null) {
	  System.out.println(line);
	}

	b.close();
}

public static String[] dataarray() throws FileNotFoundException
{
	Scanner sc=new Scanner(System.in);
	File f=new File("C:\\Users\\savin\\Desktop\\Programs\\PA1\\src\\o.txt");
	Scanner d=new Scanner(f);
	String s1;
	String c[]=new String[50];
	String c1[]=new String[33];
	String c2[]=new String[66];
	int k=0;
	while(d.hasNext())
	{
		s1=d.next();
		if(s1.length()==4)
			c[k]=s1;
			k++;
	}
	int w=0;
	for(int i=0;i<c.length;i++)
	{
		
		if(c[i] != null)
		{
			c1[w]=c[i];
			w++;
		}
	}
	
	int l=0;
	for(int i=0;i<c1.length;i++)
	{
		c2[l]=c1[i].substring(0, 2);
		l++;
		c2[l]=c1[i].substring(2);
		l++;
	}
	
	
	return c2;
	
}

}
