package com.example.egitim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.egitim.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)


        binding.buttonAgit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.aSayfaGecis)


        }

        binding.buttonXgit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.xSayfaGecis)
        }
        return binding.root
   }
}
