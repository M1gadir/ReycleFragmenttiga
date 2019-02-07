package com.magad.reyclefragmenttiga.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.reyclefragmenttiga.R;

class Hor3 extends RecyclerView.Adapter<Hor3.Hour3> {
    Context context;
    String[] apstyle;
    int[] gs;


    public Hor3(Context context, String[] aplikasistyle, int[] gamstyle) {
        this.context = context;
        this.apstyle = aplikasistyle;
        this.gs = gamstyle;
    }

    @NonNull
    @Override
    public Hour3 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragmenthorizontal,null);
        return new Hour3(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Hour3 hour3, int i) {
    hour3.tvt3.setText(apstyle[i]);
    hour3.imv3.setImageResource(gs[i]);
    }

    @Override
    public int getItemCount() {
        return apstyle.length;
    }

    public class Hour3 extends RecyclerView.ViewHolder {
        ImageView imv3;
        TextView tvt3;
        public Hour3(@NonNull View itemView) {
            super(itemView);
            imv3 = itemView.findViewById(R.id.gambarapp);
            tvt3 = itemView.findViewById(R.id.txtapl);
        }
    }
}
