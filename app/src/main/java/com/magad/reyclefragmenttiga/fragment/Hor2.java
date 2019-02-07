package com.magad.reyclefragmenttiga.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.reyclefragmenttiga.R;

class Hor2 extends RecyclerView.Adapter<Hor2.Hour2> {

    Context context;
    String[] educ;
    int[] gd;


    Hor2(Context content, String[] aplikasiedukasi, int[] gamedukasi) {
        this.context = content;
        this.educ = aplikasiedukasi;
        this.gd = gamedukasi;

    }

    @NonNull
    @Override
    public Hour2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.fragmenthorizontal,null);
        return new Hour2(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Hour2 hour2, int i) {
    hour2.Ivh2.setImageResource(gd[i]);
    hour2.Tvh2.setText(educ[i]);
    }

    @Override
    public int getItemCount() {
        return educ.length;
    }

    public class Hour2 extends RecyclerView.ViewHolder {
        ImageView Ivh2;
        TextView Tvh2;
        public Hour2(@NonNull View itemView) {
            super(itemView);
            Ivh2 = itemView.findViewById(R.id.gambarapp);
            Tvh2 = itemView.findViewById(R.id.txtapl);
        }
    }
}
