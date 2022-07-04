import java.util.Arrays;

public class Main {
	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] list = { 4, 4, 8, 8, 9, 11, 6, 12,5,5 };
		int[] newlist = new int[list.length];
		int index = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i] % 2 == 0) {
				for (int j = 0; j < list.length; j++) {
					if (i != j && list[i] == list[j]) {
						if (!isFind(newlist, list[i])) {
							newlist[index++] = list[i];
						}
						break;
					}
				}
			}
		}
		for (int i : newlist) {
			if (i != 0) {
				System.out.println(i);
			}
		}
	}

}
