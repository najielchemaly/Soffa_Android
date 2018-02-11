package free.com.soffa_droid.PopUp;

import android.app.DialogFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import free.com.soffa_droid.R;

public class TakePictureFragment extends DialogFragment {
    public static TakePictureFragment newInstance(){
        TakePictureFragment fragment = new TakePictureFragment();
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view2 = inflater.inflate(R.layout.fragment_take_picture,container,false);
        FloatingActionButton fab = view2.findViewById(R.id.floatingActionButton2);

        return view2;
    }


}
