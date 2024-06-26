import java.io.FileInputStream;
public class Streamwhile{
    public static void main(String[]args){
        try{
            FileInputStream fin=new FileInputStream("C:\\java programs\\pavanprograms\\pavanprograms03\\123.txt");
            int i=0;
            while((i=fin.read())!=-1)
            {
                System.out.println((char)i);

            }
            fin.close();

        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

    

