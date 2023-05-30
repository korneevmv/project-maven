import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.fail;

public class StrangeTest {

    @Test
    @Deprecated
    public void shouldFail() {
        fail("By design");
    }
}