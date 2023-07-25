import java.util.HashMap;

public class IDandPasswords {

    HashMap<String, String> loginInfo;

    IDandPasswords() {

        loginInfo = new HashMap<String,String>();
        loginInfo.put("Hamdam", "palov");
        loginInfo.put("Gulnoza", "lavash");
        loginInfo.put("Shahruza", "unoshi");
        loginInfo.put("Abdulaziz", "chomma");

    }

    protected HashMap<String, String> getLoginInfo() {
        return loginInfo;
    }
}
