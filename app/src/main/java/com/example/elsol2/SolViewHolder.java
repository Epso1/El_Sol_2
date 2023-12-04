package com.example.elsol2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.security.PublicKey;

public class SolViewHolder extends RecyclerView.ViewHolder{

    public ImageView imageView;
    public Toolbar toolbar;

    public SolViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageViewItem);
        toolbar = itemView.findViewById(R.id.toolbarItem);
    }
}
