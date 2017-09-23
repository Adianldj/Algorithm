package DFS;

import java.util.ArrayList;
import java.util.List;

public class permutation {
	public List<String> permute(String set) {
		List<String> result = new ArrayList<String>();
		if (set == null) {
			return result;
		}
		char[] array = set.toCharArray();
		dfs(array, 0, result);
		return result;
	}

	private void dfs(char[] array, int index, List<String> result) {
		if (index == array.length) {
			result.add(new String(array));
			return;
		}
		for (int i = index; i < array.length; i++) {
			swap(array, index, i);
			dfs(array, index + 1, result);
			swap(array, index, i);
		}
	}

	public void swap(char[] array, int i, int j) {
		char temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	public static void main(String[] args) {
		permutation solution = new permutation();
		List<String> result;

		String set = null;
		result = solution.permute(set);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}
		set = "abc";
		result = solution.permute(set);
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));

		}

	}
}
