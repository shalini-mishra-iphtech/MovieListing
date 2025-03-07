package com.example.movielisting.adapter

import android.view.LayoutInflater
import android.view.LayoutInflater.*
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.movielisting.R
import com.example.movielisting.model.MovieData
import com.bumptech.glide.Glide

class MovieAdapter(private val MovieList:List<MovieData>):RecyclerView.Adapter<MovieAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val view= from(parent.context).inflate(R.layout.movie_item,parent,false)
        return MyViewHolder(view)
    }

    class MyViewHolder (view:View):RecyclerView.ViewHolder(view){

        val imageAvtar:ImageView=view.findViewById(R.id.img_avtar)
        val firstName:TextView=view.findViewById(R.id.first_name)
        val lastName:TextView=view.findViewById(R.id.last_name)
        val email:TextView=view.findViewById(R.id.email)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val user=MovieList[position]
        holder.firstName.text=user.first_name
        holder.lastName.text=user.last_name
        holder.email.text=user.email
        Glide.with(holder.itemView.context).load(user.avtar).into(holder.imageAvtar)
    }

    override fun getItemCount()=MovieList.size



}