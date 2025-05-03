package com.example.bootcampodevleri4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.bootcampodevleri4.databinding.FragmentAnasayfaBinding
import com.example.bootcampodevleri4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {

    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater, container, false)

        binding.buttonSayfaY1.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.sayfa_b_to_sayfa_y)
        }
        return binding.root
    }
}