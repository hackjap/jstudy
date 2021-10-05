
# 로깅 

## 로깅 라이브러리 
- slf4j
  - 인터페이스이며 Logback의 slf4j 인터페이스의 구현체 
- Logback 
    - 스프링 부트에서 기본 제공 
 
 > privat static final Logger log = LoggerFactory.getLogger(getClass);

### 로그 레벨 지정
  > logging.level.hello.sprimgmvc=trace
    trace : 모든 로그 
    debug : 개발용 
    info :  서비스용 

### 올바른 사용법 

log.trace(" info log = " +  name);  ( X ) 
log.trace(" info log = {}", name);  ( O ) 
-> 연산으로 인한 쓸모없는 리소스 사용을 방지 


###
    



