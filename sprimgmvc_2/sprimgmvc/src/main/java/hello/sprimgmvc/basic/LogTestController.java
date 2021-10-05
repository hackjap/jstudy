package hello.sprimgmvc.basic;


import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// controller 는 String 반환시, 뷰 이름이 반환되지만
// RestController는 String 반환시 , 문자열이 반환
@RestController
@Slf4j
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping("/log-test")
    private String logTest() {
        String name = "Spring";


        System.out.println("name = " + name);


        //  로그 레벨 지정
        log.trace(" info log = {}", name);
        log.debug(" info log = {}", name);
        log.info(" info log = {}", name);
        log.warn(" info log = {}", name);
        log.error(" info log = {}", name);

        return "ok";

    }
}
