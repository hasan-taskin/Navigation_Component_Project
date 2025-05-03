package com.example.bootcampodevleri4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import com.example.bootcampodevleri4.databinding.FragmentSayfaXBinding
import com.example.bootcampodevleri4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {

    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater, container, false)
        
        val geriTusu = object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                Navigation.findNavController(binding.root).navigate(R.id.sayfa_y_to_anasayfa)
            }
            
        }
        requireActivity().onBackPressedDispatcher.addCallback(viewLifecycleOwner, geriTusu)

        return binding.root
    }
}