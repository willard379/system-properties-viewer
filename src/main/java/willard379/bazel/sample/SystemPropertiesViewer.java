package willard379.bazel.sample;

import org.apache.commons.lang3.StringEscapeUtils;

public class SystemPropertiesViewer {

	public static void main(String[] args) {
		System.getProperties()
			.entrySet()
			.stream()
			.map(e -> String.format("%s : %s", e.getKey(), StringEscapeUtils.escapeJava((String) e.getValue())))
			.sorted()
			.forEach(System.out::println);
	}
}
