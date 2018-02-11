package free.com.soffa_droid.PopUp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import free.com.soffa_droid.R;

public class PopUpFragment extends DialogFragment {
    public static PopUpFragment newInstance(){
        PopUpFragment fragment = new PopUpFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_pop_up,container,false);
        FloatingActionButton fab = view.findViewById(R.id.floatingActionButton);
        
        return view;
    }


}
