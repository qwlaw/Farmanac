package com.example.farmanac

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ForumAdapter(): RecyclerView.Adapter<ForumViewHolder>() {

    lateinit var context: Context
    lateinit var forums: List<Forum>

    constructor(context: Context, forums: List<Forum>): this(){
        this.context = context
        this.forums = forums
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ForumViewHolder {
        return ForumViewHolder(LayoutInflater.from(context).inflate(R.layout.forum_view, parent, false))
    }

    override fun onBindViewHolder(holder: ForumViewHolder, position: Int) {
        holder.profilePic.setImageResource(forums[position].profilePic)
        holder.username.text = forums[position].username
        holder.uploadDate.text = forums[position].uploadDate.toString()
        holder.forumTitle.text = forums[position].title
        holder.forumContent.text = forums[position].description
    }

    override fun getItemCount(): Int {
        return forums.size
    }

}