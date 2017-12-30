package ${groupId};

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {

    @Test
    public void test() {
        assertThat(1).isBetween(0, 2);
    }

}