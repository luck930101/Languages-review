import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class FileReaderWriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("************BufferedReader Starts************");
	    BufferedReader reader = new BufferedReader(new FileReader("/Users/zhangyubo/Desktop/SSOAR-urllookuptable.csv"));//换成你的文件名
        reader.readLine();//First line is title, skip it
        String line = null; 
        while((line=reader.readLine())!=null){ 
        	System.out.println(line);
            
        }
        reader.close();
        System.out.println("************BufferedReader Ends************");
		System.out.println("************Scanner  Starts************");
		File analysisDir = new File("/Users/zhangyubo/Desktop/analysis");
		if(analysisDir.exists()){
			System.out.println("Dir exists！");
		}
		else {
			System.out.println("Dir does not exist");
			analysisDir.mkdirs();
		}
		
		
        File allFile = new File("/Users/zhangyubo/Desktop/csv");
        for( File f : allFile.listFiles()){
        	if(f.getName().endsWith(".csv")){
        		System.out.println(f.getName() );
        		Scanner scanner = new Scanner(f);
        		
        		while(scanner.hasNext()){
        			System.out.println(scanner.next());
        		} 
        		scanner.close();
        	}
        	
        }
        
        System.out.println("************Scanner Ends************");
        System.out.println("************Write File Starts************");
        String newusername = "Somecsv";
        String newfilename = "/Users/zhangyubo/Desktop/analysis/"+newusername+".csv";
        File newfile = new File(newfilename);
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(
        		new FileOutputStream(newfile, true)));
        
        writer.write("Username:"+newusername+"\n");
        
        writer.close();
        
        System.out.println("************Write File Ends************");

	}

}
