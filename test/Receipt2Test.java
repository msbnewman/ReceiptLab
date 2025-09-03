import static com.google.common.truth.Truth.assertThat;
import static com.google.common.truth.Truth.assertWithMessage;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Receipt2Test {

  @Test
  @Order(0)
  @DisplayName("Test intArrayToList correctness")
  public void test1() {
    
    // action
    // assertion

  }
}
