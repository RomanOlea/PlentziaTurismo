package com.example.plentziaapp.ui.menu.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.plentziaapp.databinding.ItemMenuBinding
import com.example.plentziaapp.domain.model.MenuInfo

//class MenuViewHolder (view: View): RecyclerView.ViewHolder(view) {
class MenuViewHolder (view: View): RecyclerView.ViewHolder(view) {

    //BINDING
    private val binding = ItemMenuBinding.bind(view)

    fun render(menu: MenuInfo, onItemSelected:(MenuInfo) -> Unit
    ){
        binding.ivMenu.setImageResource(menu.icon)
        binding.tvTitleMenu.setText(menu.title)
        binding.tvDescriptionMenu.setText(menu.description)
        binding.cvItemMenu.setOnClickListener {
            onItemSelected(menu)
        }



    }
}