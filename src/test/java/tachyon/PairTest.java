package tachyon;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit tests for tachyon.Pair
 */
public class PairTest {
  private String strType = "test";
  private Integer integerType = 7883;
  private Long longType = 9887L;
  private Double doubleType = 3.14159;
  private Boolean boolType = false;
  private Character charType = 'a';
  private Object[] obj = new Object[6];

  @Test
  public void constructorTest() {
    obj[0] = strType;
    obj[1] = integerType;
    obj[2] = longType;
    obj[3] = doubleType;
    obj[4] = boolType;
    obj[5] = charType;

    for (int k = 0; k < 5; k ++) {
      Pair tPair = new Pair(obj[k], obj[k + 1]);
      Assert.assertEquals(obj[k], tPair.getFirst());
      Assert.assertEquals(obj[k + 1], tPair.getSecond());
      Assert.assertNotSame(obj[k + 1], tPair.getFirst());
      Assert.assertNotSame(obj[k], tPair.getSecond());
    }
  }
}