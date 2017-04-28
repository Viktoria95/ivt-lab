package hu.bme.mit.spaceship;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

public class GT4500Test {

  private GT4500 ship;
  private TorpedoStore mock1, mock2;
  

  @Before
  public void init(){
    mock1 = mock(TorpedoStore.class);
    mock2 = mock(TorpedoStore.class);
    this.ship = new GT4500(mock1, mock2);
  }

  @Test
  public void fireTorpedos_Single_Success(){
    // Arrange

    // Act
    boolean result = ship.fireTorpedos(FiringMode.SINGLE);

    verify(mock1, times(1)).getProdPrice("1");
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
