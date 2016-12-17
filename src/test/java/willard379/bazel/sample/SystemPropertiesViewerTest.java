package willard379.bazel.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.empty;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class SystemPropertiesViewerTest {

	@Test
	public void isEmpty_nullを渡す_trueが返されること() {
		// set up fixture
		String str = null;

		// exercise SUT
		boolean actual = StringUtils.isEmpty(str);

		// verify outcome
		assertThat(actual, is(true));
	}

	@Test
	public void isEmpty_空文字を渡す_trueが返されること() throws Exception {
		// set up fixture
		String str = "";

		// exercise SUT
		boolean actual = StringUtils.isEmpty(str);

		// verify outcome
		assertThat(actual, is(true));
	}

	@Test
	public void isEmpty_ホワイトスペースを渡す_falseが返されること() {
		// set up fixture
		String str = " ";

		// exercise SUT
		boolean actual = StringUtils.isEmpty(str);

		// verify outcome
		assertThat(actual, is(false));
	}

	@Test
	public void isEmpty_bobを渡す_falseが返されること() throws Exception {
		// set up fixture
		String str = "bob";

		// exercise SUT
		boolean actual = StringUtils.isEmpty(str);

		// verify outcome
		assertThat(actual, is(false));
	}

	@Test
	public void isEmpty_前後にホワイトスペースが付いたbobを渡す_falseが返されること() throws Exception {
		// set up fixture
		String str = "  bob  ";

		// exercise SUT
		boolean actual = StringUtils.isEmpty(str);

		// verify outcome
		assertThat(actual, is(false));
	}

	@Test
	public void test() {
		// exercise SUT
		List<String> actual = SystemPropertiesViewer.getAllSystemProperties();

		// verify outcome
		assertThat(actual, is(not(empty())));
	}

	@Test
	public void slowTest() throws Exception {
		Thread.sleep(2 * 60 * 1000);
	}
}
