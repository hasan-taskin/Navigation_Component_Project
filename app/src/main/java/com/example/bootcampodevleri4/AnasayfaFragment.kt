package com.example.bootcampodevleri4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampodevleri4.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding =  FragmentAnasayfaBinding.inflate(inflater, container, false)

        binding.buttonSayfaA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_to_sayfa_a)
        }
        binding.buttonSayfaX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.anasayfa_to_sayfa_x)
        }

        return binding.root
    }
}