import com.akikun.akicore.utils.StringUtils;
import org.junit.Test;

public class TestStringUtils
{
    @Test
    public void test_recombineStrByInterval()
    {
        String testStr = "abcdef1234.0798w3ljoaljhoj";
        String res1 = StringUtils.recombineStrByInterval(testStr, 3, ", ");
        String res2 = StringUtils.recombineStrByInterval(testStr, 5, ".");
        String res3 = StringUtils.recombineStrByInterval(testStr, 1, "-");
        System.out.println("result:\nres1: " + res1 + "\nres2: " + res2 + "\nres3: " + res3);
    }
}
