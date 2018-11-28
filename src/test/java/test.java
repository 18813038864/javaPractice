public class test {

    public static void main(String[] args){
        try {
            Class classObj = Class.forName("classLoaderDemo.MyTest");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
