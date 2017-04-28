package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private DataAccess mock1, mock2;

  @Before
  public void init(){
    mock1 = mock(DataAccess.class);
    mock2 = mock(DataAccess.class);
    this.ship = new GT4500(mock1, mock2);
  }

  @Test
  public void fireTorpedos_Single_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedos(FiringMode.SINGLE);

    // Assert
    assertEquals(true, result);
  }

  @Test
  public void fireTorpedos_All_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedos(FiringMode.ALL);

    // Assert
    assertEquals(true, result);
  }

}
