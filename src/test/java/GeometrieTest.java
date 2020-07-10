import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import src.Geometrie;

public class GeometrieTest extends TestCase {

    public void testIsCarre() {
        //arrange
        int coteA = 10;
        int coteB = 10;
        int coteAPrime = 10;
        int coteBPrime = 8;
        //act
        boolean sut1 = Geometrie.isCarre(coteA, coteB);
        boolean sut2 = Geometrie.isCarre(coteAPrime, coteBPrime);
        //assert
        assertTrue(sut1);
        assertFalse(sut2);
    }

    public void testAireCarre() {
        //arrange
        int coteA = 2;
        int coteB = 2;
        //act
        float sut1 = Geometrie.aireCarre(coteA, coteB);
        //assert
        assertEquals((float)4, sut1);
    }

    public void testAireTriangle() {
        //arrange
        int base = 3;
        int hauteur = 2;
        //act
        float sut1 = Geometrie.aireTriangle(base, hauteur);
        //assert
        assertEquals((float)3, sut1);
    }

    public void testIsIsocele() {
        //arrange
        int coteA = 3;
        int coteB = 2;
        int coteC = 2;
        int coteAPrime = 3;
        int coteBPrime = 0;
        int coteCPrime = 1;
        int coteASeconde = 1;
        int coteBSeconde = 1;
        int coteCSeconde = 1;
        //act
        boolean sut1 = Geometrie.isIsocele(coteA, coteB, coteC);
        boolean sut2 = Geometrie.isIsocele(coteAPrime, coteBPrime, coteCPrime);
        boolean sut3 = Geometrie.isIsocele(coteASeconde, coteBSeconde, coteCSeconde);
        //assert
        assertTrue(sut1);
        assertFalse(sut2);
        assertTrue(sut3);
    }

    public void testIsEquilateral() {
        //arrange
        int coteAB = 5;
        int coteBC = 5;
        int coteCA = 5;
        int coteBA = 6;
        //act
        Boolean isTrue = Geometrie.isEquilateral(coteAB, coteBC, coteCA);
        Boolean isFalse = Geometrie.isEquilateral(coteBA, coteBC, coteCA);
        //assert
        assertTrue(isTrue);
        assertFalse(isFalse);
    }

    public void testisRectangle() {
        //arrange
        int coteAB = 5;
        int coteBC = 4;
        int coteCA = 3;
        int coteBA = 11;
        //act
        Boolean isTrue = Geometrie.isRectangle(coteAB, coteBC, coteCA);
        Boolean isFalse = Geometrie.isRectangle(coteBA, coteBC, coteCA);
        //assert
        assertTrue(isTrue);
        assertFalse(isFalse);
    }
}
