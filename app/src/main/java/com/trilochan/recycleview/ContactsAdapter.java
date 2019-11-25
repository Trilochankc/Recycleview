package com.trilochan.recycleview;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ContactsAdapter {

    public class ContactsViewHolder extends RecyclerView.ViewHolder{

        ImageView imgview;
        EditText etname,etphone;
        public ContactsViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imgview=itemView.findViewById(R.id.imgprofile);
            etname=itemView.findViewById(R.id.tvName);
            etphone=itemView.findViewById(R.id.tvPhone);
        }

    }
}
