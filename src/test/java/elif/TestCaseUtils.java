package elif;

import com.akikun.utils.CaseUtils;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.List;

public class TestCaseUtils
{
    @Test
    public void test_ifThen()
    {
        List<String> list = Lists.newArrayList();
        CaseUtils.ifThen(true, () -> list.add("hello"))
                .ifThen(false, () -> list.add("error")).elseThen(() -> list.add("..."))
                .ifThen(true, () -> list.add("world"))
                .DO();
        System.out.println(list);
    }
}
