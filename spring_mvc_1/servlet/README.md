

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


