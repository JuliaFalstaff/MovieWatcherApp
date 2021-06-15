package com.example.moviewatcherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.FrameLayout
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toolbar
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.moviewatcherapp.databinding.MainActivityBinding
import com.example.moviewatcherapp.ui.main.FavouriteMovieFragment
//import com.example.moviewatcherapp.ui.main.DescriptionMovieFragment
//import com.example.moviewatcherapp.ui.main.FavouriteFragment.Companion.newInstance
import com.example.moviewatcherapp.ui.main.MainFragment
import com.example.moviewatcherapp.ui.main.RatedMovieFragment

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
        when(item.itemId) {
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




