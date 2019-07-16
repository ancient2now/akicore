package collection;

import com.akikun.CollectionUtils;
import com.google.common.collect.ImmutableList;
import data.Gender;
import data.Person;
import org.junit.Test;

import java.util.List;
import java.util.function.Function;

public class TestList
{
    /**
     * 测试list对象去重
     * @see com.akikun.CollectionUtils#distinct(List, Function)
     */
    @Test
    public void test_distinct()
    {
        List<Person> list = ImmutableList.of(
                new Person("A", Gender.MALE, 18), //
                new Person("B", Gender.MALE, 19), //
                new Person("C", Gender.FEMALE, 20), //
                new Person("A", Gender.FEMALE, 19)); //
        List<Person> resultList = CollectionUtils.distinct(list, Person::getName);
        System.out.println("size: " + resultList.size());
        System.out.print("result: " + resultList);
    }
}
