package com.neeraja.recipeapp.ui.view.fragments

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import com.neeraja.recipeapp.R
import coil.load

import androidx.navigation.NavController
import com.neeraja.recipeapp.data.model.api.MealDetail
import com.neeraja.recipeapp.databinding.FragmentCategoriesBinding
import com.neeraja.recipeapp.databinding.RecipeDetailFragmentBinding
import com.neeraja.recipeapp.ui.viewmodel.FilterByCategoryViewModel
import com.neeraja.recipeapp.ui.viewmodel.RecipeViewModel
import com.neeraja.recipeapp.utils.Status
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class RecipeDetailFragment : Fragment() {

    companion object {
        fun newInstance() = RecipeDetailFragment()
    }

    private lateinit var binding: RecipeDetailFragmentBinding
    private val viewModel: RecipeViewModel by viewModels()
    private var mealID: Int = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<RecipeDetailFragmentBinding>(
            inflater,
            R.layout.recipe_detail_fragment, container, false
        )
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (arguments != null) {
            mealID = RecipeDetailFragmentArgs.fromBundle(requireArguments()).mealId
        }
        viewModel.setMealId(mealID)
        setupObserver()
    }

    fun setupObserver() {
        viewModel._recipe.observe(this, Observer {
            when (it.status) {
                Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.detailView.visibility = View.GONE
                }
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { users ->
                        renderUI(users.meals.get(0))
                    }
                    binding.detailView.visibility = View.VISIBLE
                }
                Status.ERROR -> {
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(activity, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    fun renderUI(mealDetail: MealDetail) {
        binding.imageView.load(mealDetail.mealImg)
        binding.recipeTitleTv.text = mealDetail.mealName
        binding.recipeIngredientsTv.text = mealDetail.getIngredients()
        binding.recipeDescription.text = mealDetail.instructions
    }
}