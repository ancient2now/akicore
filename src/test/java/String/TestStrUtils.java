package String;

import com.akikun.utils.StrUtils;
import org.junit.Test;

public class TestStrUtils
{
    @Test
    public void test_recombineStrByInterval()
    {
        String testStr = "abcdef1234.0798w3ljoaljhoj";
        String res1 = StrUtils.recombineStrByInterval(testStr, 3, ", ");
        String res2 = StrUtils.recombineStrByInterval(testStr, 5, ".");
        String res3 = StrUtils.recombineStrByInterval(testStr, 1, "-");
        System.out.println("result:\nres1: " + res1 + "\nres2: " + res2 + "\nres3: " + res3);
    }
}
