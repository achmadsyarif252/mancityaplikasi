package com.example.mancityaplikasi

object DataPlayer {
    private val playerNames = arrayListOf(
        "Kevin De Bruyne",
        "Phil Foden",
        "Erling Haaland",
        "Aymeric Laporte",
        "Riyad Mahrez",
        "Ederson Morares",
        "Stefan Ortega",
        "Rodri Hernández",
        "Bernardo Silva"
    )

    private val playerNumber = arrayListOf(
        "17", "47", "9", "14", "26", "31", "18", "16", "20",
    )

    private val playerPosition = arrayListOf(
        "Gelandang", "Gelandang", "Penyerang", "Bek", "Penyerang", "Penjaga Gawang",
        "Penjaga Gawang", "Gelandang", "Gelandang"
    )

    private val playersBiodata = arrayListOf(
        "Kevin De Bruyne adalah seorang pemain professional sepak bola asal Belgia yang bermain untuk Manchester City di Liga Utama Inggris dari posisi gelandang dan timnas Belgia yang juga dalam posisi gelandang",
        "Phil Foden adalah seorang pesepakbola profesional asal Inggris yang bermain sebagai gelandang untuk klub Liga Utama Inggris, Manchester City dan tim nasional Inggris. Terkenal karena visi, serta kreativitas dalam bermain yang menjadikannya sebagai salah satu pesepakbola muda potensial di dunia.",
        "Erling Braut Haaland adalah pemain sepak bola profesional Norwegia yang bermain sebagai striker untuk klub Inggris Manchester City dan tim nasional Norwegia. Haaland memulai kariernya di klub kota asalnya Bryne FK pada 2016, dan pindah ke Molde FK tahun berikutnya selama dua tahun.",
        "Aymeric Jean Louis Gérard Alphonse Laporte adalah seorang pemain sepak bola profesional yang bermain sebagai bek tengah untuk klub Liga Utama Inggris, Manchester City dan tim nasional Spanyol.",
        "Riyad Mahrez adalah seorang pemain sepak bola berkewarganegaraan Aljazair kelahiran Prancis yang bermain untuk klub Manchester City biasa bermain pada posisi gelandang sayap kanan. Mahrez memulai karier juniornya di klub AAS Sarcelles kemudian memulai karier seniornya di klub tersebut.",
        "Ederson Santana de Moraes adalah pemain sepak bola profesional berkebangsaan Brasil yang bermain untuk klub Manchester City dan timnas Brasil sebagai penjaga gawang.",
        "Stefan Ortega Moreno adalah pemain sepak bola profesional Jerman yang bermain sebagai penjaga gawang untuk klub Manchester City.",
        "Rodrigo Hernández Cascante, lebih dikenal sebagai Rodri atau Rodrigo, adalah seorang pemain sepak bola profesional asal Spanyol yang bermain sebagai gelandang bertahan untuk klub Liga Utama Inggris, Manchester City dan tim nasional Spanyol.",
        "Bernardo Mota Veiga de Carvalho e Silva adalah seorang pemain sepak bola profesional asal Portugal yang bermain untuk tim Inggris Manchester City dan tim nasional Portugal sebagai gelandang."

    )

    private val playerPhoto = intArrayOf(
        R.drawable.debruyn,
        R.drawable.foden,
        R.drawable.halland,
        R.drawable.laporte,
        R.drawable.mahrez,
        R.drawable.morares,
        R.drawable.ortega,
        R.drawable.rodri,
        R.drawable.silva,
    )
    val listData: ArrayList<Player>
        get() {
            val list = arrayListOf<Player>()
            for (position in playerNames.indices) {
                val player = Player()
                player.name = playerNames[position]
                player.number = playerNumber[position]
                player.position = playerPosition[position]
                player.biodata = playersBiodata[position]
                player.photo = playerPhoto[position]
                list.add(player)
            }
            return list
        }
}