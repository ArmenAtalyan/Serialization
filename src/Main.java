import java.io.*;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Vardan Aramyan", 22, "gdu22bu", "man");
        User user2 = new User("Lilit Sahakyan", 28, "dzk98wku", "woman");

        try(ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("E:\\Armen.txt"))) {
            out.writeObject(user1);
            out.writeObject(user2);
        }catch (IOException e){
            e.printStackTrace();
        }

        User user3 = null;
        User user4 = null;

        try(ObjectInputStream inputStream  = new ObjectInputStream(new FileInputStream("E:\\Armen.txt"))) {
           user3 = (User)inputStream.readObject();
           user4 = (User)inputStream.readObject();

            System.out.println(user3.toString());
            System.out.println(user4.toString());
            System.out.println(user3.isServe());
            System.out.println(user4.isServe());

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
