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
public class VerGamFragment extends Fragment {

    RecyclerView ver2;
    Ver2  adver2;

    String[] nama = {"macbook","laptop gaming","komputergaming","console","IMac","Iphone"};

    public VerGamFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_ver_gam, container, false);
        ver2 = v.findViewById(R.id.listvegam);
        adver2 = new Ver2(getActivity(),nama);

        ver2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false));
        ver2.setAdapter(adver2);

        return v;
    }

}
