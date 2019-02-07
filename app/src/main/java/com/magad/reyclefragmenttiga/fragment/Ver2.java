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

class Ver2 extends RecyclerView.Adapter<Ver2.Veur2> {
    Context content;
    String[] name;

    public Ver2(Context context, String[] nama) {
        this.content = context;
        this.name = nama;

    }

    @NonNull
    @Override
    public Veur2 onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(content).inflate(R.layout.fragmentvergambar,null);
        return new Veur2(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Veur2 veur2, int i) {
    veur2.tvtlm.setText(name[i]);
    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class Veur2 extends RecyclerView.ViewHolder {
        TextView tvtlm;
        public Veur2(@NonNull View itemView) {
            super(itemView);
            tvtlm = itemView.findViewById(R.id.tvvergam);
        }
    }
}
