package modules;


import lombok.extern.slf4j.Slf4j;
import lombok.val;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

@Slf4j
public class DefaultLabirintFieldCreaterTest {

    @BeforeClass
    public static void before() {

    }

    @Test
    public void createLabirint() {

        log.debug("TestStarted");
        val labCreator = new DefaultLabirintFieldCreater(5, 5);
        val labirint = labCreator.createLabirint();
        for (int[] line : labirint) {
            log.debug(Arrays.toString(line));
        }
    }
}
