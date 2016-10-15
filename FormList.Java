public class FormList extends Activity implements View.OnClickListener{

    @Override
    public void onClick(View arg0) {
        if (arg0.getId() == R.id.chlorinator_room_btn) {
            Intent intent = new Intent(this, chlorinator_room.class);

            this.startActivity(intent);
        }
    }


        @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.form_list);

        View CR_form = findViewById(R.id.chlorinator_room_btn);
        CR_form.setOnClickListener(this);


    }
