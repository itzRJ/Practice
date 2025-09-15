import org.junit.Test;

public class PatternsTest {
    @Test
    public void testAllPatterns()
    {
        Patterns pattern = new Patterns();
        pattern.squareStar();
        pattern.rightTriangleStar();
        pattern.rightTriangleNums();
        pattern.invertedRightTriangleStar();
        pattern.pyramidStar();
        pattern.diamondStar();
        pattern.pascalsTriangle();
        pattern.pyramidNums();
        pattern.hollowSquareStar();
        pattern.floydsTriangle();
        pattern.hollowPyramidStar();
    }
}
