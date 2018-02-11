package free.com.soffa_droid.Adapter;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

import free.com.soffa_droid.R;

/**
 * Created by wadihhannouch on 1/31/2018.
 */

public class Vehicules_ListView_Adapter extends BaseAdapter {


    List<String> myVehicules;
    Activity activity;
    public Vehicules_ListView_Adapter (Activity activity,List<String> myVehicules){
        this.myVehicules = myVehicules;
        this.activity = activity;

    }


    @Override
    public int getCount() {
        return myVehicules.size();
    }

    @Override
    public Object getItem(int i) {
        return myVehicules.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if( view == null) {
            view = LayoutInflater.from(activity).inflate(R.layout.vehicule_listview_cell, viewGroup);
        }
        TextView txtVehiulePlateNumber = (TextView) view.findViewById(R.id.txtVehiulePlateNumber);
        txtVehiulePlateNumber.setText(myVehicules.get(i));
        return view;
    }

}
