package project.application.planner;

import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import project.application.planner.fragment.Inform_Fragment;
import project.application.planner.fragment.Map_Fragment;


public class MainActivity extends FragmentActivity {

    private static int position = 0;
    private RelativeLayout menuAccident,menuMap;
    private LinearLayout menuLine0,menuLine1;
    private ImageView menu0,menu1;

    /*TabHost.TabSpec bmwTab, fordTab, toyotaTab;
    Fragment inform = new Inform_Fragment();
    Fragment map = new Map_Fragment();*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*ActionBar actionBar = getSupportActionBar();

        // Screen handling while hiding ActionBar icon.
        actionBar.setDisplayShowHomeEnabled(false);

        // Screen handling while hiding Actionbar title.
        actionBar.setDisplayShowTitleEnabled(false);

        // Creating ActionBar tabs.
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        bmwTab = actionBar.newTab().setIcon(R.drawable.menu_1);
        toyotaTab = actionBar.newTab().setIcon(R.drawable.menu_2);

        bmwTab.setTabListener(new TabListener_Activity(inform));
        toyotaTab.setTabListener(new TabListener_Activity(map));

        actionBar.addTab(bmwTab);
        actionBar.addTab(toyotaTab);*/


        menuAccident = (RelativeLayout) findViewById(R.id.menu0_layout);
        menuMap = (RelativeLayout) findViewById(R.id.menu1_layout);
        menuLine0 = (LinearLayout) findViewById(R.id.line_menu0);
        menuLine1 = (LinearLayout) findViewById(R.id.line_menu1);
        menu0 = (ImageView) findViewById(R.id.menu0);
        menu1 = (ImageView) findViewById(R.id.menu1);


        menu0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPosition(0);
            }
        });
        menu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPosition(1);
            }
        });
        menuAccident.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPosition(0);
            }
        });
        menuMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setPosition(1);
            }
        });
        setPosition(1);

    }

    public void setPosition(int position) {
        this.position = position;
        setMenu(this.position);
        selectFragment(this.position);
    }

    public void setMenu(int position){
        //set color and style of Top Menu Bar
        menuAccident.setBackgroundColor(getResources().getColor(R.color.default_color));
        menuMap.setBackgroundColor(getResources().getColor(R.color.default_color));
        menuLine0.setBackgroundColor(getResources().getColor(R.color.default_color));
        menuLine1.setBackgroundColor(getResources().getColor(R.color.default_color));

        if (position == 0) {
            menuAccident.setBackgroundColor(getResources().getColor(R.color.menu_active));
            menuLine0.setBackgroundColor(getResources().getColor(R.color.white));
        } else if (position == 1) {
            menuMap.setBackgroundColor(getResources().getColor(R.color.menu_active));
            menuLine1.setBackgroundColor(getResources().getColor(R.color.white));
        }
    }

    public void selectFragment(int position){
        //Show fragment when select on Top Menu Bar
        if(position == 0){
            Inform_Fragment inform = new Inform_Fragment();
            inform.getFragmentManager();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction();
            ft.replace(R.id.frame_container, inform);
            ft.commit();
        }else if(position == 1){
            Map_Fragment map = new Map_Fragment();
            map.getFragmentManager();
            FragmentTransaction ft = getSupportFragmentManager()
                    .beginTransaction();
            ft.replace(R.id.frame_container, map);
            ft.commit();
        }
    }

}
