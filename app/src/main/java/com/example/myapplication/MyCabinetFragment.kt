package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentMyCabinetBinding


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class MyCabinetFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentMyCabinetBinding.inflate(inflater, container, false)
        val name = binding.name.text
        val password = binding.password.text

        binding.button3.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.layout, MyOrderFragment.newInstance(name.toString(), password.toString()))
                .commit()
        }



        return binding.root
    }

    companion object {
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            MyCabinetFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}