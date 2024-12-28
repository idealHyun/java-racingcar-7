package racingcar.view;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class InputValidatorTest {
    InputValidator inputValidator = new InputValidator();

    @Test
    void shouldThrowExceptionWhenCarNamesAreEmpty() {
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validateCarNamesFormat(""); // 빈 문자열
        });
    }

    @Test
    void shouldThrowExceptionWhenCarNameIsEmptyInCommaSeparatedList() {
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validateCarNamesFormat("a,,c"); // ,로 구분된 문자열 중 하나가 빈 문자열
        });
    }

    @Test
    void shouldThrowExceptionWhenCarNameIsDuplicateInCommaSeparatedList() {
        assertThrows(IllegalArgumentException.class, () -> {
            inputValidator.validateCarNamesFormat("a,a,c"); // 중복되는 값 존재
        });
    }

    @Test
    void shouldNotThrowExceptionWhenCarNamesAreValid() {
        inputValidator.validateCarNamesFormat("a,b,c"); // 유효한 형식
    }
}
