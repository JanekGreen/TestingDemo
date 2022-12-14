package com.sda;

import com.sda.person.Person;
import org.assertj.core.api.ListAssert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class AssertionsExamplesAssertJ {
    @Test
    void assertionsExamples() {
        Adder adder = new Adder();
        Integer result = adder.add(2, 3);
        /*to samo co Assertions.assertEquals*/
        assertThat(result).isEqualTo(5);
        assertThat(result == 5).isTrue();
        assertThat(result == 6).isFalse();
        assertThat(result).isNotEqualTo(6);
        assertThat(result).isNotNull();
        Person person = null;
        assertThat(person).isNull();

        assertThat(Arrays.asList(1, 2, 3))
                .hasSize(3)
                .containsExactly(1, 2, 3);

        assertThat("pawel")
                .startsWith("p")
                .contains("pawe")
                .endsWith("l");



    }
}
