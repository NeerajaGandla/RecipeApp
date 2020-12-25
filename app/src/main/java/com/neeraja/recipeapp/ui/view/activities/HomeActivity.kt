package com.neeraja.recipeapp.ui.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.neeraja.recipeapp.R
import com.neeraja.recipeapp.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    private lateinit var bookmarksIv: ImageView
    private lateinit var wishlistIv: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)
        bookmarksIv = binding.ivBookmarks
        wishlistIv = binding.ivWishlist
    }

}