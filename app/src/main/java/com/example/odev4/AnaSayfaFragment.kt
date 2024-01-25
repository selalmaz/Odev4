package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        binding = FragmentAnaSayfaBinding.inflate(inflater, container, false)

        binding.buttonAGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Agecis)
        }
        binding.buttonXGecis.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.Xgecis)
        }







        return binding.root





    }

}