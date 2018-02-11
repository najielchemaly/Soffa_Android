package free.com.soffa_droid.Base;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import free.com.soffa_droid.PopUp.PopUpFragment;

/**
 * Created by wadihhannouch on 1/28/2018.
 */

public class BaseActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    public void showErrorDialog (){
        DialogFragment fragment =  PopUpFragment.newInstance();
        android.app.FragmentTransaction ft = getFragmentManager().beginTransaction();
        fragment.show(ft,"");
    }

    public void showLoading(){

    }

    public void hideLoading(){

    }

}
