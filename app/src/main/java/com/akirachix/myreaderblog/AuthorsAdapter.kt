package com.akirachix.myreaderblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class AuthorsAdapter (var authourList:List<Authors>):RecyclerView.Adapter<AuthorViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.author_profile, parent, false)
        return AuthorViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        val author=authourList[position]
        holder.tvName.text=author.name
        holder.tvLink.text=author.link
        holder.tvPublish.text=author.publisherDate
        holder.tvTitle.text=author.title
        holder.tvArticlePreview.text=author.articlePreview
    }

    override fun getItemCount(): Int {
        return authourList.size
    }
}
class AuthorViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
var tvName=itemView.findViewById<TextView>(R.id.tvName)
    var tvTitle=itemView.findViewById<TextView>(R.id.txTitle)
    var tvPublish=itemView.findViewById<TextView>(R.id.tvPublish)
    var tvArticlePreview=itemView.findViewById<TextView>(R.id.tvArticlePreview)
    var tvLink=itemView.findViewById<TextView>(R.id.tvLink)
}