package com.example.bottomnavigation1.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AlertDialog
import com.bumptech.glide.Glide
import com.example.bottomnavigation1.R
import com.example.bottomnavigation1.databinding.FragmentProfileBinding
import com.example.bottomnavigation1.ekt.loadImage

class ProfileFragment : Fragment() {
    private lateinit var binding1: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding1=FragmentProfileBinding.inflate(inflater,container,false)
        return binding1.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding1.ivProfile.loadImage("https://flomaster.club/uploads/posts/2022-07/thumbs/1658266380_54-flomaster-club-p-malenkie-kvadratnie-risunki-krasivo-63.jpg")
        binding1.ivProfile.setOnClickListener{
            val alertDialog = AlertDialog.Builder(requireContext())
            alertDialog.setTitle("Change image?")
            alertDialog.setPositiveButton("Yes"){dialog,_ ->
                dialog.dismiss()
            }
            alertDialog.setNegativeButton("No"){dialog,_ ->
                dialog.dismiss()
            }
            alertDialog.create().show()
        }

    }
}