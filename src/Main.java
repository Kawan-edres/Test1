import java.io.*;
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

        Scanner scan=new Scanner(System.in);
        System.out.println("Create an acount ");
        System.out.print("Enter Email or phone : ");
        String email=scan.nextLine();
        System.out.print("Enter Your Password : ");
        String password=scan.nextLine();

        try{
            FileWriter pen = new FileWriter("text.txt");
                pen.write(email+"\n");
                pen.write(password);

            pen.close();
        }catch(IOException e){
            e.printStackTrace();
        }


        try
        {

            //the file to be opened for reading
            FileInputStream fis=new FileInputStream("text.txt");
            Scanner sc=new Scanner(fis);    //file to be scanned
            //returns true if there is another line to read
            while(sc.hasNextLine())
            {

                System.out.println(sc.nextLine());      //returns the line that was skipped
            }
            sc.close();     //closes the scanner
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }


//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("text.txt")));
//
//            String line = null;
//
//            while ((line=bufferedReader.readLine())!=null) {
//                System.out.println(line);
//            }
//
//        }catch (IOException e){
//            e.printStackTrace();
//
//        }

//
//        System.out.println("you wanna login ");
//
//        System.out.println("enter email : ");
//        String email2=scan.nextLine();
//        System.out.println("enter password : ");
//        String password2=scan.nextLine();
//
//        try {
//            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("text.txt")));
//
//            String line = null;
//
//            while ((line=bufferedReader.readLine())!=null) {
//                System.out.println(line);
//            }
//
//        }catch (IOException e){
//            e.printStackTrace();
//
//        }














    }
}