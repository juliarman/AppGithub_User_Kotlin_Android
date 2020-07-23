package com.juliarman.appgithubuser

/*************************************
Name       : Juliarman Umar
Email      : juliarmanbone@gmail.com
No Whatsapp: +6285254402647
 **************************************/


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_github.*


class DetailGithubActivity : AppCompatActivity() {


    companion object{

        const val OBJECT_DATA = "object_data"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_github)

        val data = intent.getParcelableExtra(OBJECT_DATA) as GithubUser

        val username = data.userName
        val fullName = data.nameGithubUser
        val company = data.company
        val location = data.location
        val image = data.avatarUser
        val follower = data.follower
        val following = data.following
        val repository = data.repository


        tv_fullname.text = fullName
        tv_user_name.text = username
        tv_company_data.text = company
        tv_location_data.text = location
        tv_data_follower.text = follower
        tv_data_following.text = following
        tv_repository.text = repository
        image?.let { image_user.setImageResource(it) }

    }
}