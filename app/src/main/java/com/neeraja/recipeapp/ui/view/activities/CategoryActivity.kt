package com.neeraja.recipeapp.ui.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.mindorks.framework.mvvm.utils.Status
import com.neeraja.recipeapp.R
import com.neeraja.recipeapp.data.model.Category
import com.neeraja.recipeapp.ui.adapter.CategoryAdapter
import com.neeraja.recipeapp.ui.viewmodel.CategoryViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.android.synthetic.main.activity_category.*

@AndroidEntryPoint
class CategoryActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)
    }

}