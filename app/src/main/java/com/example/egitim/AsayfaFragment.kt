package com.example.egitim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.egitim.databinding.FragmentAsayfaBinding


class AsayfaFragment : Fragment() {

    private lateinit var binding: FragmentAsayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAsayfaBinding.inflate(inflater,container,false)


        binding.buttonBgit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.bSayfaGecis)
        }
        return binding.root
    }

}