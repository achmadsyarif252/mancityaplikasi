package com.example.mancityaplikasi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mancityaplikasi.databinding.ActivityDetailPlayerBinding

class DetailPlayer : AppCompatActivity() {
    private lateinit var binding: ActivityDetailPlayerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityDetailPlayerBinding.inflate(layoutInflater)
        val root = binding.root
        super.onCreate(savedInstanceState)
        setContentView(root)

        val dataPlayer = intent.getParcelableExtra<Player>(PLAYER_DATA) as Player
        binding.tvDetailName.text = dataPlayer.name
        binding.nomor.text = dataPlayer.number
        binding.tvDetailBio.text = dataPlayer.biodata
        binding.posisi.text = dataPlayer.position
        binding.photo.setImageResource(dataPlayer.photo)

    }
}