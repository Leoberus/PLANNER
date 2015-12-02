package project.application.planner.fragment;


import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.android.gms.maps.SupportMapFragment;

import project.application.planner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Inform_Fragment extends Fragment {


    public Inform_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inform, container, false);
    }


   /* @Override
    public void onDestroyView() {
        super.onDestroyView();

        try {
            SupportMapFragment fragment = (SupportMapFragment) getActivity()
                    .getSupportFragmentManager().findFragmentById(R.id.inform);
            if (fragment != null) {
                getFragmentManager().beginTransaction().remove(fragment)
                        .commit();
                Log.d("removeeeeeeeaaaaa", "=========aaaaa");
            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }*/
}
