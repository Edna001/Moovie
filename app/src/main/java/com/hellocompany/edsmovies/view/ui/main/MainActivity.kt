package com.hellocompany.edsmovies.view.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.hellocompany.edsmovies.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initUI()
    }

    private fun initUI() {
        with(main_pager) {
            adapter =
                MainPagerAdapter(this@MainActivity)
            registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback(){
                override fun onPageSelected(position: Int) {
                    super.onPageSelected(position)
                    bottom_nav.menu.getItem(position).isChecked = true
                }
            })
            bottom_nav.setOnNavigationItemSelectedListener{
                currentItem = when(it.itemId) {
                    R.id.movies_item -> 0
                    R.id.tvs_item -> 1
                    else -> 2
                }
                true
            }
        }
    }
}