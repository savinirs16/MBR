import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class access {
public static void main(String[] args) throws IOException{
	Scanner sc=new Scanner(System.in);
	File nnn=new File("C:\\Users\\savin\\Desktop\\Programs\\PA1\\src\\oppppp.txt");
	nnn.createNewFile();
	
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
	
	for(int i=0;i<c2.length;i++)
		System.out.println(c2[i]);
	
	
	
	
	
	System.out.println("Partition 1:");
	if(c2[0].equals("80"))
	{
		System.out.println("Active partition");
		System.out.println("Hex value: "+c2[0]+"h");		
	}
	else if(c2[0].equals("00")){
		System.out.println("In active");
		System.out.println("Hex value: "+c2[0]+"h");}
	else{
		System.out.println("Invalid");
		System.out.println("Hex value: "+c2[0]+"h");}
	System.out.println("CHS address of the first absloute sector in partition 1:");
	System.out.println("Head value: "+c2[1] );
	System.out.println("Sector value: "+c2[2] );
	System.out.println("Cylinder value: "+c2[3]);
	System.out.println("Partition Type: "+c2[4]);
	System.out.println("CHS address the last absloute sector in partition 1:");
	System.out.println("Head value: "+c2[5] );
	System.out.println("Sector value: "+c2[6]);
	System.out.println("Cylinder value: "+c2[7]);
	System.out.println("LBA of first sector in partition: "+c2[8]+" "+c2[9]+" "+c2[10]+" "+c2[11] );
	System.out.println("Number of sectors in partiton 1: "+c2[12]+" "+c2[13]+" "+c2[14]+" "+c2[15] );
	
	
	System.out.println();
	System.out.println("Partition 2:");
	if(c2[16].equals("80"))
	{
		System.out.println("Active partition");
		System.out.println("Hex value: "+c2[16]+"h");		
	}
	else if(c2[16].equals("00")){
		System.out.println("In active");
		System.out.println("Hex value: "+c2[16]+"h");}
	else{
		System.out.println("Invalid");
		System.out.println("Hex value: "+c2[16]+"h");}
	System.out.println("CHS address of the first absloute sector in partition 2:");
	System.out.println("Head value: "+c2[17] );
	System.out.println("Sector value: "+c2[18] );
	System.out.println("Cylinder value: "+c2[19]);
	System.out.println("Partition Type: "+c2[20]);
	System.out.println("CHS address the last absloute sector in partition 2:");
	System.out.println("Head value: "+c2[21] );
	System.out.println("Sector value: "+c2[22]);
	System.out.println("Cylinder value: "+c2[23]);
	System.out.println("LBA of first sector in partition: "+c2[24]+" "+c2[25]+" "+c2[26]+" "+c2[27] );
	System.out.println("Number of sectors in partiton 1: "+c2[28]+" "+c2[29]+" "+c2[30]+" "+c2[31] );
	
	
	System.out.println();
	System.out.println("Partition 3:");
	if(c2[32].equals("80"))
	{
		System.out.println("Active partition");
		System.out.println("Hex value: "+c2[32]+"h");		
	}
	else if(c2[32].equals("00")){
		System.out.println("In active");
		System.out.println("Hex value: "+c2[32]+"h");}
	else{
		System.out.println("Invalid");
		System.out.println("Hex value: "+c2[32]+"h");}
	System.out.println("CHS address of the first absloute sector in partition 3:");
	System.out.println("Head value: "+c2[33] );
	System.out.println("Sector value: "+c2[34] );
	System.out.println("Cylinder value: "+c2[35]);
	System.out.println("Partition Type: "+c2[36]);
	System.out.println("CHS address the last absloute sector in partition 3:");
	System.out.println("Head value: "+c2[37] );
	System.out.println("Sector value: "+c2[38]);
	System.out.println("Cylinder value: "+c2[39]);
	System.out.println("LBA of first sector in partition: "+c2[40]+" "+c2[41]+" "+c2[42]+" "+c2[43] );
	System.out.println("Number of sectors in partiton 1: "+c2[44]+" "+c2[45]+" "+c2[46]+" "+c2[47] );
		
	
	
	
	System.out.println();
	System.out.println("Partition 4:");
	if(c2[48].equals("80"))
	{
		System.out.println("Active partition");
		System.out.println("Hex value: "+c2[48]+"h");		
	}
	else if(c2[48].equals("00")){
		System.out.println("In active");
		System.out.println("Hex value: "+c2[48]+"h");}
	else{
		System.out.println("Invalid");
		System.out.println("Hex value: "+c2[48]+"h");}
	System.out.println("CHS address of the first absloute sector in partition 4:");
	System.out.println("Head value: "+c2[49] );
	System.out.println("Sector value: "+c2[50] );
	System.out.println("Cylinder value: "+c2[51]);
	System.out.println("Partition Type: "+c2[52]);
	System.out.println("CHS address the last absloute sector in partition 4:");
	System.out.println("Head value: "+c2[53] );
	System.out.println("Sector value: "+c2[54]);
	System.out.println("Cylinder value: "+c2[55]);
	System.out.println("LBA of first sector in partition: "+c2[56]+" "+c2[57]+" "+c2[58]+" "+c2[59] );
	System.out.println("Number of sectors in partiton 1: "+c2[60]+" "+c2[61]+" "+c2[62]+" "+c2[63] );
	
	
	
	
	
//	for(int i=1;i<=4;i++)
//	{
//		for(int j=0;j<)
//		
//	}
//	
//	
	
	
}
}
