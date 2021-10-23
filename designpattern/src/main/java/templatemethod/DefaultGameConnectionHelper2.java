package templatemethod;

public class DefaultGameConnectionHelper2 extends  AbstConnectHelper{
    @Override
    protected String doSecurity(String info) {
        System.out.println("강화된 알고리즘을 이용한 디코드222");
        return info;
    }

    @Override
    protected String authentication(String id, String password) {
        if (id.equals("abc") | password.equals("abc"))
            return "true info";
        else
            return "false info";
    }

    @Override
    protected int authorization(String username) {
        System.out.println("권한 확인");
        // 서버에서 유저이름 유저의 나이를 알 수 있다.
        // 나이를 확인하고 시간을 확인하고 성인이 아니고 10시가 지났다면
        // 권한이 없는 것으로 한다.

        return 0;
    }

    @Override
    protected String connection(String info) {
        System.out.println("마지막 접속 단계!");
        return info;
    }
}
