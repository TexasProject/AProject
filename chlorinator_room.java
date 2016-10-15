

public class chlorinator_room extends FormList implements View.OnClickListener{

    @Override
    public void onClick(View
arg0){
        if(arg0.getId() ==
R.id.CR2_button) {
            Intent intent = new Intent(this,
chlorinator_room2.class);
            this.startActivity(intent);
        }
    }

    private TextView resultTotal303,
            resultTotal304, resultTotal305, resultTotal306, resultTotal307, resultTotal308, resultTotal309, resultTotal310,
            resultTotal311, resultTotal313, resultTotal314, resultTotal315, resultTotal316, resultTotal317;

    private TextView ResultAverage303,
            ResultAverage304, ResultAverage305, ResultAverage306, ResultAverage307, ResultAverage308, ResultAverage309,
            ResultAverage310, ResultAverage311, ResultAverage313, ResultAverage314, ResultAverage315,
            ResultAverage316, ResultAverage317;


    private EditText feed303AM3,
            feed304AM3, feed305AM3, feed306AM3, feed307AM3, feed308AM3, feed309AM3, feed310AM3, feed311AM3, feed313AM3,
            feed314AM3, feed315AM3, feed316AM3, feed317AM3;



    private EditText feed303AM7,
            feed304AM7, feed305AM7, feed306AM7, feed307AM7, feed308AM7, feed309AM7, feed310AM7, feed311AM7, feed313AM7,
            feed314AM7, feed315AM7, feed316AM7, feed317AM7;


    private EditText feed303AM11,
            feed304AM11, feed305AM11, feed306AM11, feed307AM11, feed308AM11, feed309AM11, feed310AM11, feed311AM11, feed313AM11,
            feed314AM11, feed315AM11, feed316AM11, feed317AM11;

    private EditText feed303PM3,
            feed304PM3, feed305PM3, feed306PM3, feed307PM3, feed308PM3, feed309PM3, feed310PM3, feed311PM3, feed313PM3,
            feed314PM3, feed315PM3, feed316PM3, feed317PM3;

    private EditText feed303PM7,
            feed304PM7, feed305PM7, feed306PM7, feed307PM7, feed308PM7, feed309PM7, feed310PM7, feed311PM7, feed313PM7,
            feed314PM7, feed315PM7, feed316PM7, feed317PM7;

    private EditText feed303PM11,
            feed304PM11, feed305PM11, feed306PM11, feed307PM11, feed308PM11, feed309PM11, feed310PM11, feed311PM11, feed313PM11,
            feed314PM11, feed315PM11, feed316PM11, feed317PM11;



   
@Override
    public void onCreate(Bundle
savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.chlorinator_room_form);

        View CR_form2 =
findViewById(R.id.CR2_button);
        CR_form2.setOnClickListener(this);

        // CALCULATE AVG AND TOTAL

        feed303AM3 = (EditText)
findViewById(R.id.Feed_303_3AM);
        feed304AM3 = (EditText)
findViewById(R.id.Feed_304_3AM);
        feed305AM3 = (EditText)
findViewById(R.id.Feed_305_3AM);
        feed306AM3 = (EditText)
findViewById(R.id.Feed_306_3AM);
        feed307AM3 = (EditText)
findViewById(R.id.Feed_307_3AM);
        feed308AM3 = (EditText)
findViewById(R.id.Feed_308_3AM);
        feed309AM3 = (EditText)
findViewById(R.id.Feed_309_3AM);
        feed310AM3 = (EditText)
findViewById(R.id.Feed_310_3AM);
        feed311AM3 = (EditText)
findViewById(R.id.Feed_311_3AM);
        feed313AM3 = (EditText)
findViewById(R.id.Feed_313_3AM);
        feed314AM3 = (EditText)
findViewById(R.id.Feed_314_3AM);
        feed315AM3 = (EditText)
findViewById(R.id.Feed_315_3AM);
        feed316AM3 = (EditText)
findViewById(R.id.Feed_316_3AM);
        feed317AM3 = (EditText)
findViewById(R.id.Feed_317_3AM);


        feed303AM7 = (EditText)
findViewById(R.id.Feed_303_7AM);
        feed304AM7 = (EditText)
findViewById(R.id.Feed_304_7AM);
        feed305AM7 = (EditText)
findViewById(R.id.Feed_305_7AM);
        feed306AM7 = (EditText)
findViewById(R.id.Feed_306_7AM);
        feed307AM7 = (EditText)
findViewById(R.id.Feed_307_7AM);
        feed308AM7 = (EditText)
findViewById(R.id.Feed_308_7AM);
        feed309AM7 = (EditText)
findViewById(R.id.Feed_309_7AM);
        feed310AM7 = (EditText)
findViewById(R.id.Feed_310_7AM);
        feed311AM7 = (EditText)
findViewById(R.id.Feed_311_7AM);
        feed313AM7 = (EditText)
findViewById(R.id.Feed_313_7AM);
        feed314AM7 = (EditText)
findViewById(R.id.Feed_314_7AM);
        feed315AM7 = (EditText)
findViewById(R.id.Feed_315_7AM);
        feed316AM7 = (EditText)
findViewById(R.id.Feed_316_7AM);
        feed317AM7 = (EditText)
findViewById(R.id.Feed_317_7AM);

        feed303AM11 = (EditText)
findViewById(R.id.Feed_303_11AM);
        feed304AM11 = (EditText)
findViewById(R.id.Feed_304_11AM);
        feed305AM11 = (EditText) findViewById(R.id.Feed_305_11AM);
        feed306AM11 = (EditText)
findViewById(R.id.Feed_306_11AM);
        feed307AM11 = (EditText)
findViewById(R.id.Feed_307_11AM);
        feed308AM11 = (EditText)
findViewById(R.id.Feed_308_11AM);
        feed309AM11 = (EditText)
findViewById(R.id.Feed_309_11AM);
        feed310AM11 = (EditText)
findViewById(R.id.Feed_310_11AM);
        feed311AM11 = (EditText)
findViewById(R.id.Feed_311_11AM);
        feed313AM11 = (EditText)
findViewById(R.id.Feed_313_11AM);
        feed314AM11 = (EditText)
findViewById(R.id.Feed_314_11AM);
        feed315AM11 = (EditText)
findViewById(R.id.Feed_315_11AM);
        feed316AM11 = (EditText)
findViewById(R.id.Feed_316_11AM);
        feed317AM11 = (EditText)
findViewById(R.id.Feed_317_11AM);

