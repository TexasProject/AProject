public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etLastName = (EditText) findViewById(R.id.etLastName);
        final EditText etFirstname = (EditText) findViewById(R.id.etFirstName);
        final EditText etUsername = (EditText) findViewById(R.id.etUsername);
        final EditText etPassword = (EditText) findViewById(R.id.etPassword);
        final Button bRegister = (Button) findViewById(R.id.bRegister);

        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String FirstName = etFirstname.getText().toString();
                final String username = etUsername.getText().toString();
                final String LastName = etLastName.getText().toString();
                final String password = etPassword.getText().toString();

                Log.d("FirstName", FirstName);


                Response.Listener<String> responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String response) {
                        try {
                            //Log.d("JSON Parser", response);
                            JSONObject jsonResponse = new JSONObject(response);
                            boolean success = jsonResponse.getBoolean("success");


                            if (success) {
                                Context context = getApplicationContext();
                                CharSequence text = "Registration Successful";
                                int duration = Toast.LENGTH_SHORT;

                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();

                                Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                                RegisterActivity.this.startActivity(intent);
                            } else {
                                AlertDialog.Builder builder = new AlertDialog.Builder(RegisterActivity.this);
                                builder.setMessage("Registration Failed")
                                        .setNegativeButton("Retry", null)
                                        .create()
                                        .show();
                            }

                        } catch (JSONException e) {

                            e.printStackTrace();
                        }


                    }
                };
                Log.d("password", password);
                    RegisterRequest registerRequest = new RegisterRequest(FirstName, LastName,username, password, responseListener);
                    RequestQueue queue = new Volley().newRequestQueue(RegisterActivity.this);
                    queue.add(registerRequest);
                }
            });
        }
    }

 

