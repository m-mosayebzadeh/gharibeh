package ir.soheil.controller;

import ir.soheil.enums.ResponseModelStatus;
import ir.soheil.exception.BusinessException;
import ir.soheil.model.ResponseModel;
import ir.soheil.service.BaseInfoService;
import ir.soheil.util.DateUtil;
import ir.soheil.util.YearMonthDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping("/common")
public class BaseInfoController {

    @Autowired
    BaseInfoService baseInfoService;

    @RequestMapping(value = "/isMoonInScorpio", method = RequestMethod.POST)
    public ResponseEntity isMoonInScorpio(@RequestBody YearMonthDate request) throws BusinessException {

        Boolean moonInScorpio = baseInfoService.isMoonInScorpio(request);

        return ResponseEntity.ok(
                new ResponseModel<Boolean>(
                        ResponseModelStatus.SUCCESS.getStatus(),
                        "message.is.valid",
                        Arrays.asList(moonInScorpio)
                )
        );
    }
}