        feed303PM3 = (EditText)
findViewById(R.id.Feed_303_3PM);
        feed304PM3 = (EditText)
findViewById(R.id.Feed_304_3PM);
        feed305PM3 = (EditText)
findViewById(R.id.Feed_305_3PM);
        feed306PM3 = (EditText)
findViewById(R.id.Feed_306_3PM);
        feed307PM3 = (EditText)
findViewById(R.id.Feed_307_3PM);
        feed308PM3 = (EditText)
findViewById(R.id.Feed_308_3PM);
        feed309PM3 = (EditText)
findViewById(R.id.Feed_309_3PM);
        feed310PM3 = (EditText)
findViewById(R.id.Feed_310_3PM);
        feed311PM3 = (EditText)
findViewById(R.id.Feed_311_3PM);
        feed313PM3 = (EditText)
findViewById(R.id.Feed_313_3PM);
        feed314PM3 = (EditText)
findViewById(R.id.Feed_314_3PM);
        feed315PM3 = (EditText)
findViewById(R.id.Feed_315_3PM);
        feed316PM3 = (EditText)
findViewById(R.id.Feed_316_3PM);
        feed317PM3 = (EditText)
findViewById(R.id.Feed_317_3PM);

        feed303PM7 = (EditText)
findViewById(R.id.Feed_303_7PM);
        feed304PM7 = (EditText)
findViewById(R.id.Feed_304_7PM);
        feed305PM7 = (EditText)
findViewById(R.id.Feed_305_7PM);
        feed306PM7 = (EditText)
findViewById(R.id.Feed_306_7PM);
        feed307PM7= (EditText)
findViewById(R.id.Feed_307_7PM);
        feed308PM7 = (EditText) findViewById(R.id.Feed_308_7PM);
        feed309PM7 = (EditText)
findViewById(R.id.Feed_309_7PM);
        feed310PM7 = (EditText)
findViewById(R.id.Feed_310_7PM);
        feed311PM7 = (EditText)
findViewById(R.id.Feed_311_7PM);
        feed313PM7 = (EditText)
findViewById(R.id.Feed_313_7PM);
        feed314PM7 = (EditText)
findViewById(R.id.Feed_314_7PM);
        feed315PM7 = (EditText)
findViewById(R.id.Feed_315_7PM);
        feed316PM7 = (EditText)
findViewById(R.id.Feed_316_7PM);
        feed317PM7 = (EditText)
findViewById(R.id.Feed_317_7PM);

        feed303PM11 = (EditText)
findViewById(R.id.Feed_303_11PM);
        feed304PM11 = (EditText)
findViewById(R.id.Feed_304_11PM);
        feed305PM11 = (EditText)
findViewById(R.id.Feed_305_11PM);
        feed306PM11 = (EditText)
findViewById(R.id.Feed_306_11PM);
        feed307PM11 = (EditText)
findViewById(R.id.Feed_307_11PM);
        feed308PM11 = (EditText)
findViewById(R.id.Feed_308_11PM);
        feed309PM11 = (EditText)
findViewById(R.id.Feed_309_11PM);
        feed310PM11 = (EditText)
findViewById(R.id.Feed_310_11PM);
        feed311PM11 = (EditText)
findViewById(R.id.Feed_311_11PM);
        feed313PM11 = (EditText)
findViewById(R.id.Feed_313_11PM);
        feed314PM11 = (EditText)
findViewById(R.id.Feed_314_11PM);
        feed315PM11 = (EditText)
findViewById(R.id.Feed_315_11PM);
        feed316PM11 = (EditText)
findViewById(R.id.Feed_316_11PM);
        feed317PM11 = (EditText)
findViewById(R.id.Feed_317_11PM);

        resultTotal303 = (TextView) findViewById(R.id.CR_303_totalResults);
        resultTotal304 = (TextView)
findViewById(R.id.CR_304_totalResults);
        resultTotal305 = (TextView)
findViewById(R.id.CR_305_totalResults);
        resultTotal306 = (TextView)
findViewById(R.id.CR_306_totalResults);
        resultTotal307 = (TextView)
findViewById(R.id.CR_307_totalResults);
        resultTotal308 = (TextView)
findViewById(R.id.CR_308_totalResults);
        resultTotal309 = (TextView)
findViewById(R.id.CR_309_totalResults);
        resultTotal310 = (TextView)
findViewById(R.id.CR_310_totalResults);
        resultTotal311 = (TextView)
findViewById(R.id.CR_311_totalResults);
        resultTotal313 = (TextView)
findViewById(R.id.CR_313_totalResults);
        resultTotal314 = (TextView)
findViewById(R.id.CR_314_totalResults);
        resultTotal315 = (TextView)
findViewById(R.id.CR_315_totalResults);
        resultTotal316 = (TextView)
findViewById(R.id.CR_316_totalResults);
        resultTotal317 = (TextView)
findViewById(R.id.CR_317_totalResults);

        ResultAverage303 = (TextView)
findViewById(R.id.CR_303_AverageResults);
        ResultAverage304= (TextView)
findViewById(R.id.CR_304_AverageResults);
        ResultAverage305= (TextView)
findViewById(R.id.CR_305_AverageResults);
        ResultAverage306= (TextView)
findViewById(R.id.CR_306_AverageResults);
        ResultAverage307= (TextView)
findViewById(R.id.CR_307_AverageResults);
        ResultAverage308= (TextView)
findViewById(R.id.CR_308_AverageResults);
        ResultAverage309= (TextView)
findViewById(R.id.CR_309_AverageResults);
        ResultAverage310= (TextView)
findViewById(R.id.CR_310_AverageResults);
        ResultAverage311= (TextView)
findViewById(R.id.CR_311_AverageResults);
        ResultAverage313= (TextView) findViewById(R.id.CR_313_AverageResults);
        ResultAverage314= (TextView)
findViewById(R.id.CR_314_AverageResults);
        ResultAverage315= (TextView)
findViewById(R.id.CR_315_AverageResults);
        ResultAverage316= (TextView)
findViewById(R.id.CR_316_AverageResults);
        ResultAverage317= (TextView)
findViewById(R.id.CR_317_AverageResults);



