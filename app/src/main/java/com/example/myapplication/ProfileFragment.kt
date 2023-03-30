package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.FragmentProfileBinding


class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentProfileBinding.inflate(inflater, container, false)
        parentFragmentManager.beginTransaction()
            .add(R.id.layout, MyOrderFragment())
            .commit()

        binding.button.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.layout, MyCabinetFragment())
                .commit()
        }

        binding.button2.setOnClickListener{
            parentFragmentManager.beginTransaction()
                .replace(R.id.layout, MyOrderFragment())
                .commit()
        }

        return binding.root


    }


}