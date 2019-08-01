import com.akikun.akicore.utils.CheckUtils;
import org.junit.Test;

public class TestCheckUtils
{
    @Test
    public void test_isNumberic()
    {
        String numStr1 = "1234";
        String numStr2 = "-123";
        String numStr3 = "908797";
        String numStr4 = "+12";
        String numStr5 = "90uu070";
        StringBuilder sb = new StringBuilder();
        sb.append("True: ").append(CheckUtils.isNumeric(numStr1)).append(", ")
                .append("True: ").append(CheckUtils.isNumeric(numStr2)).append(", ")
                .append("True: ").append(CheckUtils.isNumeric(numStr3)).append(", ")
                .append("False: ").append(CheckUtils.isNumeric(numStr4)).append(", ")
                .append("False: ").append(CheckUtils.isNumeric(numStr5)).append(", ");
        System.out.println(sb.toString());
    }
}
