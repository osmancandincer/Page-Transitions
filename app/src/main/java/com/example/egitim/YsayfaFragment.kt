package com.example.egitim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.egitim.databinding.FragmentYsayfaBinding


class YsayfaFragment : Fragment() {

    private lateinit var binding: FragmentYsayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentYsayfaBinding.inflate(inflater,container,false)
        return binding.root
    }

}