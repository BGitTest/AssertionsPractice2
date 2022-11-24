package org.example;

import org.openqa.selenium.By;

import java.util.Set;

public class FaceBook extends Utils
    {
        public void switchToChildWindowToParent()
     {
    // get the current window handle
    String parentHandle = driver.getWindowHandle();
 for(String handle: driver.getWindowHandles())
  {
    if (!parentHandle.equals(handle))
        driver.switchTo().window(handle);
  }

      }
}
