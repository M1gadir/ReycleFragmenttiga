package com.magad.reyclefragmenttiga.fragment;


import android.content.Context;

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
public class HorizontalFragment extends Fragment {

    RecyclerView hor1,hor2,hor3;
    Hor1 adapter;
    Hor2 adaptere;
    Hor3 tereadap;


    String[] aplikasigame ={"Mario Bros","Nfs Mostwanted","Drag racing","Ninja Saga","Dragon City"};
    String[] aplikasiedukasi ={"Ruang Guru","Physicology","Math basic","Fundamental Java","Cisco Packet Tracer"};
    String[] aplikasistyle ={"90s Style","80s Style","Future Style","70s Style","Bussines Style"};

    int[] gamgame = {R.drawable.mario,R.drawable.step1,R.drawable.step,R.drawable.stepe,R.drawable.sstepi};
    int[] gamedukasi = {R.drawable.ruangkosong,R.drawable.phyis,R.drawable.masth,R.drawable.java,R.drawable.cisco};
    int[] gamstyle = {R.drawable.stwyle, R.drawable.search,R.drawable.future,R.drawable.tuju,R.drawable.busines};

    public HorizontalFragment() {
        // Required empty public constructor

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_horizontal, container, false);


// the big error is like tihis not get activity is that for a mian activity and you can a chance thecode is  like this
        hor1 = v.findViewById(R.id.recyclehor);
        hor2 = v.findViewById(R.id.recycle_hor);
        hor3 = v.findViewById(R.id.recycle_hore);
//      todo jadi get Activity adalah sebuah function yang berguna untuk membuat activity pengganti class main activity / class karena di fragment tidak bisa menjadi class
        // jadi bisa juga fragment itu berdiri dimana atau menumpang di class mana jadi get activity adalah sebuah mengambil activity yang dia tumpangi
        adapter = new Hor1(getActivity(), aplikasigame,gamgame);
        adaptere = new Hor2(getActivity(),aplikasiedukasi,gamedukasi);
        tereadap = new Hor3(getActivity(),aplikasistyle,gamstyle);

        hor1.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        hor2.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));
        hor3.setLayoutManager(new LinearLayoutManager(getActivity(),LinearLayoutManager.HORIZONTAL,false));

        hor1.setAdapter(adapter);
        hor2.setAdapter(adaptere);
        hor3.setAdapter(tereadap);





        return v;
    }


}
