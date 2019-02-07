package com.magad.reyclefragmenttiga.fragment;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.magad.reyclefragmenttiga.R;

class Ver1 extends RecyclerView.Adapter<Ver1.Veur1> {
    Context content;
    String[] vertit, verdet, verrat, verhar;
    int[] gamever;
    public Ver1(Context context, String[] namver, int[] gamver, String[] namrat, String[] namtit, String[] namhar) {
        this.content = context;
        this.verrat = namrat;
        this.gamever = gamver;
        this.vertit = namtit;
        this.verdet = namver;
        this.verhar = namhar;

    }

    @NonNull
    @Override
    public Veur1 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(content).inflate(R.layout.fragmentvertikallist,null);
        return new Veur1(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Veur1 veur1, int i) {
        veur1.imvver1.setImageResource(gamever[i]);
        veur1.tvprice.setText(verhar[i]);
        veur1.tvrat.setText(verrat[i]);
        veur1.tvtil.setText(vertit[i]);
        veur1.tvdesc.setText(verdet[i]);
    }

    @Override
    public int getItemCount() {
        return vertit.length;
    }

    public class Veur1 extends RecyclerView.ViewHolder {

        ImageView imvver1;
        TextView tvtil,tvrat,tvdesc,tvprice;

        public Veur1(@NonNull View itemView) {
            super(itemView);

            imvver1 = itemView.findViewById(R.id.imvt);
            tvtil = itemView.findViewById(R.id.tvtitle);
            tvdesc = itemView.findViewById(R.id.tvdetail);
            tvrat = itemView.findViewById(R.id.tvrating);
            tvprice = itemView.findViewById(R.id.tvharga);
        }
    }
}
