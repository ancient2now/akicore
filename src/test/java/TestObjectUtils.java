import com.akikun.akicore.utils.ObjectUtils;
import data.Person;
import org.junit.Test;

public class TestObjectUtils
{
    @Test
    public void test_equals_01()
    {
        Person p = new Person();
        p.setName("Peter");
        boolean trueRes = ObjectUtils.equals(p, Person::getName, "Peter");
        boolean falseRes = ObjectUtils.equals(p, Person::getName, "Robert");
        System.out.println("Result: " + trueRes + ",  " + falseRes);
    }

    @Test
    public void test_hasNull()
    {
        Person p1 = new Person();
        Person p2 = null;
        boolean p1Res = ObjectUtils.hasNull(p1, p1.getName());
        System.out.println("True: " + p1Res);
    }
}
