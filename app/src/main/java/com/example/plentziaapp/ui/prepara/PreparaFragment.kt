package com.example.plentziaapp.ui.prepara

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.plentziaapp.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class PreparaFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_prepara, container, false)
    }

}