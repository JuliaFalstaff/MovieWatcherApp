package com.example.moviewatcherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.moviewatcherapp.databinding.MainActivityBinding
import com.example.moviewatcherapp.ui.main.main.FavouriteMovieFragment
import com.example.moviewatcherapp.ui.main.main.DetailsFragment
import com.example.moviewatcherapp.ui.main.main.MainFragment
import com.example.moviewatcherapp.ui.main.main.RatedMovieFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: MainActivityBinding

    lateinit var title: TextView
    lateinit var originalTitle: TextView
    lateinit var poster: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
        initView()
    }

    private fun initView() {
        initToolbar()
    }

    private fun initToolbar() {
        val toolbar: androidx.appcompat.widget.Toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_favourite -> {
                addFragment(FavouriteMovieFragment())
                return true
            }
            R.id.action_rated -> {
                addFragment(RatedMovieFragment())
                return true
            }
            R.id.action_main -> {
                addFragment(MainFragment())
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun addFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.container, fragment)
            .addToBackStack(null)
            .commit()
    }
}




