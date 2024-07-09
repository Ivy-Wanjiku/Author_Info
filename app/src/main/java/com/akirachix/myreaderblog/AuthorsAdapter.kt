package com.akirachix.myreaderblog

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBindings
import com.akirachix.myreaderblog.databinding.AuthorProfileBinding
import com.squareup.picasso.Picasso

class AuthorsAdapter (var authourList:List<Authors>):RecyclerView.Adapter<AuthorViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AuthorViewHolder {
        val binding = AuthorProfileBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return AuthorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: AuthorViewHolder, position: Int) {
        val author=authourList[position]
        holder.binding.tvName.text=author.name
        holder.binding.tvLink.text=author.link
        holder.binding.tvPublish.text=author.publisherDate
        holder.binding.txTitle.text=author.title
        holder.binding.tvArticlePreview.text=author.articlePreview
      Picasso.get()
          .load(author.articlePhoto)
          .placeholder(R.drawable.ngugi)
          .into(holder.binding.imgArticlePhoto)

    }

    override fun getItemCount(): Int {
        return authourList.size
    }
}
class AuthorViewHolder(var binding:AuthorProfileBinding):RecyclerView.ViewHolder(binding.root){

}
        