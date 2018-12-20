import io.qameta.allure.Description;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class DemoTest {
    @Test
    public void demo(){
        assertThat(1, equalTo(2));

    }

    @Test
    @Description("simple testcase")
    public void simple(){
        assertThat(1, equalTo(2));

    }

    @Test
    public void demo2(){
        assertThat(1, equalTo(2));

    }


}

