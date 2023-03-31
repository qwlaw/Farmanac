package com.example.farmanac

import android.media.Image
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ForumViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val profilePic: ImageView = itemView.findViewById(R.id.profile_pic)
    val username: TextView = itemView.findViewById(R.id.forum_username)
    val uploadDate: TextView = itemView.findViewById(R.id.forum_upload_date)
    val forumTitle: TextView = itemView.findViewById(R.id.forum_title)
    val forumContent: TextView = itemView.findViewById(R.id.forum_description)
}