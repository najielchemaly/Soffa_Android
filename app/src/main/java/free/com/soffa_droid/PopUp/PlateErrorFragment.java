package free.com.soffa_droid.PopUp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import free.com.soffa_droid.R;

public class PlateErrorFragment extends DialogFragment {
    public static PlateErrorFragment newInstance(){
        PlateErrorFragment fragment = new PlateErrorFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view3 = inflater.inflate(R.layout.fragment_plate_error,container,false);
        FloatingActionButton fab = view3.findViewById(R.id.floatingActionButton3);

        return view3;
    }


}
