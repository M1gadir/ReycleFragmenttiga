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

class Hor1 extends RecyclerView.Adapter<Hor1.Hour1> {

    Context context;
    String[] gem;
    int[] ggem;

    Hor1(Context context, String[] aplikasigame, int[] gamgame) {
                this.context = context;
                this.gem = aplikasigame;
                this.ggem = gamgame;

    }

    @NonNull
    @Override
    public Hour1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        // Todo jadi context itu berasal dari mananya mau activity,dll dan context ini untuk pengganti main activity atau menkorversi agar bisa fragment nya mempuntai wadah
        View v = LayoutInflater.from(context).inflate(R.layout.fragmenthorizontal,null);
        return new Hour1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Hour1 hour1, int i) {
    hour1.gam.setImageResource(ggem[i]);
    hour1.namee.setText(gem[i]);
    }

    @Override
    public int getItemCount() {
        return gem.length;
    }

    public class Hour1 extends RecyclerView.ViewHolder {
        TextView namee;
        ImageView gam;
        public Hour1(@NonNull View itemView) {
            super(itemView);
            gam = itemView.findViewById(R.id.gambarapp);
            namee = itemView.findViewById(R.id.txtapl);

        }
    }
}
