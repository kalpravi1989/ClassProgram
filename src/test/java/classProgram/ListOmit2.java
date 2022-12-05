package classProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ListOmit2 {
	private List<Integer> mutiplyOmit2(List<Integer> al) {
		List<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < al.size(); i++) {
			int x = al.get(i) * 2;
			if (x % 10 == 2 || x % 100 == 2) {
				al.remove(i);
				i--;
			} else {
				result.add(x);
			}
		}
		return result;
	}
	@Test
	public void test1() {
		List<Integer> al = new ArrayList(Arrays.asList(2, 6, 11));
		List<Integer> ans = mutiplyOmit2(al);
		System.out.println(ans);
		List<Integer> exp = new ArrayList(Arrays.asList(4));
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test2() {
		List<Integer> al = new ArrayList(Arrays.asList(1, 4, 66));
		List<Integer> ans = mutiplyOmit2(al);
		System.out.println(ans);
		List<Integer> exp = new ArrayList(Arrays.asList(8));
		Assert.assertEquals(ans, exp);
	}

	@Test
	public void test3() {
		List<Integer> al = new ArrayList(Arrays.asList(1, 2, 3));
		List<Integer> ans = mutiplyOmit2(al);
		System.out.println(ans);
		List<Integer> exp = new ArrayList(Arrays.asList(4, 6));
		Assert.assertEquals(ans, exp);
	}

}
