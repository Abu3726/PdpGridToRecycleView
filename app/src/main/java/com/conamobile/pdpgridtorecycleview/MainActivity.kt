package com.conamobile.pdpgridtorecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.conamobile.pdpgridtorecycleview.adapter.MemberAdapter
import com.conamobile.pdpgridtorecycleview.model.Member
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    var recyclerView: RecyclerView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView)

        val members: ArrayList<Member> = ArrayList<Member>()
        for (i in 0..30){
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
            members.add(Member(R.drawable.cona_image, "Nurmuhammad"))
        }
        refreshAdapter(members)
    }

    private fun refreshAdapter(members: ArrayList<Member>) {
        val adapter = MemberAdapter(this, members)
        recyclerView!!.adapter = adapter
    }
}