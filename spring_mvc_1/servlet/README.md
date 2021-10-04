

# HTTP 요청 메시지 데이터 전달(클라이언트 -> 서버) - HttpRequest
## 1.HTTP 요청 데이터 - GET 쿼리 파라미터
- 검색필터, 페이징에 주로 사용

## 2.HTTP 요청 데이터 - POST HTML FORM
- HTTP 메세지 바디에 데이터를 전달하기 떄문에 데이터 형식을 지정해줘야 한다.(apllication/x-www-urlreloaded)
- request.getParameter() 
> request.getParameter()는 GET URL 쿼리 파라미터 형식도 지원하고, POST HTML FORM 형식도 둘다 지원

## 3.HTTP 요청 데이터 - API 메시지 바디 - 단순 텍스트
- HTTP message body에 데이터를 직접 담아서 요청
## 3.HTTP 요청 데이터 - API 메시지 바디 - JSON
- application/json
- JSON <-파싱-> 객체 
    
       // JSON 객체 파싱(Jackon)
        private ObjectMapper objectMapper = new ObjectMapper();
        HelloData helloData = objectMapper.readValue(messageBody, HelloData.class);

        System.out.println("helloData.getUsername() = " + helloData.getUsername());
        System.out.println("helloData.getAge() = " + helloData.getAge());

        response.getWriter().write("ok");



# HTTP 요청 메시지 데이터 전달(서버 -> 클라이언트) - HttpRequest


## JSON 

  @WebServlet(name = "responseJsonServlet", urlPatterns = "/response-json")
  public class ResponseJsonServlet extends HttpServlet {
  
      ObjectMapper objectMapper = new ObjectMapper();
  
      @Override
      protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
          // Content-Type : application/json
          response.setContentType("application/json");
          response.setCharacterEncoding("utf-8");
  
          HelloData helloData = new HelloData();
          helloData.setUsername("kim");
          helloData.setAge(20);
  
          String result = objectMapper.writeValueAsString(helloData);
          response.getWriter().write(result);
  
      }

     }


# Servlet, JSP, MVC

## Servlet
 - 자바코드로 구현해야하는 HTML 처리가 쉽지않음 
 - 따라서 HTML을 따로 제어할 수 있는 템플릿 엔진을 사용(JSP,thymeleaf)

## JSP
 - HTML을 다루기는 용이하나 비즈니스로직과 뷰 영역을 한곳에서 관리하기 떄문에 비효율적
 - UI와 비즈니스 로직의 변경되는 라이프 사이클 관리 

## MVC 
 - 컨트롤러(컨트롤러 로직, 서비스 ,레포지토리)
 - 모델(컨트롤러에서 받은 데이터를 보관하고 뷰에게 데이터를 전달해줌)
 - 뷰( 모델로부터 데이터를 참조하여 클라이언트에게 보여지는 영역을 관리)
 - 하지만, 포워드 및 viewPath의 중복, 등 공통처리가 어려움
 - 따라서 MVC 프레임 워크의 근간인 "Front-Controller" 를 구현해야함 - dispatcher Survlet



# FrontController

## 유연한 컨트롤러1 - V5
 -  어뎁터 패턴 
    -  마치 v4는 110v v5는 120v 인 것처럼 중간에서 서로 다른 패턴들을 처리할 수 있도록 한것을 어뎁터 패턴이라함
 - 핸들러 어뎁터
 - 핸들러

## 정리 
  v1: 프론트 컨트롤러를 도입
  기존 구조를 최대한 유지하면서 프론트 컨트롤러를 도입

  v2: View 분류
  단순 반복 되는 뷰 로직 분리

  v3: Model 추가
  서블릿 종속성 제거
  뷰 이름 중복 제거

  v4: 단순하고 실용적인 컨트롤러
  v3와 거의 비슷
  구현 입장에서 ModelView를 직접 생성해서 반환하지 않도록 편리한 인터페이스 제공

  v5: 유연한 컨트롤러
  어댑터 도입
  어댑터를 추가해서 프레임워크를 유연하고 확장성 있게 설계

    여기에 애노테이션을 사용해서 컨트롤러를 더 편리하게 발전시길 수도 있다. 만약 애노테이션을 사용해서
    컨트롤러를 편리하게 사용할 수 있게 하려면 어떻게 해야할까? 바로 애노테이션을 지원하는 어댑터를
    추가하면 된다!
    다형성과 어댑터 덕분에 기존 구조를 유지하면서, 프레임워크의 기능을 확장할 수 있다


# 스프릥 MVC

Http 요청 -> Dispatcher Servlet  -> HandlerAdapter -> Handler(Controller)
              view - viewResolver
- HandlerMapping
  - RequestMappingHandlerMapping
- HandlerAdapter
  - RequestMappingHandlerAdapter
  
ViewResolver
  application.properties
  - spring.mvc.view.prefix=/WEB-INF/views/
  - spring.mvc.view.suffix=.jsp


- @RequsetParam
- @ReuqestMapping -> GetMapping,PostMapping

      // public ModelAndView save(HttpServletRequest request, HttpServletResponse response)
      @PostMapping("/save")
      String save(@RequestParam("username")String username,
      @RequestParam("age")int age,
      Model model )