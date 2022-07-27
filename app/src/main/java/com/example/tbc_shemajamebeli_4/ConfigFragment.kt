package com.example.tbc_shemajamebeli_4

import android.graphics.Bitmap
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.tbc_shemajamebeli_4.databinding.FragmentConfigBinding
import com.example.tbc_shemajamebeli_4.databinding.FragmentGameBinding


class ConfigFragment : Fragment() {
    private var binding: FragmentConfigBinding? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentConfigBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding?.type3x3?.setOnClickListener{
            val action = ConfigFragmentDirections.navigateToGameFragment("3x3")
            Navigation.findNavController(view).navigate(action)
        }
        binding?.type4x4?.setOnClickListener{
            val action = ConfigFragmentDirections.navigateToGameFragment("4x4")
            Navigation.findNavController(view).navigate(action)
        }
        binding?.type5x5?.setOnClickListener{
            val action = ConfigFragmentDirections.navigateToGameFragment("5x5")
            Navigation.findNavController(view).navigate(action)
        }
    }

    companion object {
        @JvmStatic
        fun newInstance() = ConfigFragment()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}