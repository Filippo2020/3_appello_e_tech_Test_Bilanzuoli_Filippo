package ListOps;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListOpsTest1 {
	
	//test back-box
	@Test
    void testIntersectionEmptyLists() {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> expected = new ArrayList<>();

        List<Integer> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testIntersectionSameList() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(1, 2, 3, 4);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4);

        List<Integer> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testIntersectionDifferentLists() {
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
        List<Integer> list2 = Arrays.asList(2, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 3, 4);

        List<Integer> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testIntersectionWithDuplicates() {
        List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 4, 4);
        List<Integer> list2 = Arrays.asList(2, 2, 3, 3, 4, 5);
        List<Integer> expected = Arrays.asList(2, 3, 4);

        List<Integer> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testIntersectionWithNull() {
        List<Integer> list1 = Arrays.asList(1, 2, null, 3);
        List<Integer> list2 = Arrays.asList(null, 3, 4, 5);
        List<Integer> expected = Arrays.asList(null, 3);

        List<Integer> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    }

    @Test
    void testIntersectionWithDifferentTypes() {
        List<? extends Number> list1 = Arrays.asList(1, 2.0, 3.5);
        List<Integer> list2 = Arrays.asList(1, 2, 3);
        List<Integer> expected = Arrays.asList(1);

        List<Number> result = ListOps.list_intersection(list1, list2);

        Assertions.assertEquals(expected, result);
    } 
    
}
