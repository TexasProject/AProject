public class LoginRequest extends StringRequest {

        private static final String LOGIN_REQUEST_URL = "http://youripaddress/android_connect/Login.php";
        private Map<String, String> params;

        public LoginRequest (String username, String password , Response.Listener<String> listener){
            super(Method.POST, LOGIN_REQUEST_URL, listener, null);

            Log.d("myTag", password);
            params = new HashMap<>();
            params.put("username", username);
            params.put("password", password);

        }

        public Map<String, String> getParams() {

            return params;

        }


}

 

