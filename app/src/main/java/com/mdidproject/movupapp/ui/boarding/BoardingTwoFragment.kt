package com.mdidproject.movupapp.ui.boarding

import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import com.mdidproject.movupapp.R
import com.mdidproject.movupapp.abstraction.base.BaseFragment
import com.mdidproject.movupapp.databinding.FragmentBoardingTwoBinding

class BoardingTwoFragment : BaseFragment<FragmentBoardingTwoBinding>() {
    override fun getLayoutResourceId(): Int = R.layout.fragment_boarding_two

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnObTwoNext.setOnClickListener {
            val action = BoardingTwoFragmentDirections.actionBoardingTwoFragmentToBoardingThreeFragment()
            it.findNavController().navigate(action)
        }
        super.onViewCreated(view, savedInstanceState)
    }
}