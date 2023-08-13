package com.example.mynexttryrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: RecyclerViewAdapter

    private lateinit var content: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initContent()
        initRecyclerView()
    }

    private fun initRecyclerView() {
        recyclerView = findViewById(R.id.recyclerView)
        layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        adapter = RecyclerViewAdapter(content)

        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter

        recyclerView.addItemDecoration(DividerItemDecoration(recyclerView.context,layoutManager.orientation))

        adapter.setOnItemClickListener(object :RecyclerViewAdapter.ViewHolder.OnItemClickListener {
            override fun setOnClickListener(position: Int) {
                Toast.makeText(applicationContext,"${content[position].lastname}wurde gecklickt",Toast.LENGTH_SHORT).show()
            }

            override fun setOnLongClickListener(position: Int) {
                Toast.makeText(applicationContext,"${content[position].lastname}wurde gelöscht",Toast.LENGTH_SHORT).show()
            }
        })


    }

    private fun initContent() {
        content = ArrayList()
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))
        content.add(User(content.size+1,"Andi","Pelczer","01705006902"))


    }

}