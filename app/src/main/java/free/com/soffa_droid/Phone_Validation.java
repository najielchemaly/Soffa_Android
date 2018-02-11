package free.com.soffa_droid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Phone_Validation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_validation);

        Button verifynumber = (Button) findViewById(R.id.button18);
        verifynumber.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent myIntent = new Intent(Phone_Validation.this, MainActivity.class);
                startActivity(myIntent);

            }
        });
    }
}
