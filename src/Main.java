import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main  {
    public static void main(String[] args) throws IOException {

        File myFile= new File("test.txt");


//        try{
//            if(myFile.createNewFile()){
//                System.out.println("this file has been created");
//                System.out.println("hello");
//            }
//        }catch(IOException e){
//            System.out.println("error");
//
//
//        }


//        if(myFile.exists()){
//            System.out.println("File Name:"+ myFile.getName());
//            System.out.println("File Path:"+myFile.getAbsolutePath());
//            System.out.println("File Can Write:"+myFile.canWrite());
//            System.out.println("File Can Read:"+myFile.canRead());
//            System.out.println("File Size in Byte:"+ myFile.length());
//
//
//        }


        try{
            FileWriter pen = new FileWriter("text.txt");
            for(int i=10;i<100;i++){
                pen.write("word"+i+"\n");
            }
            pen.close();
            System.out.println("put down the pen i finshed writing ");
        }catch(IOException e){
            e.printStackTrace();

        }


        try {
            File file = new File("text.txt");
            Scanner paper = new Scanner(file);
            while (paper.hasNextLine()) {
                System.out.println(paper.nextLine());
            }
        }catch(IOException e){
            e.printStackTrace();

            }







    }
}