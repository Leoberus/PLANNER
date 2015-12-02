package project.application.planner.fragment;

import android.content.Context;
import android.location.Geocoder;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import project.application.planner.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Map_Fragment extends Fragment {

    private GoogleMap map;
    private Marker marker;
    private View rootView;
    private ImageView btnPlanner,btnFood,btnOli,btnHotel,btnBank,btnHospital,btnPolice,btnCarCare;
    private boolean blPlanner = false ,blFood = false ,blOli = false,blHotel = false
            ,blBank = false ,blHospital = false,blPolice = false,blCarCare = false;

    public Map_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        rootView = inflater.inflate(R.layout.fragment_map, container, false);

        if (map == null)
            map = ((SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map)).getMap();
        map.getUiSettings().setMapToolbarEnabled(false);
        map.getUiSettings().setZoomControlsEnabled(false);


        marker = map.addMarker(new MarkerOptions()
                .position(new LatLng(13.745737, 100.534320))
                .title("Your Location")
                .icon(BitmapDescriptorFactory.fromResource(R.drawable.marker_user)));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(13.745737, 100.534320), 14));

        btnPlanner = (ImageView) rootView.findViewById(R.id.btn_planner);
        btnFood = (ImageView) rootView.findViewById(R.id.btn_food);
        btnOli = (ImageView) rootView.findViewById(R.id.btn_oli);
        btnCarCare = (ImageView) rootView.findViewById(R.id.btn_car_care);
        btnHotel = (ImageView) rootView.findViewById(R.id.btn_hotel);
        btnBank = (ImageView) rootView.findViewById(R.id.btn_bank);
        btnHospital = (ImageView) rootView.findViewById(R.id.btn_hospital);
        btnPolice = (ImageView) rootView.findViewById(R.id.btn_police);

        btnPlanner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blPlanner){
                    blPlanner = false;
                    btnPlanner.setImageResource(R.drawable.btn_planner);
                }else{
                    blPlanner = true;
                    btnPlanner.setImageResource(R.drawable.btn_planner_active);
                }
            }
        });
        btnFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blFood){
                    blFood = false;
                    btnFood.setImageResource(R.drawable.btn_food);
                    Toast.makeText(getActivity(),String.valueOf(blFood),Toast.LENGTH_LONG).show();
                }else{
                    blFood = true;
                    btnFood.setImageResource(R.drawable.btn_food_active);
                    Toast.makeText(getActivity(),String.valueOf(blFood),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnCarCare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blCarCare){
                    blCarCare = false;
                    btnCarCare.setImageResource(R.drawable.btn_car_care);
                    Toast.makeText(getActivity(),String.valueOf(blCarCare),Toast.LENGTH_LONG).show();
                }else{
                    blCarCare = true;
                    btnCarCare.setImageResource(R.drawable.btn_car_care_active);
                    Toast.makeText(getActivity(),String.valueOf(blCarCare),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnOli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blOli){
                    blOli = false;
                    btnOli.setImageResource(R.drawable.btn_oli);
                    Toast.makeText(getActivity(),String.valueOf(blOli),Toast.LENGTH_LONG).show();
                }else{
                    blOli = true;
                    btnOli.setImageResource(R.drawable.btn_oli_active);
                    Toast.makeText(getActivity(),String.valueOf(blOli),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blHotel){
                    blHotel = false;
                    btnHotel.setImageResource(R.drawable.btn_hotel);
                    Toast.makeText(getActivity(),String.valueOf(blHotel),Toast.LENGTH_LONG).show();
                }else{
                    blHotel = true;
                    btnHotel.setImageResource(R.drawable.btn_hotel_active);
                    Toast.makeText(getActivity(),String.valueOf(blHotel),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnBank.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (blBank) {
                    blBank = false;
                    btnBank.setImageResource(R.drawable.btn_bank);
                    Toast.makeText(getActivity(),String.valueOf(blBank),Toast.LENGTH_LONG).show();
                } else {
                    blBank = true;
                    btnBank.setImageResource(R.drawable.btn_bank_active);
                    Toast.makeText(getActivity(),String.valueOf(blBank),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blHospital){
                    blHospital = false;
                    btnHospital.setImageResource(R.drawable.btn_hospital);
                    Toast.makeText(getActivity(),String.valueOf(blHospital),Toast.LENGTH_LONG).show();
                }else{
                    blHospital = true;
                    btnHospital.setImageResource(R.drawable.btn_hospital_active);
                    Toast.makeText(getActivity(),String.valueOf(blHospital),Toast.LENGTH_LONG).show();
                }
            }
        });

        btnPolice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blPolice){
                    blPolice = false;
                    btnPolice.setImageResource(R.drawable.btn_police);
                    Toast.makeText(getActivity(),String.valueOf(blPolice),Toast.LENGTH_LONG).show();
                }else{
                    blPolice = true;
                    btnPolice.setImageResource(R.drawable.btn_police_active);
                    Toast.makeText(getActivity(),String.valueOf(blPolice),Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();

        try {
            SupportMapFragment fragment = (SupportMapFragment) getActivity()
                    .getSupportFragmentManager().findFragmentById(R.id.map);
            if (fragment != null) {
                getFragmentManager().beginTransaction().remove(fragment)
                        .commit();
            }

        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
