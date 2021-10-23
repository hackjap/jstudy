package templatemethod;

public abstract class AbstConnectHelper {

    abstract protected String doSecurity(String info);

    abstract protected String authentication(String id, String password);

    abstract protected int authorization(String username);

    abstract protected String connection(String info);

    public String requestConnection(String info) {

        String id, password, userName, decodeInfo, userInfo;

        // 암호화된 정보를 복호화 합니다.
        decodeInfo = doSecurity(info);

        // decodedInfo에서 id와 password를 추출
        id = "abc";
        password = "abc";

        userInfo = authentication(id, password);

        userName = "abc";

        int result = authorization(userName);

        switch (result) {
            case -1:
                throw new Error("셧다운");
            case 0: // 무료회원
                break;
            case 1: // 유료회원
                break;
            case 2: // 게임 마스터
                break;
            case 3: // 접속 권한 없음
                break;
            default:
                break;
        }
        return connection(userInfo);
    }
}



