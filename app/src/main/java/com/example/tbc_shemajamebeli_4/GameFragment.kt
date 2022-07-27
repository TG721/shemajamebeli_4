package com.example.tbc_shemajamebeli_4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.GridLayoutManager
import com.example.tbc_shemajamebeli_4.databinding.FragmentGameBinding


class GameFragment : Fragment() {
    val args: GameFragmentArgs by navArgs()
    var adapter: ItemAdapter = ItemAdapter(items)
    private var binding: FragmentGameBinding? = null
    // TODO: Rename and change types of parameters

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGameBinding.inflate(inflater)
        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val demensionType = args.mode
        when(demensionType){
            "3x3" -> {
                binding?.gameRecyclerView?.adapter = adapter
                binding?.gameRecyclerView?.layoutManager = GridLayoutManager(requireContext(), 3)

            }
            "4x4" -> {
                binding?.gameRecyclerView?.adapter = adapter
                binding?.gameRecyclerView?.layoutManager = GridLayoutManager(requireContext(), 4)

            }
            "5x5" -> {
                binding?.gameRecyclerView?.adapter = adapter
                binding?.gameRecyclerView?.layoutManager = GridLayoutManager(requireContext(), 5)

            }

        }

    }

    companion object {
        @JvmStatic
        fun newInstance() = GameFragment()
    }


}