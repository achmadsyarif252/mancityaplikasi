package com.example.mancityaplikasi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mancityaplikasi.databinding.ActivityMainBinding

const val PLAYER_DATA = "com.mancity.app"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var listPlayer: ArrayList<Player> = arrayListOf()

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(mode: Int) {
        when (mode) {
            R.id.card -> showCardPlayer()
            R.id.grid -> showGrid()
            R.id.profile -> {
                val intent = Intent(this, InfoDev::class.java)
                startActivity(intent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        setContentView(view)

        listPlayer.addAll(DataPlayer.listData)
        supportActionBar?.title = "The Citizen"
        showCardPlayer()
    }

    private fun showCardPlayer() {
        binding.rvCityPlayer.layoutManager = LinearLayoutManager(this)
        val playerAdapter = ListPlayerAdapter(listPlayer)
        binding.rvCityPlayer.adapter = playerAdapter

        playerAdapter.setOnItemClickCallback(object : ListPlayerAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Player) {
                toDetailPlayer(data)
            }
        })
    }

    private fun toDetailPlayer(player: Player) {
        val intent = Intent(this, DetailPlayer::class.java)
        intent.putExtra(PLAYER_DATA, player)
        startActivity(intent)
    }

    private fun showGrid() {
        binding.rvCityPlayer.layoutManager = GridLayoutManager(this, 2)
        val gridAdapter = GridPlayerAdapter(listPlayer)
        binding.rvCityPlayer.adapter = gridAdapter
    }
}