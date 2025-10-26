package com.example.plentziaapp.ui.menu

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.plentziaapp.R
import com.example.plentziaapp.databinding.FragmentMenuBinding
import com.example.plentziaapp.domain.model.MenuInfo
import com.example.plentziaapp.ui.home.MainActivity
import com.example.plentziaapp.ui.menu.adapter.MenuAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint

class MenuFragment : Fragment() {

    //VIEW MODEL
    private val menuViewModel by viewModels< MenuViewModel>()

    //BINDING
    private var _binding: FragmentMenuBinding? = null
    private val binding get() = _binding!!


    //RECYCLED VIEW
    private lateinit var menuAdapter: MenuAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_menu, container, false)
        _binding = FragmentMenuBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRv()
        initUI()
    }

    private fun initUI() {
        initUIState()
    }

    private fun initUIState() {
        //Aqui es donde me engancho al MenuViewModel
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.STARTED){
                menuViewModel.menu.collect{
                    menuAdapter.updateList(it)
                }
            }
        }
    }

    private fun initRv() {
        //como ya esta inicializada la lista en la definicion del adapter no hace falta pasarle nada
        val menuList:List<MenuInfo> = emptyList()
        //menuAdapter = MenuAdapter(menuList)
        //ahora pasandole la funcion lambda
        menuAdapter = MenuAdapter(menuList,{ onItemSelected(it) })

        //horoscopeAdapter=HoroscopeAdpater(onItemSelected = {Toast.makeText(context,getString(it.name),Toast.LENGTH_SHORT).show()})
        binding.rvMenu.layoutManager = GridLayoutManager(context, 2)
        binding.rvMenu.adapter=menuAdapter
    }

    private fun onItemSelected(menu: MenuInfo){

        //Log.i("ROI", "$menu")
        (requireActivity() as MainActivity).showFragment(menu.fragment)
    }

}