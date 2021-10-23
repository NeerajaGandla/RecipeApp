package com.neeraja.recipeapp.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding
import com.neeraja.recipeapp.ui.view.fragments.CategoriesFragmentDirections

class CategoryAdapter(
    private val users: ArrayList<Category>
) : RecyclerView.Adapter<CategoryAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: CategoryItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { view ->
                navigateToCategory(binding.categoryId, view)
            }
        }

        private fun navigateToCategory(categoryId: String?, view: View) {
            var action =
                CategoriesFragmentDirections.actionCategoriesFragmentToFilterByTypeFragment(category = categoryId)
            view.findNavController().navigate(action)
        }

        fun bind(category: Category) {
            with(binding) {
                categoryId = category.categoryName
                textViewTitle.text = category.categoryName
                textViewDescription.text = category.description
                imageViewThumbNail.load(category.thumbnail)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CategoryItemLayoutBinding.inflate(inflater)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = users.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(users[position])

    fun addData(list: List<Category>) {
        users.addAll(list)
    }

}