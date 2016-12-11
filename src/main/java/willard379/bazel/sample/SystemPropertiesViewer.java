package willard379.bazel.sample;

public class SystemPropertiesViewer {

	public static void main(String[] args) {
		System.getProperties()
			.entrySet()
			.stream()
			.map(e -> String.format("%s : %s", e.getKey(), e.getValue()))
			.sorted()
			.forEach(System.out::println);
	}
}
