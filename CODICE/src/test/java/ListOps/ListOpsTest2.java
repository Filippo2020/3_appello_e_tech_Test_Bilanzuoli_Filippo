package ListOps;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class ListOpsTest2 {

	 @Test
	  void testListIntersectionWithNullList() {
	    	assertThrows(NullPointerException.class, () -> {
	            ListOps.list_intersection(null, Arrays.asList(1, 2, 3));
	        });
		}
		
		@Test
		void testListIntersectionWithEmptyList() {
			List<Integer> list1 = new ArrayList<>();
			List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
			List<Integer> result = ListOps.list_intersection(list1, list2);
			assertEquals(0, result.size());
		}
		
		@Test
		void testListIntersectionWithNoIntersection() {
			List<Integer> list1 = new ArrayList<>(Arrays.asList(4, 5, 6));
			List<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3));
			List<Integer> result = ListOps.list_intersection(list1, list2);
			assertEquals(0, result.size());
		}
		
		@Test
		void testListIntersectionWithIntersection() {
			List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3));
			List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4));
			List<Integer> result = ListOps.list_intersection(list1, list2);
			assertEquals(2, result.size());
			assertEquals(true, result.contains(2));
			assertEquals(true, result.contains(3));
		}
		
		@Test
		void testListIntersectionWithDuplicateElements() {
			List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 2, 3));
			List<Integer> list2 = new ArrayList<>(Arrays.asList(2, 2, 3, 4));
			List<Integer> result = ListOps.list_intersection(list1, list2);
			assertEquals(2, result.size());
			assertEquals(true, result.contains(2));
			assertEquals(true, result.contains(3));
		}

}