        TextWatcher textWatcher = new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence
s, int
start,
int
count,
int
after)
{
            }

            @Override
            public void onTextChanged(CharSequence
s, int
start,
int
before,
int
count)
{
            }

            @Override
            public void afterTextChanged(Editable
s) {
                calculateResult();

            }
        };

        feed303AM3.addTextChangedListener(textWatcher);
        feed304AM3.addTextChangedListener(textWatcher);
        feed305AM3.addTextChangedListener(textWatcher);
        feed306AM3.addTextChangedListener(textWatcher);
        feed307AM3.addTextChangedListener(textWatcher);
        feed308AM3.addTextChangedListener(textWatcher);
        feed309AM3.addTextChangedListener(textWatcher);
        feed310AM3.addTextChangedListener(textWatcher);
        feed311AM3.addTextChangedListener(textWatcher);
        feed313AM3.addTextChangedListener(textWatcher);
        feed314AM3.addTextChangedListener(textWatcher);
        feed315AM3.addTextChangedListener(textWatcher);
        feed316AM3.addTextChangedListener(textWatcher);
        feed317AM3.addTextChangedListener(textWatcher);

        feed303AM7.addTextChangedListener(textWatcher);
        feed304AM7.addTextChangedListener(textWatcher);
        feed305AM7.addTextChangedListener(textWatcher);
        feed306AM7.addTextChangedListener(textWatcher);
        feed307AM7.addTextChangedListener(textWatcher);
        feed308AM7.addTextChangedListener(textWatcher);
        feed309AM7.addTextChangedListener(textWatcher);
        feed310AM7.addTextChangedListener(textWatcher);
        feed311AM7.addTextChangedListener(textWatcher);
        feed313AM7.addTextChangedListener(textWatcher);
        feed314AM7.addTextChangedListener(textWatcher);
        feed315AM7.addTextChangedListener(textWatcher);
        feed316AM7.addTextChangedListener(textWatcher);
        feed317AM7.addTextChangedListener(textWatcher);

        feed303AM11.addTextChangedListener(textWatcher);
        feed304AM11.addTextChangedListener(textWatcher);
        feed305AM11.addTextChangedListener(textWatcher);
        feed306AM11.addTextChangedListener(textWatcher);
        feed307AM11.addTextChangedListener(textWatcher);
        feed308AM11.addTextChangedListener(textWatcher);
        feed309AM11.addTextChangedListener(textWatcher);
        feed310AM11.addTextChangedListener(textWatcher);
        feed311AM11.addTextChangedListener(textWatcher);
        feed313AM11.addTextChangedListener(textWatcher);
        feed314AM11.addTextChangedListener(textWatcher);
        feed315AM11.addTextChangedListener(textWatcher);
        feed316AM11.addTextChangedListener(textWatcher);
        feed317AM11.addTextChangedListener(textWatcher);

        feed303PM3.addTextChangedListener(textWatcher);
        feed304PM3.addTextChangedListener(textWatcher);
        feed305PM3.addTextChangedListener(textWatcher);
        feed306PM3.addTextChangedListener(textWatcher);
        feed307PM3.addTextChangedListener(textWatcher);
        feed308PM3.addTextChangedListener(textWatcher);
        feed309PM3.addTextChangedListener(textWatcher);
        feed310PM3.addTextChangedListener(textWatcher);
        feed311PM3.addTextChangedListener(textWatcher);
        feed313PM3.addTextChangedListener(textWatcher);
        feed314PM3.addTextChangedListener(textWatcher);
        feed315PM3.addTextChangedListener(textWatcher);
        feed316PM3.addTextChangedListener(textWatcher);
        feed317PM3.addTextChangedListener(textWatcher);

        feed303PM7.addTextChangedListener(textWatcher);
        feed304PM7.addTextChangedListener(textWatcher);
        feed305PM7.addTextChangedListener(textWatcher);
        feed306PM7.addTextChangedListener(textWatcher);
        feed307PM7.addTextChangedListener(textWatcher);
        feed308PM7.addTextChangedListener(textWatcher);
        feed309PM7.addTextChangedListener(textWatcher);
        feed310PM7.addTextChangedListener(textWatcher);
        feed311PM7.addTextChangedListener(textWatcher);
        feed313PM7.addTextChangedListener(textWatcher);
        feed314PM7.addTextChangedListener(textWatcher);
        feed315PM7.addTextChangedListener(textWatcher);
        feed316PM7.addTextChangedListener(textWatcher);
        feed317PM7.addTextChangedListener(textWatcher);

        feed303PM11.addTextChangedListener(textWatcher);
        feed304PM11.addTextChangedListener(textWatcher);
        feed305PM11.addTextChangedListener(textWatcher);
        feed306PM11.addTextChangedListener(textWatcher);
        feed307PM11.addTextChangedListener(textWatcher);
        feed308PM11.addTextChangedListener(textWatcher);
        feed309PM11.addTextChangedListener(textWatcher);
        feed310PM11.addTextChangedListener(textWatcher);
        feed311PM11.addTextChangedListener(textWatcher);
        feed313PM11.addTextChangedListener(textWatcher);
        feed314PM11.addTextChangedListener(textWatcher);
        feed315PM11.addTextChangedListener(textWatcher);
        feed316PM11.addTextChangedListener(textWatcher);
        feed317PM11.addTextChangedListener(textWatcher);

    }

    private void calculateResult()
