package com.example.mynexttryrecycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(var content: ArrayList<User>) :
    RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    //Variablen:

    private lateinit var mListener: ViewHolder.OnItemClickListener


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.recycleritem_user, parent, false)
        return ViewHolder(view, this.mListener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.nametv.text = "${content[position].firstname}${content[position].lastname}"
        holder.nummertv.text = content[position].nummer
        //       holder.itemViewtv.setImageResource(content[position])

    }

    override fun getItemCount(): Int {
        return content.size
    }

    class ViewHolder(itemView: View, var mListener: OnItemClickListener) :
        RecyclerView.ViewHolder(itemView), View.OnClickListener,
        View.OnLongClickListener {
        val nametv: TextView = itemView.findViewById(R.id.nametv)
        val nummertv: TextView = itemView.findViewById(R.id.nummertv)
        val itemViewtv: ImageView = itemView.findViewById(R.id.imageViewtv)

        init {
            itemView.setOnClickListener(this)
            itemView.setOnLongClickListener(this)
        }

        override fun onClick(v: View?) {
            if (mListener != null) {
                mListener.setOnClickListener(absoluteAdapterPosition)
            }
        }

        override fun onLongClick(v: View?): Boolean {
            if (mListener != null) {
                mListener.setOnLongClickListener(absoluteAdapterPosition)
            }
            return true

        }

        interface OnItemClickListener {
            fun setOnClickListener(position: Int)
            fun setOnLongClickListener(position: Int)
        }


    }
    fun setOnItemClickListener(mListener: ViewHolder.OnItemClickListener) {
        this.mListener = mListener
    }
}



