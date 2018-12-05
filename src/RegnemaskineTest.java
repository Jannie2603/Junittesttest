import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

public class RegnemaskineTest {

    Regnemaskine minTestRegn = new Regnemaskine();

    @org.junit.Test
    public void lægsammen() {

        //setup

        assertEquals(minTestRegn.lægsammen(3, 7), 10);

    }

    @org.junit.Test
    public void tjekÅrstal() {

        //setup

       assertEquals(minTestRegn.årstal,2018);

    }

    @Before
    public void setUp() throws Exception {

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

    }

    @Test
    public void name() {
    }
}