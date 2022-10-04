import java.io.*;

public class Copy {
    File create1,create2;
    FileInputStream input;
    FileOutputStream output,output2;
    Copy()throws IOException
    {
        create1=new File("D:/java_Learn/第六章输入输出-复制文件/file.text");
        create2=new File("D:/java_Learn/第六章输入输出-复制文件/newfile.text");
        System.out.println("是否创建成功"+create1.exists());

             input=new FileInputStream(create1);
        /*   for(int i=0;i<create1.length();i++)//注意输入流使用完后，内部就没有数据了，不能重复使用
           {
               char ch=(char)input.read();
               System.out.print(ch);
           }
           */
            byte []buf=new byte[100];
            output=new FileOutputStream(create2);
       //     System.out.println(input.read(buf));
            int count;
            while((count=input.read(buf))!=-1)
            {
                output.write(buf,0,count);
            }
            input.close();
            output.close();

    }
    public static void main(String []args)
    {
        try
        {
            new Copy();
            }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
