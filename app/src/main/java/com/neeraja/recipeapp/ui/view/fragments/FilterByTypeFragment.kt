package com.neeraja.recipeapp.ui.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.neeraja.recipeapp.utils.Status
import com.neeraja.recipeapp.data.model.db.Meal
import com.neeraja.recipeapp.databinding.FragmentCategoriesBinding
import com.neeraja.recipeapp.ui.adapter.MealAdapter
import com.neeraja.recipeapp.ui.viewmodel.FilterByCategoryViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import com.neeraja.recipeapp.R

import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.neeraja.recipeapp.data.AppDataManager
import com.neeraja.recipeapp.ui.viewmodel.FilterByTypeViewModelFactory
import com.neeraja.recipeapp.utils.GridSpacingItemDecoration
import com.neeraja.recipeapp.utils.NetworkHelper


@AndroidEntryPoint
class FilterByTypeFragment : Fragment() {
    @Inject
    lateinit var dataManager: AppDataManager
    @Inject
    lateinit var networkHelper: NetworkHelper
    private lateinit var adapter: MealAdapter
    private lateinit var binding: FragmentCategoriesBinding
    private lateinit var category: String
    lateinit private var filterByCategoryViewModel: FilterByCategoryViewModel
//    @Inject lateinit var viewModelFactory: FilterByCategoryViewModel.Factory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<FragmentCategoriesBinding>(
            inflater,
            R.layout.fragment_categories, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        if (arguments != null) {
            category = arguments?.get("category") as String
            val factory = FilterByTypeViewModelFactory(dataManager, networkHelper, category)
            filterByCategoryViewModel = ViewModelProvider(
                requireActivity(),
                factory
            ).get(FilterByCategoryViewModel::class.java)
        }
        setupUI()
        setupObserver()
    }

    private fun setupUI() {
        binding.recyclerView.layoutManager = GridLayoutManager(activity, 2)
        adapter = MealAdapter(arrayListOf())
        binding.recyclerView.addItemDecoration(
            GridSpacingItemDecoration(true, 2, 10, true)
        )
        binding.recyclerView.adapter = adapter
    }

    private fun setupObserver() {
        filterByCategoryViewModel.meals.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    binding.progressBar.visibility = View.GONE
                    it.data?.let { users ->
                        renderList(users.meals)
                    }
                    binding.recyclerView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    binding.progressBar.visibility = View.VISIBLE
                    binding.recyclerView.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    binding.progressBar.visibility = View.GONE
                    Toast.makeText(activity, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun renderList(meals: List<Meal>) {
        adapter.addData(meals)
        adapter.notifyDataSetChanged()
    }
}