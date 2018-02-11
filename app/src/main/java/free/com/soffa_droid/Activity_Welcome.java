package free.com.soffa_droid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity_Welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__welcome);


        SpannableStringBuilder builder = new SpannableStringBuilder();


//                 SOFFA,
//
        SpannableString str1 = new SpannableString("Hands free, cash free, hassle free! \n \n Once you’ve registered your car with SOFFA ");
        str1.setSpan(new ForegroundColorSpan(Color.DKGRAY), 0, str1.length(), 0);
        builder.append(str1);

        SpannableString str2 = new SpannableString("SOFFA \n");
        str2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), 0, str2.length(), 0);
        builder.append(str2);


        SpannableString str3 = new SpannableString("you’ll be able to enter and exit parkings without queuing at cash machines and payment stalls. Never worry about misplacing a parking ticket again!");
        str3.setSpan(new ForegroundColorSpan(Color.DKGRAY), 0, str3.length(), 0);
        builder.append(str3);

        TextView tv = (TextView) findViewById(R.id.welcometxt);
        tv.setText(builder, TextView.BufferType.SPANNABLE);

        Button next = (Button) findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Activity_Welcome.this, Activity_login.class);
                startActivity(myIntent);

            }
        });
    }
}
