package com.example.bootcampodevleri4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import com.example.bootcampodevleri4.databinding.FragmentAnasayfaBinding
import com.example.bootcampodevleri4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {

    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater, container, false)

        binding.buttonSayfaB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_a_to_sayfa_b)
        }
        return binding.root
    }
}