package test;

public class ReaderExecution {
    public static void main(String[] args) {
        DataReader dataReader = new DataReader();
        String result=dataReader.readerMethod("src\\test\\textFile.txt");
        System.out.println(result);
    }
}
