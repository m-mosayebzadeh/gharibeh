package ir.soheil.service.validator;

import ir.soheil.exception.BusinessException;
import ir.soheil.util.YearMonthDate;
import ir.soheil.util.validator.DateUtilValidator;
import org.springframework.stereotype.Component;

@Component
public class BaseInfoValidator {

    public void isMoonInScorpioValidator(YearMonthDate yearMonthDate) throws BusinessException {
        DateUtilValidator.yearMonthDateValidator(yearMonthDate);
    }


}
