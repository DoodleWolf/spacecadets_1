import java.util.*;
import java.io.*;
import java.net.*;

public class Main{
	public static void main(String[] args) throws Exception{
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String strLine = input.readLine();
		URL ecs = new URL("https://www.ecs.soton.ac.uk/people/" + strLine);
		BufferedReader web = new BufferedReader(new InputStreamReader(ecs.openStream()));
		Boolean notFound = true;
		strLine = web.readLine();
		while(notFound && strLine != null){
			strLine = web.readLine();
			if(strLine.contains("property=\"name\">")){
				notFound = false;
			}
		}
		String[] div1 = strLine.split("property=\"name\">");
		String[] div2 = div1[1].split("<");
		System.out.println(div2[0]);
	}
}
