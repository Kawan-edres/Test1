import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.APPEND;

public class Login {
    static Scanner scan=new Scanner(System.in);
    static String fileName="account.txt";

    public static void  UserAccount(){
        try{
            System.out.println("-------");
            System.out.println("1-Create user Acccount");
            System.out.println("2-Login");
            System.out.println("Enter you choise");
            String choice=scan.nextLine();
            switch (choice){
                case "1":createAccont();
                break;
                case "2":Login();
                break;
                default:
                    System.out.println("choose one of the options");
                    UserAccount();
                    break;
            }

        }catch (Exception e){
            System.out.println(e);
        }
    }

    static void createAccont(){
        try{
            Path path = Paths.get(fileName.toString());
            OutputStream output=new BufferedOutputStream(Files.newOutputStream(path,APPEND));
            BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(output));


            System.out.println("\nC R E A T E - A C C O U N T \n");

            System.out.print("Enter User Name : ");
            String userName=scan.nextLine();
            System.out.print("Enter Password : ");
            String password=scan.nextLine();

            writer.write(userName+","+password);
            writer.newLine();
            System.out.println("account succesfully saved !");

            writer.close();
            output.close();

            System.out.println("press any key to continue ......");
            String proc=scan.nextLine();
            UserAccount();

        }catch (Exception e){
            System.out.println(e);
        }

    }

    static void Login(){

        try{
            Path path=Paths.get(fileName.toString());
            InputStream input=Files.newInputStream(path);
            BufferedReader reader= new BufferedReader((new InputStreamReader(input)));
            System.out.println("\nL O G I N \n");
            System.out.print("Enter User Name : ");
            String userName=scan.nextLine();
            System.out.print("Enter Password : ");
            String password=scan.nextLine();

            String _temp=null;
            String _user;
            String _password;
            boolean found =false;
            while ((_temp= reader.readLine()) !=null){
                String [] account=_temp.split(",");
                _user=account[0];
                _password=account[1];

                if(_user.equals(userName) && _password.equals(password)){
                    found=true;


                }

                if(found==true){
                    System.out.println("access is granted !");
                }else{
                    System.out.println("access is denied  ! invalud usernmae or password ");
                }
                reader.close();
                System.out.println("press any key to continue ......");
                String proc=scan.nextLine();
                UserAccount();
            }


        }catch(Exception e){

        }

    }
    public static void main(String []args){

        UserAccount();
    }
}
