package com.juliarman.appgithubuser

/*************************************
Name       : Juliarman Umar
Email      : juliarmanbone@gmail.com
No Whatsapp: +6285254402647
 **************************************/

import kotlinx.android.synthetic.main.item_github_user.view.*
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class GithubAdapter(private val listGithubUser: ArrayList<GithubUser>) : RecyclerView.Adapter<GithubAdapter.GithubViewHolder>() {


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): GithubAdapter.GithubViewHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_github_user, parent, false)
        return GithubViewHolder(view    )
    }

    override fun getItemCount(): Int {

        return listGithubUser.size

    }

    override fun onBindViewHolder(holder: GithubAdapter.GithubViewHolder, position: Int) {

        val listGithub = listGithubUser[position]
        holder.bind(listGithub)
        holder.itemView.setOnClickListener {

            val context = holder.itemView.context
            val intent = Intent(context, DetailGithubActivity::class.java)
            intent.putExtra(DetailGithubActivity.OBJECT_DATA, listGithub)
            context.startActivity(intent)
        }

    }

    inner class GithubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(listGithub: GithubUser){

            val tvName: TextView = itemView.findViewById(R.id.tv_name)
            val tvPlace: TextView = itemView.findViewById(R.id.tv_place)
            val tvCompany: TextView = itemView.findViewById(R.id.tv_company)
            val tvFollower: TextView = itemView.findViewById(R.id.tv_card_follower)
            val tvFollowing: TextView = itemView.findViewById(R.id.tv_card_following)
            val imgUser: CircleImageView = itemView.findViewById(R.id.img_user)

            tvName.text = listGithub.nameGithubUser
            tvPlace.text = listGithub.location
            tvCompany.text = listGithub.company
            tvFollower.text = listGithub.follower
            tvFollowing.text = listGithub.following
            listGithub.avatarUser?.let { imgUser.setImageResource(it) }


        }

    }

}