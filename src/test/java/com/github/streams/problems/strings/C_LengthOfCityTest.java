package com.github.streams.problems.strings;

import com.github.streams.solutions.GeneralStringProblemsSolution;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * Calculates the length of city names that start with 'm' or 'M'. <br>
 * <br>
 *
 * <h3>Example Cities</h3>
 *
 * <ul>
 *   <li>Mumbai
 *   <li>Munnar
 *   <li>Chennai
 *   <li>Hyderabad
 * </ul>
 */
class C_LengthOfCityTest {
  @Test
  @Disabled
  void testCalculateLengthOfEachCityTest() {
    final var cities = List.of("Mumbai", "Munnar", "Chennai", "Hyderabad");
    final var mySolution = GeneralStringProblemsSolution.findLengthOfEachCityAlongWithSize(cities);

    final Map<String, Integer> yourSolution = new HashMap<>();
    Assertions.assertEquals(yourSolution, mySolution);
  }
}
