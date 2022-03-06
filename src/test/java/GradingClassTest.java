import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GradingClassTest {

    @Test
    void printGradeWhenIntInputBetweenZeroAndHundred() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 55;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "D";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }


    @Test
    void printInvalidWhenIntInputNegative() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = -55;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "Grade not valid";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void printInvalidWhenIntInputOverOneHundred() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 105;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "Grade not valid";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void printInvalidWhenIntInputIsZero() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 0;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "Fail";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }
    @Test
    void printInvalidWhenIntInputIs65() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 65;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "C";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void printInvalidWhenIntInputIs75() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 75;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "B";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void printInvalidWhenIntInputIs85() {
        //GIVEN
        GradingClass gradingClass = new GradingClass();
        int input = 85;

        //WHEN
        String actual = gradingClass.returnGrade(input);
        String expected = "A";
        //THEN

        assertThat(actual).isEqualTo(expected);
    }
}