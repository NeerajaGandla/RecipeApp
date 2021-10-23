package com.neeraja.recipeapp.ui.view.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import com.neeraja.recipeapp.R
import com.neeraja.recipeapp.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import android.view.View

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding =
            DataBindingUtil.setContentView<ActivityHomeBinding>(this, R.layout.activity_home)
        binding.favoritesClickListener = View.OnClickListener {
            navigateToFavorites()
        }
    }

    private fun navigateToFavorites() {
        val navController = Navigation.findNavController(this, R.id.myNavHostFragment)
        val bundle = Bundle()
        bundle.putBoolean("isFavorites", true)
        navController.navigate(R.id.filterByTypeFragment, bundle);
    }

}