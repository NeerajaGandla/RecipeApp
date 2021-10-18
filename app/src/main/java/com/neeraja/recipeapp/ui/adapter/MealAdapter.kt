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
import com.neeraja.recipeapp.ui.view.fragments.CategoriesFragmentDirections

class MealAdapter(
    private val meals: ArrayList<Meal>
) : RecyclerView.Adapter<MealAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: MealItemLayoutBinding)
        : RecyclerView.ViewHolder(binding.root) {
        init {
            binding.setClickListener { view ->
                navigateToMeal(binding.mealId, view)
            }
        }

        private fun navigateToMeal(mealId: String?, view: View) {
//            var action = CategoriesFragmentDirections.actionCategoriesFragmentToFilterByTypeFragment(categoryId = categoryId)
//            view.findNavController().navigate(action)
        }

        fun bind(meal: Meal) {
            with(binding) {
                mealId = meal.id.toString()
                textViewTitle.text = meal.mealName
                textViewDescription.text = meal.category
                imageViewThumbNail.load(meal.mealImageUrl)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = MealItemLayoutBinding.inflate(inflater)
        return DataViewHolder(binding)
    }

    override fun getItemCount(): Int = meals.size

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) =
        holder.bind(meals[position])

    fun addData(list: List<Meal>) {
        meals.addAll(list)
    }

}