java_binary(
	name = "system-properties-viewer",
	srcs = glob(["**/*.java"]),
	main_class = "willard379.bazel.sample.SystemPropertiesViewer",
	deps = ["commons_lang3"],
	runtime_deps = ["junit", "hamcrest_all"],
)

java_library(
	name = "commons_lang3",
	exports = ["@commons_lang3//jar"],
)

java_library(
	name = "junit",
	exports = ["@junit//jar"],
)

java_library(
	name = "hamcrest_all",
	exports = ["@hamcrest_all//jar"],
)