throws
NumberFormatException
{

        Editable AM3_303_EV = feed303AM3.getText(),
                AM3_304_EV = feed304AM3.getText(),
AM3_305_EV = feed305AM3.getText(), AM3_306_EV = feed306AM3.getText(),
                AM3_307_EV = feed307AM3.getText(),
AM3_308_EV = feed308AM3.getText(), AM3_309_EV = feed309AM3.getText(),
                AM3_310_EV = feed310AM3.getText(),
AM3_311_EV = feed311AM3.getText(), AM3_313_EV = feed313AM3.getText(),
                AM3_314_EV = feed314AM3.getText(),
AM3_315_EV = feed315AM3.getText(), AM3_316_EV = feed316AM3.getText(),
                AM3_317_EV = feed317AM3.getText();

        Editable AM7_303_EV = feed303AM7.getText(),
                AM7_304_EV = feed304AM7.getText(),
AM7_305_EV = feed305AM7.getText(), AM7_306_EV = feed306AM7.getText(),
                AM7_307_EV = feed307AM7.getText(),
AM7_308_EV = feed308AM7.getText(), AM7_309_EV = feed309AM7.getText(),
                AM7_310_EV = feed310AM7.getText(),
AM7_311_EV = feed311AM7.getText(), AM7_313_EV = feed313AM7.getText(),
                AM7_314_EV = feed314AM7.getText(),
AM7_315_EV = feed315AM7.getText(), AM7_316_EV = feed316AM7.getText(),
                AM7_317_EV = feed317AM7.getText();

        Editable AM11_303_EV = feed303AM11.getText(),
                AM11_304_EV = feed304AM11.getText(),
AM11_305_EV = feed305AM11.getText(), AM11_306_EV = feed306AM11.getText(),
                AM11_307_EV = feed307AM11.getText(),
AM11_308_EV = feed308AM11.getText(), AM11_309_EV = feed309AM11.getText(),
                AM11_310_EV = feed310AM11.getText(),
AM11_311_EV = feed311AM11.getText(), AM11_313_EV = feed313AM11.getText(),
                AM11_314_EV = feed314AM11.getText(),
AM11_315_EV = feed315AM11.getText(), AM11_316_EV = feed316AM11.getText(),
                AM11_317_EV = feed317AM11.getText();

        Editable PM3_303_EV = feed303PM3.getText(),
                PM3_304_EV = feed304PM3.getText(),
PM3_305_EV = feed305PM3.getText(), PM3_306_EV = feed306PM3.getText(),
                PM3_307_EV = feed307PM3.getText(),
PM3_308_EV = feed308PM3.getText(), PM3_309_EV = feed309PM3.getText(),
                PM3_310_EV = feed310PM3.getText(),
PM3_311_EV = feed311PM3.getText(), PM3_313_EV = feed313PM3.getText(),
                PM3_314_EV = feed314PM3.getText(),
PM3_315_EV = feed315PM3.getText(), PM3_316_EV = feed316PM3.getText(),
                PM3_317_EV = feed317PM3.getText();

        Editable PM7_303_EV = feed303PM7.getText(),
                PM7_304_EV = feed304PM7.getText(),
PM7_305_EV = feed305PM7.getText(), PM7_306_EV = feed306PM7.getText(),
                PM7_307_EV = feed307PM7.getText(),
PM7_308_EV = feed308PM7.getText(), PM7_309_EV = feed309PM7.getText(),
                PM7_310_EV = feed310PM7.getText(),
PM7_311_EV = feed311PM7.getText(), PM7_313_EV = feed313PM7.getText(),
                PM7_314_EV = feed314PM7.getText(),
PM7_315_EV = feed315PM7.getText(), PM7_316_EV = feed316PM7.getText(),
                PM7_317_EV = feed317PM7.getText();

        Editable PM11_303_EV = feed303PM11.getText(),
                PM11_304_EV = feed304PM11.getText(),
PM11_305_EV = feed305PM11.getText(), PM11_306_EV = feed306PM11.getText(),
                PM11_307_EV = feed307PM11.getText(),
PM11_308_EV = feed308PM11.getText(), PM11_309_EV = feed309PM11.getText(),
                PM11_310_EV = feed310PM11.getText(),
PM11_311_EV = feed311PM11.getText(), PM11_313_EV = feed313PM11.getText(),
                PM11_314_EV = feed314PM11.getText(),
PM11_315_EV = feed315PM11.getText(), PM11_316_EV = feed316PM11.getText(),
                PM11_317_EV = feed317PM11.getText();



        double AM3_303 = 0.0,
                AM3_304 = 0.0, AM3_305 = 0.0, AM3_306 = 0.0, AM3_307 = 0.0, AM3_308 = 0.0, AM3_309 = 0.0, AM3_310 = 0.0, AM3_311 = 0.0,
                AM3_313 = 0.0, AM3_314 = 0.0, AM3_315 = 0.0, AM3_316 = 0.0, AM3_317 = 0.0, totalResult303
= 0.0,
averageResult303 = 0.0;

        int count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0,count9 = 0, count10 = 0, count11 = 0,
                count13 = 0, count14 = 0, count15 = 0, count16 = 0, count17 = 0;

        if(AM3_303_EV != null &&
AM3_303_EV.length() >= 1) {
            AM3_303 = Double.parseDouble(AM3_303_EV.toString());
            count3++;
        }

        if(AM3_304_EV != null &&
AM3_304_EV.length() >= 1) {
            AM3_304 = Double.parseDouble(AM3_304_EV.toString());
            count4++;
        }

        if(AM3_305_EV != null &&
AM3_305_EV.length() >= 1) {
            AM3_305 = Double.parseDouble(AM3_305_EV.toString());
            count5++;
        }

        if(AM3_306_EV != null &&
AM3_306_EV.length() >= 1) {
            AM3_306 = Double.parseDouble(AM3_306_EV.toString());
            count6++;
        }

        if(AM3_307_EV != null &&
AM3_307_EV.length() >= 1) {
            AM3_307 = Double.parseDouble(AM3_307_EV.toString());
            count7++;
        }

        if(AM3_308_EV != null &&
AM3_308_EV.length() >= 1) {
            AM3_308 = Double.parseDouble(AM3_308_EV.toString());
            count8++;
        }

        if(AM3_309_EV != null && AM3_309_EV.length()
>= 1) {
            AM3_309 = Double.parseDouble(AM3_309_EV.toString());
            count9++;
        }

        if(AM3_310_EV != null &&
AM3_310_EV.length() >= 1) {
            AM3_310 = Double.parseDouble(AM3_310_EV.toString());
            count10++;
        }

        if(AM3_311_EV != null &&
AM3_311_EV.length() >= 1) {
            AM3_311 = Double.parseDouble(AM3_311_EV.toString());
            count11++;
        }

        if(AM3_313_EV != null &&
AM3_313_EV.length() >= 1) {
            AM3_313 = Double.parseDouble(AM3_313_EV.toString());
            count13++;
        }

        if(AM3_314_EV != null &&
AM3_314_EV.length() >= 1) {
            AM3_314 = Double.parseDouble(AM3_314_EV.toString());
            count14++;
        }

        if(AM3_315_EV != null &&
AM3_315_EV.length() >= 1) {
            AM3_315 = Double.parseDouble(AM3_315_EV.toString());
            count15++;
        }

        if(AM3_316_EV != null &&
AM3_316_EV.length() >= 1) {
            AM3_316 = Double.parseDouble(AM3_316_EV.toString());
            count16++;
        }

        if(AM3_317_EV != null &&
AM3_317_EV.length() >= 1) {
            AM3_317 = Double.parseDouble(AM3_317_EV.toString());
            count17++;
        }



        double AM7_303 = 0.0,
                AM7_304 = 0.0, AM7_305 = 0.0, AM7_306 = 0.0, AM7_307 = 0.0, AM7_308 = 0.0, AM7_309 = 0.0, AM7_310 = 0.0, AM7_311 = 0.0,
                AM7_313 = 0.0, AM7_314 = 0.0, AM7_315 = 0.0, AM7_316 = 0.0, AM7_317 = 0.0, totalResult304
= 0.0,averageResult304
= 0.0
;

        if(AM7_303_EV != null &&
AM7_303_EV.length() >= 1) {
            AM7_303 = Double.parseDouble(AM7_303_EV.toString());
            count3++;
        }

        if(AM7_304_EV != null &&
AM7_304_EV.length() >= 1) {
            AM7_304 = Double.parseDouble(AM7_304_EV.toString());
            count4++;
        }

        if(AM7_305_EV != null &&
AM7_305_EV.length() >= 1) {
            AM7_305 = Double.parseDouble(AM7_305_EV.toString());
            count5++;
        }

        if(AM7_306_EV != null &&
AM7_306_EV.length() >= 1) {
            AM7_306 = Double.parseDouble(AM7_306_EV.toString());
            count6++;
        }

        if(AM7_307_EV != null &&
AM7_307_EV.length() >= 1) {
            AM7_307 = Double.parseDouble(AM7_307_EV.toString());
            count7++;
        }

        if(AM7_308_EV != null &&
AM7_308_EV.length() >= 1) {
            AM7_308 = Double.parseDouble(AM7_308_EV.toString());
            count8++;
        }

        if(AM7_309_EV != null &&
AM7_309_EV.length() >= 1) {
            AM7_309 = Double.parseDouble(AM7_309_EV.toString());
            count9++;
        }

        if(AM7_310_EV != null &&
AM7_310_EV.length() >= 1) {
            AM7_310 = Double.parseDouble(AM7_310_EV.toString());
            count10++;
        }

        if(AM7_311_EV != null &&
AM7_311_EV.length() >= 1) {
            AM7_311 = Double.parseDouble(AM7_311_EV.toString());
            count11++;
        }

        if(AM7_313_EV != null &&
AM7_313_EV.length() >= 1) {
            AM7_313 = Double.parseDouble(AM7_313_EV.toString());
            count13++;
        }

        if(AM7_314_EV != null &&
AM7_314_EV.length() >= 1) {
            AM7_314 = Double.parseDouble(AM7_314_EV.toString());
            count14++;
        }

        if(AM7_315_EV != null &&
AM7_315_EV.length() >= 1){
            AM7_315 = Double.parseDouble(AM7_315_EV.toString());
            count15++;
        }

        if(AM7_316_EV != null &&
AM7_316_EV.length() >= 1) {
            AM7_316 = Double.parseDouble(AM7_316_EV.toString());
            count16++;
        }

        if(AM7_317_EV != null &&
AM7_317_EV.length() >= 1) {
            AM7_317 = Double.parseDouble(AM7_317_EV.toString());
            count17++;
        }

        double AM11_303 = 0.0,
                AM11_304 = 0.0, AM11_305 = 0.0, AM11_306 = 0.0, AM11_307 = 0.0, AM11_308 = 0.0, AM11_309 = 0.0, AM11_310 = 0.0, AM11_311 = 0.0,
                AM11_313 = 0.0, AM11_314 = 0.0, AM11_315 = 0.0, AM11_316 = 0.0, AM11_317 = 0.0, totalResult305
= 0.0,averageResult305
;

        if(AM11_303_EV != null &&
AM11_303_EV.length() >= 1) {
            AM11_303 = Double.parseDouble(AM11_303_EV.toString());
            count3++;
        }

        if(AM11_304_EV != null &&
AM11_304_EV.length() >= 1) {
            AM11_304 = Double.parseDouble(AM11_304_EV.toString());
            count4++;
        }

        if(AM11_305_EV != null &&
AM11_305_EV.length() >= 1) {
            AM11_305 = Double.parseDouble(AM11_305_EV.toString());
            count5++;
        }

        if(AM11_306_EV != null &&
AM11_306_EV.length() >= 1) {
            AM11_306 = Double.parseDouble(AM11_306_EV.toString());
            count6++;
        }

        if(AM11_307_EV != null &&
AM11_307_EV.length() >= 1) {
            AM11_307 = Double.parseDouble(AM11_307_EV.toString());
            count7++;
        }

        if(AM11_308_EV != null &&
AM11_308_EV.length() >= 1) {
            AM11_308 = Double.parseDouble(AM11_308_EV.toString());
            count8++;
        }

        if(AM11_309_EV != null &&
AM11_309_EV.length() >= 1) {
            AM11_309 = Double.parseDouble(AM11_309_EV.toString());
            count9++;
        }

        if(AM11_310_EV != null &&
AM11_310_EV.length() >= 1) {
            AM11_310 = Double.parseDouble(AM11_310_EV.toString());
            count10++;
        }

        if(AM11_311_EV != null &&
AM11_311_EV.length() >= 1) {
            AM11_311 = Double.parseDouble(AM11_311_EV.toString());
            count11++;
        }

        if(AM11_313_EV != null &&
AM11_313_EV.length() >= 1) {
            AM11_313 = Double.parseDouble(AM11_313_EV.toString());
            count13++;
        }

        if(AM11_314_EV != null &&
AM11_314_EV.length() >= 1) {
            AM11_314 = Double.parseDouble(AM11_314_EV.toString());
            count14++;
        }

        if(AM11_315_EV != null &&
AM11_315_EV.length() >= 1) {
            AM11_315 = Double.parseDouble(AM11_315_EV.toString());
            count15++;
        }

        if(AM11_316_EV != null &&
AM11_316_EV.length() >= 1) {
            AM11_316 = Double.parseDouble(AM11_316_EV.toString());
            count16++;
        }

        if(AM11_317_EV != null &&
AM11_317_EV.length() >= 1) {
            AM11_317 = Double.parseDouble(AM11_317_EV.toString());
            count17++;
        }


        double PM3_303 = 0.0,
                PM3_304 = 0.0, PM3_305 = 0.0, PM3_306 = 0.0, PM3_307 = 0.0, PM3_308 = 0.0, PM3_309 = 0.0, PM3_310 = 0.0, PM3_311 = 0.0,
                PM3_313 = 0.0, PM3_314 = 0.0, PM3_315 = 0.0, PM3_316 = 0.0, PM3_317 = 0.0, totalResult306
= 0.0,
averageResult306;

        if(PM3_303_EV != null &&PM3_303_EV.length()
>= 1) {
            PM3_303 = Double.parseDouble(PM3_303_EV.toString());
            count3++;
        }

        if(PM3_304_EV != null &&
PM3_304_EV.length() >= 1) {
            PM3_304 = Double.parseDouble(PM3_304_EV.toString());
            count4++;
        }

        if(PM3_305_EV != null &&
PM3_305_EV.length() >= 1) {
            PM3_305 = Double.parseDouble(PM3_305_EV.toString());
            count5++;
        }

        if(PM3_306_EV != null &&
PM3_306_EV.length() >= 1) {
            PM3_306 = Double.parseDouble(PM3_306_EV.toString());
            count6++;
        }

        if(PM3_307_EV != null &&
PM3_307_EV.length() >= 1) {
            PM3_307 = Double.parseDouble(PM3_307_EV.toString());
            count7++;
        }

        if(PM3_308_EV != null &&
PM3_308_EV.length() >= 1) {
            PM3_308 = Double.parseDouble(PM3_308_EV.toString());
            count8++;
        }

        if(PM3_309_EV != null &&
PM3_309_EV.length() >= 1) {
            PM3_309 = Double.parseDouble(PM3_309_EV.toString());
            count9++;
        }

        if(PM3_310_EV != null &&
PM3_310_EV.length() >= 1) {
            PM3_310 = Double.parseDouble(PM3_310_EV.toString());
            count10++;
        }

        if(PM3_311_EV != null &&
PM3_311_EV.length() >= 1) {
            PM3_311 = Double.parseDouble(PM3_311_EV.toString());
            count11++;
        }

        if(PM3_313_EV != null && PM3_313_EV.length()
>= 1) {
            PM3_313 = Double.parseDouble(PM3_313_EV.toString());
            count13++;
        }

        if(PM3_314_EV != null &&
PM3_314_EV.length() >= 1) {
            PM3_314 = Double.parseDouble(PM3_314_EV.toString());
            count14++;
        }

        if(PM3_315_EV != null &&
PM3_315_EV.length() >= 1) {
            PM3_315 = Double.parseDouble(PM3_315_EV.toString());
            count15++;
        }

        if(PM3_316_EV != null &&
PM3_316_EV.length() >= 1) {
            PM3_316 = Double.parseDouble(PM3_316_EV.toString());
            count16++;
        }

        if(PM3_317_EV != null &&
PM3_317_EV.length() >= 1) {
            PM3_317 = Double.parseDouble(PM3_317_EV.toString());
            count17++;
        }



        double PM7_303 = 0.0,
                PM7_304 = 0.0, PM7_305 = 0.0, PM7_306 = 0.0, PM7_307 = 0.0, PM7_308 = 0.0, PM7_309 = 0.0, PM7_310 = 0.0, PM7_311 = 0.0,
                PM7_313 = 0.0, PM7_314 = 0.0, PM7_315 = 0.0, PM7_316 = 0.0, PM7_317 = 0.0, totalResult307
= 0.0,averageResult307
;

        if(PM7_303_EV != null &&
PM7_303_EV.length() >= 1) {
            PM7_303 = Double.parseDouble(PM7_303_EV.toString());
            count3++;
        }

        if(PM7_304_EV != null &&
PM7_304_EV.length() >= 1) {
            PM7_304 = Double.parseDouble(PM7_304_EV.toString());
            count4++;
        }

        if(PM7_305_EV != null &&
PM7_305_EV.length() >= 1) {
            PM7_305 = Double.parseDouble(PM7_305_EV.toString());
            count5++;
        }

        if(PM7_306_EV != null &&
PM7_306_EV.length() >= 1) {
            PM7_306 = Double.parseDouble(PM7_306_EV.toString());
            count6++;
        }

        if(PM7_307_EV != null &&
PM7_307_EV.length() >= 1) {
            PM7_307 = Double.parseDouble(PM7_307_EV.toString());
            count7++;
        }

        if(PM7_308_EV != null &&
PM7_308_EV.length() >= 1) {
            PM7_308 = Double.parseDouble(PM7_308_EV.toString());
            count8++;
        }

        if(PM7_309_EV != null &&
PM7_309_EV.length() >= 1) {
            PM7_309 = Double.parseDouble(PM7_309_EV.toString());
            count9++;
        }

        if(PM7_310_EV != null &&
PM7_310_EV.length() >= 1) {
            PM7_310 = Double.parseDouble(PM7_310_EV.toString());
            count10++;
        }

        if(PM7_311_EV != null &&
PM7_311_EV.length() >= 1) {
            PM7_311 = Double.parseDouble(PM7_311_EV.toString());
            count11++;
        }

        if(PM7_313_EV != null &&
PM7_313_EV.length() >= 1) {
            PM7_313 = Double.parseDouble(PM7_313_EV.toString());
            count13++;
        }

        if(PM7_314_EV != null &&
PM7_314_EV.length() >= 1) {
            PM7_314 = Double.parseDouble(PM7_314_EV.toString());
            count14++;
        }

        if(PM7_315_EV != null &&
PM7_315_EV.length() >= 1) {
            count15++;
            PM7_315 = Double.parseDouble(PM7_315_EV.toString());
        }

        if(PM7_316_EV != null &&
PM7_316_EV.length() >= 1) {
            PM7_316 = Double.parseDouble(PM7_316_EV.toString());
            count16++;
        }

        if(PM7_317_EV != null &&
PM7_317_EV.length() >= 1) {
            PM7_317 = Double.parseDouble(PM7_317_EV.toString());
            count17++;
        }

        double PM11_303 = 0.0,
                PM11_304 = 0.0, PM11_305 = 0.0, PM11_306 = 0.0, PM11_307 = 0.0, PM11_308 = 0.0, PM11_309 = 0.0, PM11_310 = 0.0, PM11_311 = 0.0,
                PM11_313 = 0.0, PM11_314 = 0.0, PM11_315 = 0.0, PM11_316 = 0.0, PM11_317 = 0.0, totalResult308 =
0.0,averageResult308,
                totalResult309,
totalResult310, totalResult311, totalResult313, totalResult314, totalResult315,
totalResult316, totalResult317,
                averageResult309,
averageResult310, averageResult311, averageResult313, averageResult314,
averageResult315, averageResult316,
                averageResult317;

        if(PM11_303_EV != null &&
PM11_303_EV.length() >= 1) {
            PM11_303 = Double.parseDouble(PM11_303_EV.toString());
            count3++;
        }

        if(PM11_304_EV != null &&
PM11_304_EV.length() >= 1) {
            PM11_304 = Double.parseDouble(PM11_304_EV.toString());
            count4++;
        }

        if(PM11_305_EV != null &&
PM11_305_EV.length() >= 1) {
            PM11_305 = Double.parseDouble(PM11_305_EV.toString());
            count5++;
        }

        if(PM11_306_EV != null &&
PM11_306_EV.length() >= 1) {
            PM11_306 = Double.parseDouble(PM11_306_EV.toString());
            count6++;
        }

        if(PM11_307_EV != null &&
PM11_307_EV.length() >= 1) {
            PM11_307 = Double.parseDouble(PM11_307_EV.toString());
            count7++;
        }

        if(PM11_308_EV != null &&
PM11_308_EV.length() >= 1) {
            PM11_308 = Double.parseDouble(PM11_308_EV.toString());
            count8++;
        }

        if(PM11_309_EV != null &&
PM11_309_EV.length() >= 1) {
            PM11_309 = Double.parseDouble(PM11_309_EV.toString());
            count9++;
        }

        if(PM11_310_EV != null &&
PM11_310_EV.length() >= 1) {
            PM11_310 = Double.parseDouble(PM11_310_EV.toString());
            count10++;
        }

        if(PM11_311_EV != null &&
PM11_311_EV.length() >= 1) {
            PM11_311 = Double.parseDouble(PM11_311_EV.toString());
            count11++;
        }

        if(PM11_313_EV != null &&
PM11_313_EV.length() >= 1) {
            PM11_313 = Double.parseDouble(PM11_313_EV.toString());
            count13++;
        }

        if(PM11_314_EV != null &&
PM11_314_EV.length() >= 1) {
            PM11_314 = Double.parseDouble(PM11_314_EV.toString());
            count14++;
        }

        if(PM11_315_EV != null &&
PM11_315_EV.length() >= 1) {
            PM11_315 = Double.parseDouble(PM11_315_EV.toString());
            count15++;
        }

        if(PM11_316_EV != null &&
PM11_316_EV.length() >= 1) {
            PM11_316 = Double.parseDouble(PM11_316_EV.toString());
            count16++;
        }

        if(PM11_317_EV != null &&
PM11_317_EV.length() >= 1) {
            PM11_317 = Double.parseDouble(PM11_317_EV.toString());
            count17++;
        }


        totalResult303 = AM3_303 +
AM7_303 + AM11_303 + PM3_303 + PM7_303 + PM11_303;
        resultTotal303.setText(Double.toString(totalResult303));

        averageResult303 = (AM3_303 +
AM7_303 + AM11_303 + PM3_303 + PM7_303 + PM11_303) / count3;
        ResultAverage303.setText(Double.toString(averageResult303));
        {
            ResultAverage303.setText(String.format("%1.2f",
averageResult303));
        }

        totalResult304 = AM3_304 +
AM7_304 + AM11_304 + PM3_304 + PM7_304 + PM11_304;
        resultTotal304.setText(Double.toString(totalResult304));

        averageResult304 = (AM3_304 +
AM7_304 + AM11_304 + PM3_304 + PM7_304 + PM11_304) / count4;
        ResultAverage304.setText(Double.toString(averageResult304));
        {
            ResultAverage304.setText(String.format("%1.2f",
averageResult304));
        }

        totalResult305 = AM3_305+ AM7_305
+ AM11_305 + PM3_305 + PM7_305 + PM11_305;
        resultTotal305.setText(Double.toString(totalResult305));

        averageResult305 = (AM3_305 +
AM7_305 + AM11_305 + PM3_305 + PM7_305 + PM11_305) / count5;
        ResultAverage305.setText(Double.toString(averageResult305));
        {
            ResultAverage305.setText(String.format("%1.2f",
averageResult305));
        }

        totalResult306 = AM3_306 +
AM7_306 + AM11_306 + PM3_306 + PM7_306 + PM11_306;
        resultTotal306.setText(Double.toString(totalResult306));

        averageResult306 = (AM3_306 +
AM7_306 + AM11_306 + PM3_306 + PM7_306 + PM11_306) / count6;
        ResultAverage306.setText(Double.toString(averageResult306));
        {
            ResultAverage306.setText(String.format("%1.2f",
averageResult306));
        }

        totalResult307 = AM3_307 +
AM7_307 + AM11_307 + PM3_307 + PM7_307 + PM11_307;
        resultTotal307.setText(Double.toString(totalResult307));

        averageResult307 = (AM3_307 +
AM7_307 + AM11_307 + PM3_307 + PM7_307 + PM11_307) / count7;
        ResultAverage307.setText(Double.toString(averageResult307));
        {
            ResultAverage307.setText(String.format("%1.2f",
averageResult307));
        }

        totalResult308 = AM3_308 +
AM7_308 + AM11_308 + PM3_308 + PM7_308 + PM11_308;
        resultTotal308.setText(Double.toString(totalResult308));

        averageResult308 = (AM3_308 +
AM7_308 + AM11_308 + PM3_308 + PM7_308 + PM11_308) / count8;
        ResultAverage308.setText(Double.toString(averageResult308));
        {
            ResultAverage308.setText(String.format("%1.2f",
averageResult308));
        }

        totalResult309 = AM3_309 +
AM7_309 + AM11_309 + PM3_309 + PM7_309 + PM11_309;
        resultTotal309.setText(Double.toString(totalResult309));

        averageResult309 = (AM3_309 +
AM7_309 + AM11_309 + PM3_309 + PM7_309 + PM11_309) / count9;
        ResultAverage309.setText(Double.toString(averageResult309));
        {
            ResultAverage309.setText(String.format("%1.2f",
averageResult309));
        }

        totalResult310 = AM3_310 +
AM7_310 + AM11_310 + PM3_310 + PM7_310 + PM11_310;
        resultTotal310.setText(Double.toString(totalResult310));

        averageResult310 = (AM3_310 +
AM7_310 + AM11_310 + PM3_310 + PM7_310 + PM11_310) / count10;
        ResultAverage310.setText(Double.toString(averageResult310));
        {
            ResultAverage310.setText(String.format("%1.2f",
averageResult310));
        }

        totalResult311 = AM3_311 +
AM7_311 + AM11_311 + PM3_311 + PM7_311 + PM11_311;
        resultTotal311.setText(Double.toString(totalResult311));

        averageResult311 = (AM3_311 +
AM7_311 + AM11_311 + PM3_311 + PM7_311 + PM11_311) / count11;
        ResultAverage311.setText(Double.toString(averageResult311));
        {
            ResultAverage311.setText(String.format("%1.2f",
averageResult311));
        }

        totalResult313 = AM3_313 +
AM7_313 + AM11_313 + PM3_313 + PM7_313 + PM11_313;
        resultTotal313.setText(Double.toString(totalResult313));

        averageResult313 = (AM3_313 +
AM7_313 + AM11_313 + PM3_313 + PM7_313 + PM11_313) / count13;
        ResultAverage313.setText(Double.toString(averageResult313));
        {
            ResultAverage313.setText(String.format("%1.2f",
averageResult313));
        }

        totalResult314 = AM3_314 +
AM7_314 + AM11_314 + PM3_314 + PM7_314 + PM11_314;
        resultTotal314.setText(Double.toString(totalResult314));

        averageResult314 = (AM3_314 +
AM7_314 + AM11_314 + PM3_314 + PM7_314 + PM11_314) / count14;
        ResultAverage314.setText(Double.toString(averageResult314));
        {
            ResultAverage314.setText(String.format("%1.2f",
averageResult314));
        }

        totalResult315 = AM3_315 +
AM7_315 + AM11_315 + PM3_315 + PM7_315 + PM11_315;
        resultTotal315.setText(Double.toString(totalResult315));

        averageResult315 = (AM3_315 +
AM7_315 + AM11_315 + PM3_315+ PM7_315 + PM11_315) / count15;
        ResultAverage315.setText(Double.toString(averageResult315));
        {
            ResultAverage315.setText(String.format("%1.2f",
averageResult315));
        }

        totalResult316 = AM3_316 +
AM7_316 + AM11_316 + PM3_316 + PM7_316 + PM11_316;
        resultTotal316.setText(Double.toString(totalResult316));

        averageResult316 = (AM3_316 +
AM7_316 + AM11_316 + PM3_316 + PM7_316 + PM11_316) / count16;
        ResultAverage316.setText(Double.toString(averageResult316));
        {
            ResultAverage316.setText(String.format("%1.2f",
averageResult316));
        }

        totalResult317 = AM3_317 +
AM7_317 + AM11_317 + PM3_317 + PM7_317 + PM11_317;
        resultTotal317.setText(Double.toString(totalResult317));

        averageResult317 = (AM3_317 +
AM7_317 + AM11_317 + PM3_317 + PM7_317 + PM11_317) / count17;
        ResultAverage317.setText(Double.toString(averageResult310));
        {
            ResultAverage317.setText(String.format("%1.2f",
averageResult317));
        }


        final EditText
etMaint_303 = (EditText) findViewById(R.id.maint_303);
        final EditText
etMaint_304 = (EditText) findViewById(R.id.maint_304);
        final EditText
etMaint_305 = (EditText) findViewById(R.id.maint_305);
        final EditText
etMaint_306 = (EditText) findViewById(R.id.maint_306);
        final EditText
etMaint_307 = (EditText) findViewById(R.id.maint_307);
        final EditText
etMaint_308 = (EditText) findViewById(R.id.maint_308);
        final EditText
etMaint_309 = (EditText) findViewById(R.id.maint_309);
        final EditText
etMaint_310 = (EditText) findViewById(R.id.maint_310);
        final Button bSubmit = (Button)
findViewById(R.id.CR2_button);


        bSubmit.setOnClickListener(new View.OnClickListener()
{
            @Override
            public void onClick(View v) {
                final String Maint303 =
etMaint_303.getText().toString();
                final String Maint304 = etMaint_304.getText().toString();
                final String Maint305 =
etMaint_305.getText().toString();
                final String Maint306 =
etMaint_306.getText().toString();
                final String Maint307 =
etMaint_307.getText().toString();
                final String Maint308 =
etMaint_308.getText().toString();
                final String Maint309 =
etMaint_309.getText().toString();
                final String Maint310 =
etMaint_310.getText().toString();



                      Response.Listener<String>
responseListener = new Response.Listener<String>() {

                    @Override
                    public void onResponse(String
response) {
                        try {
                            //Log.d("JSON
Parser", response);

                            JSONObject
jsonResponse = new JSONObject(response);
                            boolean success =
jsonResponse.getBoolean("success");


                            if (success) {
                                Context context =
getApplicationContext();
                               
CharSequence text = "Record updated Sucessfully";
                                int duration = Toast.LENGTH_SHORT;

                                Toast
toast = Toast.makeText(context, text, duration);
                               
toast.show();

                                Intent
intent = new Intent(chlorinator_room.this, UserAreaActivity.class);
                               
chlorinator_room.this.startActivity(intent);

                            } else {
                               
AlertDialog.Builder builder = new AlertDialog.Builder(chlorinator_room.this);
                               
builder.setMessage("Please upate the entire form and select submit")
                                       
.setNegativeButton("Retry", null)
                                       
.create()
                                       
.show();
                            }

                        } catch (JSONException e)
{

                           
e.printStackTrace();
                        }


                    }
                };

                chlorinatorRequest
chlorinatorrequest = new chlorinatorRequest(Maint303, Maint304,Maint305,Maint306, Maint307,
Maint308, Maint309, Maint310, responseListener);
                RequestQueue queue = new Volley().newRequestQueue(chlorinator_room.this);
               
queue.add(chlorinatorrequest);
            }
        });
    }





























 

