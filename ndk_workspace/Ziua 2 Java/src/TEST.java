import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.*;

public class TEST {
	public static void main (String[] args) throws IOException{
	File f=new File("file_name");
	File g=new File("get_file");
	
	FileReader fr;
	BufferedReader br;
	BufferedWriter bw;
	FileWriter fw;
	fr= new FileReader(f);
	br=new BufferedReader(fr);
	fw=new FileWriter(g);
	bw=new BufferedWriter(fw);
		
	try{
		String line= br.readLine();
		
		while(line != null && line.length()!= 0){
			System.out.println(line);
			fw.write(line);
			bw.newLine();
			line=br.readLine();
			
		}
		}catch(IOException e){
			System.out.println("exceptie");}
	
		
	ArrayList <Integer> ai= new ArrayList <Integer>();
	Iterator <Integer> it;
	it=ai.iterator();
	Random r = new Random();
	for (int i=0; i<5; i++){
		int x=r.nextInt(10);
		ai.add(x);
	}
	it=ai.iterator();
	while(it.hasNext())
	{
		Integer item = it.next();
		System.out.println(item);
	}
	fw.close();
	}
	
}
