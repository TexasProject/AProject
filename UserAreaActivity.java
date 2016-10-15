public class UserAreaActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    public void onClick(View arg0){
        if(arg0.getId() == R.id.FormListBtn) {
            Intent intent = new Intent(this, FormList.class);

            this.startActivity(intent);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_area);

        Intent intent = getIntent();

        String username = intent.getStringExtra("username");
        String LastName = intent.getStringExtra("LastName");
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final EditText etLastName = (EditText) findViewById(R.id.etLastName);
        final TextView welcomeMessage = (TextView) findViewById(R.id.tvWelcomeMsg);


        // Display user details
        String message = LastName + " welcome to your user area";
        welcomeMessage.setText(message);
        etUserName.setText(username);
        etLastName.setText(LastName);

        View v = findViewById(R.id.FormListBtn);
        v.setOnClickListener(this);


    }

}

 

