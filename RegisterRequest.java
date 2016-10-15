public class RegisterRequest extends StringRequest {
        private static final String REGISTER_REQUEST_URL = "http://youripaddress/android_connect/Register.php";
          private Map<String, String> params;

        public RegisterRequest(String FirstName, String LastName, String username, String password , Response.Listener<String> listener){
            super(Method.POST, REGISTER_REQUEST_URL, listener, null);
            params = new HashMap<>();
            params.put("FirstName", FirstName);
            params.put("LastName", LastName);
            params.put("username", username);
            params.put("password", password);

        }

        public Map<String, String> getParams() {
            return params;

        }
}

 

