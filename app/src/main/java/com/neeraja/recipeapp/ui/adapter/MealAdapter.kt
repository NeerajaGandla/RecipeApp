package com.neeraja.recipeapp.ui.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.neeraja.recipeapp.data.model.db.Category
import com.neeraja.recipeapp.data.model.db.Meal
import com.neeraja.recipeapp.databinding.CategoryItemLayoutBinding
import com.neeraja.recipeapp.databinding.MealItemLayoutBinding
import com.neeraja.recipeapp.ui.clicklisteners.MealClickListener
import com.neeraja.recipeapp.ui.fragments.CategoriesFragmentDirections
import com.neeraja.recipeapp.ui.fragments.FilterByTypeFragmentDirections

class MealAdapter(
    private val meals: ArrayList<Meal>,
    private val favoriteClickListener: FavoriteClickListener
) : RecyclerView.Adapter<MealAdapter.DataViewHolder>() {

    interface FavoriteClickListener {
        fun onFavoriteClick(meal: Meal)
    }

    inner class DataViewHolder(val binding: MealItemLayoutBinding)
        : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.clickListener = View.OnClickListener { view ->
                navigateToMeal(binding.meal?.id, view)
            }
            binding.favoriteClickListener = favoriteClickListener
        }

        private fun navigateToMeal(mealId: Int?, view: View) {
            mealId?.let {
                var action = FilterByTypeFragmentDirections.actionFilterByTypeFragmentToRecipeDetailFragment(mealId = mealId)
                view.findNavController().navigate(action)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MealItemLayoutBinding.inflate(inflater)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = meals.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        holder.binding.meal = meals[position]
        holder.binding.executePendingBindings();
    }

    fun addData(list: List<Meal>) {
        meals.addAll(list)
    }

    fun clearData() {
        meals.clear()
    }
}