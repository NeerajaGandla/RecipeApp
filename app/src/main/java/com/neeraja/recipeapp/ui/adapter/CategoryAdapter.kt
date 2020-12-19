package com.neeraja.recipeapp.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.neeraja.recipeapp.R
import com.neeraja.recipeapp.data.model.db.Category
import kotlinx.android.synthetic.main.category_item_layout.view.*

class CategoryAdapter(
    private val users: ArrayList<Category>
) : RecyclerView.Adapter<CategoryAdapter.DataViewHolder>() {

    class DataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(category: Category) {
            itemView.textViewTitle.text = category.categoryName
            itemView.textViewDescription.text = category.description
            itemView.imageViewThumbNail.load(category.thumbnail)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        DataViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.category_item_layout, parent,
                false
            )
        )

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<Category>) {
        users.addAll(list)
    }
}