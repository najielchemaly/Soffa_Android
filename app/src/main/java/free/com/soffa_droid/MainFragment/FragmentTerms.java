package free.com.soffa_droid.MainFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import free.com.soffa_droid.R;

public class FragmentTerms extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View y1 = inflater.inflate(R.layout.fragment_terms,container,false);

        /* Define Your Functionality Here
           Find any view  => v.findViewById()
          Specifying Application Context in Fragment => getActivity() */

        return y1;
    }
}