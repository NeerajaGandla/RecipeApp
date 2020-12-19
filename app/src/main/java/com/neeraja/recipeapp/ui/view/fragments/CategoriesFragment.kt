package com.neeraja.recipeapp.ui.view.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.mindorks.framework.mvvm.utils.Status
import com.neeraja.recipeapp.R
import com.neeraja.recipeapp.data.model.Category
import com.neeraja.recipeapp.ui.adapter.CategoryAdapter
import com.neeraja.recipeapp.ui.viewmodel.CategoryViewModel
import kotlinx.android.synthetic.main.fragment_categories.*

class CategoriesFragment : Fragment() {
    private val categoryViewModel: CategoryViewModel by viewModels()
    private lateinit var adapter: CategoryAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_categories, container, false)
        setupUI()
        setupObserver()
        return view
    }

    private fun setupUI() {
        recyclerView.layoutManager = LinearLayoutManager(activity)
        adapter = CategoryAdapter(arrayListOf())
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                recyclerView.context,
                (recyclerView.layoutManager as LinearLayoutManager).orientation
            )
        )
        recyclerView.adapter = adapter
    }

    private fun setupObserver() {
        categoryViewModel.categories.observe(viewLifecycleOwner, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    it.data?.let { users -> renderList(users.categories) }
                    recyclerView.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                    recyclerView.visibility = View.GONE
                }
                Status.ERROR -> {
                    //Handle Error
                    progressBar.visibility = View.GONE
                    Toast.makeText(activity, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
    }

    private fun renderList(users: List<Category>) {
        adapter.addData(users)
        adapter.notifyDataSetChanged()
    }
}