import com.akikun.akicore.utils.ObjectUtils;
import data.Person;
import org.junit.Test;

public class TestObjectUtils
{
    @Test
    public void TestEquals01()
    {
        Person p = new Person();
        p.setName("Peter");
        boolean trueRes = ObjectUtils.equals(p, Person::getName, "Peter");
        boolean falseRes = ObjectUtils.equals(p, Person::getName, "Robert");
        System.out.println("Result: " + trueRes + ",  " + falseRes);
    }
}
