package willard379.bazel.sample;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.io.File;

import org.apache.commons.lang3.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.SystemUtils;
import org.apache.commons.lang3.math.NumberUtils;
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
}
