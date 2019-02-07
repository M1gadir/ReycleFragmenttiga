package com.magad.reyclefragmenttiga.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.magad.reyclefragmenttiga.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class VertikalFragment extends Fragment {

    RecyclerView ver1;
    Ver1 verew1;

    String[] namtit ={"macbook air 2015","macbook pro 2012","macbook 2017","macbook 2018","macbook 2013 15 inchs"};
    String[] namdet ={
            "2,5 GHz I5 ,2GB Vram , display retina, Ram 8GB",
            "2,7 GHz I5 ,2GB Vram , display retina, Ram 8gb",
            "2,5 GHz I5 ,2GB Vram , display retina, Ram8gb",
            "2,5 GHz I5 ,2GB Vram , display retina,Ram 16gb",
            "2,5 GHz I5 ,2GB Vram , display retina,Ram 4gb"};
    String[] namrat ={"4,5","4,6","3.7","4,3","4,0"};
    String[] namhar ={"20000000,0","15000000,0","24000000,0","30000000,0","18000000,0"};
    int[] gamver ={R.drawable.macboktips,R.drawable.macbook,R.drawable.macbooktl,R.drawable.macbooktil,R.drawable.macbooktiga};


    public VertikalFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_vertikal, container, false);
        ver1 = v.findViewById(R.id.listver);
        ver1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        verew1 = new Ver1(getActivity(),namdet,gamver,namrat,namtit,namhar);
        ver1.setAdapter(verew1);

        return v;
    }

}
