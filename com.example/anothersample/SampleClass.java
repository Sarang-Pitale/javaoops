package anothersample;
import com.example.sample.Box;

public class SampleClass {
    public static void main(String[] a){
        Box obj=new Box();
      //  obj.calculateArea();// calculateArea is not public so not accessible but it is accessible in same package i.e. in Sample1
    }
}
