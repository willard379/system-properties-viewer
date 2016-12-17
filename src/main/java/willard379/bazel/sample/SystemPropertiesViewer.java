package willard379.bazel.sample;

import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.StringEscapeUtils;

public class SystemPropertiesViewer {

	public static void main(String[] args) {
		getAllSystemProperties().stream().forEach(System.out::println);
	}

	public static List<String> getAllSystemProperties() {
		return System.getProperties()
			.entrySet()
			.stream()
			.map(e -> String.format("%s : %s", e.getKey(), StringEscapeUtils.escapeJava((String) e.getValue())))
			.sorted().collect(Collectors.toList());
	}
}
