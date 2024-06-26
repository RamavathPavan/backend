import java.io.FileOutputStream;
public class FileOutputStreamExample{
    public static void main(String[] args){
        String s="hello world java";
        try{
            FileOutputStream fount=new FileOutputStream("C:\\java programs\\pavanprograms\\pavanprograms03\\123.txt");
            byte[] b=s.getBytes();
            fount.write(b);
            fount.flush();
            fount.close();
             System.out.println("success...");

}catch(Exception e)
{
    System.out.println(e);
}
}
}



    

