package free.com.soffa_droid;

import android.app.DialogFragment;

import android.support.v4.app.FragmentTransaction;
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

import free.com.soffa_droid.Base.BaseActivity;
import free.com.soffa_droid.PopUp.PopUpFragment;

public class MainLogin extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_login);
            // test to push

//        sss
                
        SpannableStringBuilder builder = new SpannableStringBuilder();
//                 SOFFA,
//
        SpannableString str1 = new SpannableString("I have read and i do accept the ");
        str1.setSpan(new ForegroundColorSpan(Color.DKGRAY), 0, str1.length(), 0);
        builder.append(str1);

        SpannableString str2 = new SpannableString("terms and conditions \n");
        str2.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), 0, str2.length(), 0);
        builder.append(str2);


        SpannableString str3 = new SpannableString("and the ");
        str3.setSpan(new ForegroundColorSpan(Color.DKGRAY), 0, str3.length(), 0);
        builder.append(str3);

        SpannableString str4 = new SpannableString("privacy policy.");
        str4.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.colorPrimary)), 0, str4.length(), 0);
        builder.append(str4);

        TextView tv = (TextView) findViewById(R.id.textView20);
        tv.setText(builder, TextView.BufferType.SPANNABLE);

        Button next = (Button) findViewById(R.id.button22);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainLogin.this, Phone_Validation.class);
                startActivity(myIntent);

            }
        });

        Button back = (Button) findViewById(R.id.button21);
        back.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(MainLogin.this, Phone_Validation.class);
                startActivity(myIntent);

            }
        });




    }
}
