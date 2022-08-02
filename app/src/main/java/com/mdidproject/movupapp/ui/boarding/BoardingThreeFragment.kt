package com.mdidproject.movupapp.ui.boarding

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.movupapp.R
import com.mdidproject.movupapp.abstraction.base.BaseFragment
import com.mdidproject.movupapp.databinding.FragmentBoardingThreeBinding

class BoardingThreeFragment : BaseFragment<FragmentBoardingThreeBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_three

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObThreeNext.setOnClickListener {
            val action = BoardingThreeFragmentDirections.actionBoardingThreeFragmentToBoardingFourFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}