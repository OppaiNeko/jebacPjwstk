package pl.edu.pjwstk.mpr;

import org.junit.Test;

import java.math.BigDecimal;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class WeightedAverageTest {
    @Test
    public void should_create_class() {
        var average = new WeightedAverage();

        assertThat(average).isNotNull();

    }

    @Test
    public void should_calculate_simple_average(){
        //assume??
        var average = new WeightedAverage("average/test_avg_1.txt");

        //act
        var avg = average.calculate();

        //assert
        assertThat(avg).isEqualTo(4);

    }
    @Test
    public void should_throw_when_file_does_not_exist(){

        var average = new WeightedAverage("asdfgad.txt");

        assertThatThrownBy(average::calculate)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("File does not exist.");

    }
    @Test
    public void should_throw_when_file_does_not_specified(){

        var average = new WeightedAverage();
        assertThatThrownBy(average::calculate)
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("File has not been specified.");

    }




    @Test
    public void should_throw_when_content_of_a_file_has_wrong_format() {
        throw new UnsupportedOperationException("TODO");
    }


    @Test
    public void should_calculate_average_of_large_file() {
        throw new UnsupportedOperationException("TODO");
    }

    @Test
    public void should_calculate_average_example_1() {
        throw new UnsupportedOperationException("TODO");

    }

    @Test
    public void should_calculate_average_example_2() {
        throw new UnsupportedOperationException("TODO");

    }

    @Test
    public void should_remove_trailing_zeros_1() {
        throw new UnsupportedOperationException("TODO");

    }



}