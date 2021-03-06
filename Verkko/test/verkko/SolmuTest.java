/*
 * Saa käyttää ihan vapasti
 * Public domain
 */
package verkko;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Arvoitusmies
 */
public class SolmuTest {

    /**
     *
     */
    public SolmuTest() {
    }

    /**
     *
     */
    @BeforeClass
    public static void setUpClass() {
    }

    /**
     *
     */
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     *
     */
    @Before
    public void setUp() {
    }

    /**
     *
     */
    @After
    public void tearDown() {
    }

    /**
     * Test of dimensio method, of class KoordinoituSolmu.
     */
    @Test
    public void testDimensio() {
        Double[] koord = {3.1, -7.7, 123.0, -345.8};
        Solmu instance = new Solmu(koord);
        Integer expResult = 4;
        Integer result = instance.dimensio();
        assertEquals(expResult, result);
        Double[] koord2 = {1.5};
        instance = new Solmu(koord2);
        expResult = 1;
        result = instance.dimensio();
        assertEquals(expResult, result);
    }

    /**
     * Test of koordinaatti method, of class KoordinoituSolmu.
     */
    @Test
    public void testKoordinaatti() {
        Double[] koord = {3.1, -7.7, 123.0, -345.8};
        Solmu instance = new Solmu(koord);
        for (int i = 0; i < koord.length; i++) {
            assertEquals(koord[i], instance.koordinaatti(i));
        }
    }

    /**
     * Test of euklidinenEtaisyys method, of class KoordinoituSolmu.
     */
    @Test
    public void testEuklidinenEtaisyys() {
        Double[] koord = {0.0, 0.0};
        Double[] koord2 = {3.0, 4.0};
        Solmu ks = new Solmu(koord);
        Solmu instance = new Solmu(koord2);
        Double expResult = 5.0;
        Double result = instance.euklidinenEtaisyys(ks);
        assertEquals(expResult, result, 0.01);

        Double[] toinenkoord = {-5.1, -1.1};
        Double[] toinenkoord2 = {3.5, 5.5};
        ks = new Solmu(toinenkoord);
        instance = new Solmu(toinenkoord2);
        expResult = 10.840664186294122080275713661974;
        result = instance.euklidinenEtaisyys(ks);
        assertEquals(expResult, result, 0.01);
    }

    /**
     * Test of taksimiehenEtaisyys method, of class KoordinoituSolmu.
     */
    @Test
    public void testTaksimiehenEtaisyys() {
        Double[] koord = {0.0, 0.0};
        Double[] koord2 = {3.0, 4.0};
        Solmu ks = new Solmu(koord);
        Solmu instance = new Solmu(koord2);
        Double expResult = 7.0;
        Double result = instance.taksimiehenEtaisyys(ks);
        assertEquals(expResult, result, 0.01);

        Double[] toinenkoord = {-5.1, -1.1};
        Double[] toinenkoord2 = {3.5, 5.5};
        ks = new Solmu(toinenkoord);
        instance = new Solmu(toinenkoord2);
        expResult = 15.2;
        result = instance.taksimiehenEtaisyys(ks);
        assertEquals(expResult, result, 0.01);
    }

}
