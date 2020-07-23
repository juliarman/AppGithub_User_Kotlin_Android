package com.juliarman.appgithubuser

/*************************************
 Name       : Juliarman Umar
 Email      : juliarmanbone@gmail.com
 No Whatsapp: +6285254402647
**************************************/

import android.content.res.TypedArray
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private lateinit var dataUsername: Array<String>
    private lateinit var dataName: Array<String>
    private lateinit var dataLocation: Array<String>
    private lateinit var dataCompany: Array<String>
    private lateinit var dataFollower: Array<String>
    private lateinit var dataFollowing: Array<String>
    private lateinit var dataRepository: Array<String>
    private lateinit var dataAvatarUser: TypedArray
    private var list: ArrayList<GithubUser> = arrayListOf()

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv_github_user.setHasFixedSize(true)

        setupData()

    }

  private fun prepareItem() {

        dataUsername = resources.getStringArray(R.array.username)
        dataName = resources.getStringArray(R.array.name)
        dataLocation = resources.getStringArray(R.array.location)
        dataCompany = resources.getStringArray(R.array.company)
        dataAvatarUser = resources.obtainTypedArray(R.array.avatar)
        dataFollower = resources.getStringArray(R.array.followers)
        dataFollowing = resources.getStringArray(R.array.following)
        dataRepository = resources.getStringArray(R.array.repository)

    }

    private fun addItem() {
        for (position in dataName.indices ){
            val datagit = GithubUser(

                dataUsername[position],
                dataName[position],
                dataLocation[position],
                dataCompany[position],
                dataAvatarUser.getResourceId(position, position),
                dataRepository[position],
                dataFollower[position],
                dataFollowing[position]

            )

            list.add(datagit)
        }
    }

    private fun setupData(){

        prepareItem()
        addItem()
        rv_github_user.layoutManager = LinearLayoutManager(this)
        val cardViewGithubAdapter = GithubAdapter(list)
        rv_github_user.adapter = cardViewGithubAdapter

    }



}