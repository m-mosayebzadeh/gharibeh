package ir.soheil.service;

import ir.soheil.exception.BusinessException;
import ir.soheil.util.YearMonthDate;
import org.springframework.stereotype.Service;

@Service
public interface BaseInfoService {

    default Boolean isMoonInScorpio(YearMonthDate yearMonthDate) throws BusinessException {
        return null;
    }
}
