package Base;
import java.io.*;
import java.util.Scanner;

/**
 * IO输入输出测试
 */
public class StreamTest {
    public void fileTest(String dir) throws IOException {//文件操作
        File file = new File(dir);
        System.out.println(file.getName());//获取当前文件名
        System.out.println(file.getAbsoluteFile());//获取绝对路径
        File tmpFile = File.createTempFile("aaa",".txt",file);//创建临时文件
        tmpFile.deleteOnExit();//JVM退出时删除文件
    }
    public void ioStreamTest(String dir){//字节流输入输出操作
        try {
                FileInputStream fis = new FileInputStream(dir);//定义输入流
                FileOutputStream fos = new FileOutputStream("newFile.txt");//定义输出流
                PrintStream ps = new PrintStream(fos);//定义处理流
                byte[] bbuf = new byte[1024];//创建buff存储
                int hasRead = 0;//定义保存的数，如果流结束返回-1
                while((hasRead = fis.read(bbuf))>0){//重复取值
                    System.out.println(new String(bbuf,0,hasRead));//将字节数组转换成字符串输出
                    fos.write(bbuf,0,hasRead);//读多少输出多少
                }
                ps.println(fis);//执行输出
                ps.println(new StreamTest());//输出对象

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void readerWriteTest(String dir){//字符流输入输出操作
        try {
            FileReader fr = new FileReader(dir);//定义输入流
            FileWriter fw = new FileWriter("newFile2.txt");//定义输出流
            char[] cbuf = new char[32];
            int hasRead = 0;//定义保存的数，如果流结束返回-1
            while((hasRead = fr.read(cbuf))>0){//重复取值
                System.out.println(new String(cbuf,0,hasRead));//将字符数组转换成字符串输出
                fw.write(cbuf,0,hasRead);//读多少输出多少
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void trans(){//字节转字符流
        try {
            InputStreamReader reader = new InputStreamReader(System.in);//将标准输入转换成字符流
            BufferedReader br = new BufferedReader(reader);//包装reader
            String line = null;
            while((line = br.readLine()) != null){//逐行输入
                if (line.equals("exit")){
                    System.exit(1);
                }
                System.out.println("输出： " + line);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void redirect(String dir){//输入输出重定向
        try {
            PrintStream ps = new PrintStream(new FileOutputStream("out.txt"));//定义输出
            FileInputStream fis = new FileInputStream(dir);//定义输入
            System.setOut(ps);//重定向
            System.setIn(fis);//重定向
            Scanner sc = new Scanner(System.in);
            sc.useDelimiter("\n");//只把回车做分割符
            while (sc.hasNext()){
                System.out.println(sc.next() + " ");
            }
            System.out.println("hahaha");
            System.out.println(new StreamTest());
        }catch (Exception e){
            e.printStackTrace();
        }
    }



    public static void main(String[] args) throws IOException {
        StreamTest st = new StreamTest();
        st.fileTest("StreamTest.java");
        st.ioStreamTest("C:\\Users\\wjw\\IdeaProjects\\Java\\Code\\src\\Base\\StreamTest.java");
        st.readerWriteTest("C:\\Users\\wjw\\IdeaProjects\\Java\\Code\\src\\Base\\StreamTest.java");
        st.trans();
        st.redirect("C:\\Users\\wjw\\IdeaProjects\\Java\\Code\\src\\Base\\StreamTest.java");
    }
}
