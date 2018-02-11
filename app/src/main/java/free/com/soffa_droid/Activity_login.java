package free.com.soffa_droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Activity_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button next = (Button) findViewById(R.id.button6);
        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Activity_login.this, Activity_Password_Forgot.class);
                startActivity(myIntent);

            }
        });

        Button sign = (Button) findViewById(R.id.button8);
        sign.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Activity_login.this, Tips_Activity.class);
                startActivity(myIntent);

            }
        });



    }

}
