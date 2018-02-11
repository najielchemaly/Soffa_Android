package free.com.soffa_droid.MainFragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import free.com.soffa_droid.Adapter.Vehicules_ListView_Adapter;
import free.com.soffa_droid.R;

public class AddVehicleFragment extends Fragment {
    List<String> myVehicles;

    public static AddVehicleFragment newInstance() {
        AddVehicleFragment addVehicleFragment = new AddVehicleFragment();

        return addVehicleFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_add_vehicle, null);
        myVehicles = new ArrayList<String>();
        myVehicles.add("B145 266");
        myVehicles.add("B145 267");
        myVehicles.add("B145 268");
        ListView vehiculesListView = (ListView) rootView.findViewById(R.id.vehiculesListView);
        ListAdapter adapter = new Vehicules_ListView_Adapter(this.getActivity(),myVehicles);
        vehiculesListView.setAdapter(adapter);
        return rootView;
    }
public String toString(){ return "AddVehicleFragment";
    }
}
