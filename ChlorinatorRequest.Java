public class chlorinatorRequest extends StringRequest {
    private static final String CHLORINATOR_REQUEST_URL = "http://youripaddress/android_connect/Chlorinator.php";
    private Map<String, String> params;

    public chlorinatorRequest(String Maint303, String Maint304, String Maint305,String Maint306, String Maint307, String Maint308, String Maint309, String Maint310, Response.Listener<String> listener){
        super(Method.POST, CHLORINATOR_REQUEST_URL, listener, null);
        params = new HashMap<>();
        params.put("Maint303", Maint303);
        params.put("Maint304", Maint304);
        params.put("Maint305", Maint305);
        params.put("Maint306", Maint306);
        params.put("Maint307", Maint307);
        params.put("Maint308", Maint308);
        params.put("Maint309", Maint309);
        params.put("Maint310", Maint310);

      }

    public Map<String, String> getParams() {
        return params;

    }
}
