package com.example.kuispam;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private  ArrayList<List> Listt;
    private OnItemClickListener mListener;

    public interface OnItemClickListener{ //class abstract
        void onItemCLick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        mListener = listener; //set item yang akan diklik
    }

    public Adapter(ArrayList<List> listt) {

        Listt =listt;
    }

    @Override
    public ViewHolder onCreateViewHolder( ViewGroup viewGroup, int i) {
        //membaca file xml
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_layout, viewGroup,false);
        ViewHolder viewHolder = new ViewHolder(view, mListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder( ViewHolder viewHolder, int i) {
    final List currentlist = Listt.get(i); //inisialisasi list dan lis get image,head,dan des

    viewHolder.imageView.setImageResource(currentlist.getImageS()); //view mengeset image
    viewHolder.textView.setText(currentlist.getHead());//view mengeset Head(Judul)
    viewHolder.textView2.setText(currentlist.getDes());//view mengeset Deskripsi

    }

    @Override
    public int getItemCount() {
        return Listt.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView imageView;
        public TextView textView;
        public TextView textView2;

        public ViewHolder(View itemView, final OnItemClickListener listener) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image1); // mengambil gambar melalui ID yang telah ditentukan
            textView = itemView.findViewById(R.id.Judul);// mengambil judul melalui ID yang telah ditentukan
            textView2 = itemView.findViewById(R.id.Deskripsi);// mengambil Deskripsi melalui ID yang telah ditentukan

            //item select recyler
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(listener != null){
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION){
                            listener.onItemCLick(position);
                        }
                    }
                }
            });


        }
    }




}
