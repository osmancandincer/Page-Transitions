package com.example.egitim

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.egitim.databinding.FragmentBsayfaBinding


class BsayfaFragment : Fragment() {

    private lateinit var binding: FragmentBsayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentBsayfaBinding.inflate(inflater, container, false)


        binding.buttonYgit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.ySayfaGecis)
        }
        return binding.root
    }

}