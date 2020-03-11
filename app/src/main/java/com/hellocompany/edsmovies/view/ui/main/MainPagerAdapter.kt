package com.hellocompany.edsmovies.view.ui.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.hellocompany.edsmovies.view.ui.movies.MoviesFragment
import com.hellocompany.edsmovies.view.ui.stars.StarsFragment
import com.hellocompany.edsmovies.view.ui.tvs.TvsFragment

class MainPagerAdapter(fActivity: FragmentActivity): FragmentStateAdapter(fActivity) {

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> MoviesFragment()
            1 -> TvsFragment()
            else -> StarsFragment()
        }
    }
}