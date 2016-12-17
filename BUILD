java_binary(
	name = "system-properties-viewer",
	srcs = glob(["src/main/java/**/*.java",]),
	main_class = "willard379.bazel.sample.SystemPropertiesViewer",
	deps = ["commons_lang3",],
)

java_library(
	name = "system-properties-viewer-lib",
	srcs = glob(["src/main/java/**/*.java",]),
	deps = ["commons_lang3"],
)

java_test(
    name = "system-properties-viewer-test",
    size = "small",
    srcs = glob(["src/test/java/**/*.java",]),
    test_class = "willard379.bazel.sample.AllTests",
    deps = [
        "system-properties-viewer-lib",
        "commons_lang3",
        "junit",
        "hamcrest_all",
        "takari_cpsuite",
    ],
)

java_library(
	name = "commons_lang3",
	exports = ["@commons_lang3//jar",],
)

java_library(
	name = "junit",
	exports = ["@junit//jar",],
)

java_library(
	name = "hamcrest_all",
	exports = ["@hamcrest_all//jar",],
)

java_library(
	name = "takari_cpsuite",
	exports = ["@takari_cpsuite//jar",],
)
