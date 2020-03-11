package com.hellocompany.edsmovies.view.ui.stars

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider

import com.hellocompany.edsmovies.R
import com.hellocompany.edsmovies.databinding.StarsFragmentBinding

class StarsFragment : Fragment() {

    private lateinit var viewModel: StarsViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: StarsFragmentBinding =
            DataBindingUtil.inflate(inflater, R.layout.stars_fragment, container, false)
        viewModel = ViewModelProvider(this).get(StarsViewModel::class.java)
        binding.starsViewModel = viewModel
        binding.lifecycleOwner = this
        return binding.root

    }
}
