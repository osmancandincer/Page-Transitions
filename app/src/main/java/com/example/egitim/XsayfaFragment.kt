package com.example.egitim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.egitim.databinding.FragmentXsayfaBinding


class XsayfaFragment : Fragment() {

    private lateinit var binding: FragmentXsayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentXsayfaBinding.inflate(inflater,container,false)


        binding.buttonYgitt.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.ySayfaGecis2)
        }
        return binding.root
    }

}