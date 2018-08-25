import com.klb.entity.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by klb on 25.08.18.
 */
public class PersonTest {

    @Test
    public void testRemove() {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Asia"));
        list.add(new Person(2, "Basia"));

        list.remove(new Person(2, "Basia"));

        //dokonczyc test - assert.....

        assertEquals(1, list.size());
    }
}
