java_binary(
	name = "system-properties-viewer",
	srcs = glob(["src/main/java/**/*.java",]),
	main_class = "willard379.bazel.sample.SystemPropertiesViewer",
	deps = ["@commons_lang3//jar",],
)

java_library(
	name = "system-properties-viewer-lib",
	srcs = glob(["src/main/java/**/*.java",]),
	deps = ["@commons_lang3//jar"],
)

java_test(
	name = "system-properties-viewer-test",
	size = "small",
	srcs = glob(["src/test/java/**/*.java",]),
	test_class = "willard379.bazel.sample.AllTests",
	deps = [
		":system-properties-viewer-lib",
		"@commons_lang3//jar",
		"@junit//jar",
		"@hamcrest_all//jar",
		":takari_cpsuite",
	],
)

java_import(
	name = "takari_cpsuite",
	jars = [
		"lib/takari-cpsuite-1.2.7.jar",
	],
)