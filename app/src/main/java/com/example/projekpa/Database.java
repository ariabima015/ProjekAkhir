package com.example.projekpa;

public class Database {

    String[] nama = {"Astilbe", "Bellflower", "Black Eyed Susan", "Calendula",
            "California Poppy", "Carnation", "Common Daisy", "Coreopsis", "Daffodil",
            "Dandelion", "Iris", "Magnolia", "Orchid", "Rose", "Sunflower", "Tulip", "Water Lily"};

    String[] namaB = {"Astilbe", "Bellflower", "Black Eyed Susan", "Calendula",
            "California Poppy", "Carnation", "Common Daisy", "Coreopsis", "Daffodil",
            "Dandelion", "Iris", "Magnolia", "Anggrek", "Mawar", "Bunga Matahari", "Tulip", "Teratai"};

    String[] ilmiah = {"Astilbe spp.", "Campanula spp.", "Rudbeckia hirta",
            "Calendula officinalis", "Eschscholzia californica", "Dianthus caryophyllus",
            "Bellis perennis", "Coreopsis spp.", "Narcissus spp.", "Taraxacum officinale",
            "Neomarica longifolia", "Magnolia spp.", "Orchidaceae", "Rosa spp.", "Helianthus annuus",
            "Tulipa spp.", "Nymphaea spp."};

    String[] indonesia = {"Bunga Astilbe", "Bunga Lonceng", "Bunga Matahari", "Bunga Calendula",
            "Bunga Poppy California", "Bunga Anyelir", "Bunga Daisy", "Bunga Koresopsis", "Bunga Narcissus",
            "Bunga Sungsang atau Randa Tapak", "Bunga Iris", "Bunga Magnolia", "Bunga Anggrek", "Bunga Mawar",
            "Bunga Matahari", "Bunga Tulip", "Bunga Teratai"};

    String[] mediaTanam = {"Astilbe tumbuh subur di tanah yang lembab, kaya humus, dan memiliki drainase yang baik. Tanah yang asam hingga netral adalah yang paling cocok untuk Astilbe. Sebelum menanam, pastikan untuk memperkaya tanah dengan kompos atau pupuk organik untuk meningkatkan kualitas dan kesuburannya",
            "Bellflower tumbuh dengan baik di tanah yang subur, lembab, dan memiliki drainase yang baik. Tanah yang kaya humus dan memiliki pH netral hingga sedikit asam merupakan pilihan terbaik untuk Bellflower. Pastikan media tanam tidak tergenang air, tetapi tetap menjaga kelembaban yang seimbang. Bellflower tumbuh dengan baik di tanah yang subur dan memiliki drainase yang baik. Tanah yang kaya akan bahan organik, seperti humus atau kompos, akan membantu menyediakan nutrisi yang cukup bagi pertumbuhan bunga Bellflower. Pastikan juga bahwa tanah tidak tergenang air, karena kelebihan air dapat merusak akar tanaman.",
            "Bunga Black-Eyed Susan dapat tumbuh dengan baik di berbagai jenis tanah, tetapi lebih baik ditanam dalam tanah yang subur, lembab, dan bebas dari saluran air yang tergenang. Pastikan media tanam memiliki drainase yang baik untuk mencegah akumulasi kelebihan air.",
            "Calendula tumbuh dengan baik di tanah yang subur, ringan, dan memiliki drainase yang baik. Tanah yang kaya humus dan memiliki pH netral hingga sedikit asam adalah yang paling cocok untuk Calendula. Pastikan media tanam tetap lembab, tetapi tidak tergenang air.",
            "California Poppy tumbuh dengan baik di tanah yang berdrainase baik, kering, dan berpasir. Tanah berpasir, berkerikil, atau tanah berbatu adalah media tanam yang ideal untuk California Poppy. Pastikan tanah memiliki pH netral hingga sedikit asam.",
            "Anyelir tumbuh dengan baik di tanah yang subur, gembur, dan memiliki drainase yang baik. Tanah dengan pH netral hingga sedikit asam adalah yang paling cocok untuk Anyelir. Pastikan media tanam memiliki kandungan humus yang cukup untuk menyediakan nutrisi yang diperlukan.",
            "Daisy tumbuh dengan baik di tanah yang subur, gembur, dan memiliki drainase yang baik. Tanah dengan pH netral hingga sedikit asam adalah yang paling cocok untuk Daisy. Pastikan media tanam kaya akan bahan organik dan dapat mempertahankan kelembaban dengan baik.",
            "Coreopsis tumbuh dengan baik di tanah yang subur, gembur, dan memiliki drainase yang baik. Tanah dengan pH netral hingga sedikit asam adalah yang paling cocok untuk Coreopsis. Pastikan media tanam memiliki kandungan humus yang cukup untuk menyediakan nutrisi yang diperlukan.",
            "Daffodil tumbuh dengan baik di tanah yang subur, gembur, dan memiliki drainase yang baik. Tanah dengan pH netral hingga sedikit asam adalah yang paling cocok untuk Daffodil. Pastikan media tanam memiliki kandungan humus yang cukup untuk menyediakan nutrisi yang diperlukan.",
            "Dandelion dapat tumbuh di berbagai jenis tanah, termasuk tanah berpasir, tanah liat, dan tanah subur. Mereka tumbuh dengan baik di tanah yang memiliki drainase yang baik dan sedikit keasaman. Tanah yang gembur dan kaya humus akan mendukung pertumbuhan yang optimal.",
            "Bunga Iris tumbuh baik di tanah yang gembur, subur, dan memiliki drainase yang baik. Mereka lebih menyukai tanah yang kaya humus dan pH yang netral hingga sedikit asam. Penting untuk memastikan bahwa tanah tidak tergenang air agar akar tidak membusuk.",
            "Magnolia tumbuh dengan baik di tanah yang kaya, gembur, dan memiliki drainase yang baik. Mereka menyukai tanah yang subur dengan pH netral hingga sedikit asam. Pastikan tanah memiliki kemampuan menahan air tetapi tidak tergenang air, karena tanah yang terlalu basah dapat merusak akar Magnolia.",
            "Bunga anggrek dapat ditanam menggunakan media seperti serat kelapa, potongan kayu, atau campuran dari bahan organik seperti serbuk gergaji, arang sekam, dan serat serutan. Media ini harus memiliki kemampuan drainase yang baik untuk mencegah akumulasi kelebihan air.",
            "Mawar tumbuh dengan baik di tanah yang subur, gembur, dan memiliki drainase yang baik. Mereka menyukai tanah yang kaya humus dan pH netral hingga sedikit asam. Penting untuk memastikan tanah tidak tergenang air, karena kelembaban berlebih dapat menyebabkan akar membusuk.",
            "Bunga matahari tumbuh dengan baik di tanah yang gembur, subur, dan memiliki drainase yang baik. Mereka lebih suka tanah yang kaya akan bahan organik. Tanah dengan pH netral hingga sedikit asam adalah yang terbaik. Pastikan juga bahwa tanah tidak tergenang air, karena kelembaban berlebih dapat merusak akar.",
            "Tulip tumbuh dengan baik di tanah yang gembur, subur, dan memiliki drainase yang baik. Mereka lebih suka tanah yang kaya akan bahan organik dan memiliki pH yang netral hingga sedikit asam. Pastikan tanah tidak tergenang air, karena kelembaban berlebih dapat merusak umbi Tulip.",
            "Bunga Teratai tumbuh dengan baik di air atau lumpur yang dalam dan kaya akan nutrisi. Mereka membutuhkan air yang tenang atau perairan dengan aliran yang sangat lambat. Dalam budidaya di kebun, teratai dapat ditanam di kolam atau wadah besar yang diisi dengan air dan substrat khusus untuk tanaman air."
    };

    String[] penempatan = {"Astilbe lebih suka ditempatkan di area taman yang teduh atau setengah teduh. Penyinaran langsung yang berlebihan dapat merusak daun dan mengurangi kualitas bunga. Pilih tempat dengan sedikit cahaya matahari pagi atau matahari sore yang lembut",
            "Bellflower cenderung tumbuh dengan baik di area yang mendapatkan sinar matahari pagi hingga siang secara langsung. Namun, beberapa varietas Bellflower juga dapat tumbuh dengan baik di area setengah teduh. Pilih tempat yang memiliki cahaya matahari yang cukup, terutama selama pagi hari, untuk memastikan pertumbuhan dan penampilan bunga yang optimal. Bellflower biasanya tumbuh dengan baik di tempat yang mendapatkan sinar matahari penuh atau setengah teduh. Mereka juga dapat tumbuh di tempat yang teduh, tetapi mungkin memiliki pertumbuhan yang lebih rendah dan jumlah bunga yang kurang. Pastikan untuk memberikan cukup ruang antara tanaman Bellflower karena mereka cenderung tumbuh menjalar.",
            "Black-Eyed Susan lebih suka ditempatkan di area yang terkena sinar matahari penuh. Mereka membutuhkan setidaknya enam hingga delapan jam sinar matahari langsung setiap hari untuk tumbuh dengan optimal. Pastikan untuk menanamnya di area yang terbuka, di taman, atau di tempat tidur bunga yang tidak tertutup oleh pohon atau tanaman lain yang dapat menutupi sinar matahari.",
            "Calendula membutuhkan penempatan di area yang terkena sinar matahari penuh. Mereka tumbuh dengan baik di tempat terbuka yang terkena cahaya matahari langsung. Pastikan untuk memberikan ruang yang cukup antara tanaman untuk sirkulasi udara yang baik.",
            "California Poppy tumbuh paling baik di area yang terkena sinar matahari penuh. Mereka adalah tanaman yang tahan kekeringan dan dapat tumbuh dengan baik di tanah yang memiliki pencahayaan langsung yang cukup. Pilih tempat yang terbuka dan cerah untuk menanam California Poppy.",
            "Anyelir membutuhkan penempatan di area yang mendapatkan sinar matahari penuh atau setengah teduh. Mereka tumbuh dengan baik di tempat yang terlindung dari angin kencang. Pilih tempat yang memiliki pencahayaan yang cukup untuk memastikan pertumbuhan dan penampilan bunga yang optimal.",
            "Daisy membutuhkan penempatan di area yang mendapatkan sinar matahari penuh. Mereka tumbuh dengan baik di tempat terbuka yang mendapatkan sinar matahari langsung sepanjang hari. Pastikan juga memberikan ruang yang cukup antara tanaman Daisy untuk sirkulasi udara yang baik.",
            "Coreopsis membutuhkan penempatan di area yang mendapatkan sinar matahari penuh. Mereka adalah tanaman yang tahan kekeringan dan dapat tumbuh dengan baik di daerah yang terkena sinar matahari langsung sepanjang hari. Pilih tempat yang terbuka dan cerah untuk menanam Coreopsis.",
            "Daffodil membutuhkan penempatan di area yang mendapatkan sinar matahari penuh atau setengah teduh. Mereka tumbuh dengan baik di tempat yang terlindung dari angin kencang. Pilih tempat yang terbuka dan cerah untuk menanam Daffodil.",
            "Dandelion biasanya tumbuh subur di area yang mendapatkan sinar matahari penuh. Mereka juga dapat tumbuh di tempat dengan sedikit naungan. Dandelion dapat ditempatkan di taman, pekarangan, atau bahkan di pot.",
            "Iris biasanya ditempatkan di area yang mendapatkan sinar matahari penuh. Mereka dapat tumbuh dengan baik di taman, pekarangan, atau bahkan di pot. Pastikan tempat penanaman memiliki ruang yang cukup untuk pertumbuhan vertikal dan penyebaran rimpang Iris yang luas.",
            "Magnolia cenderung tumbuh subur di area yang mendapatkan sinar matahari penuh atau naungan sebagian. Beberapa varietas mungkin lebih toleran terhadap naungan dibandingkan yang lain. Pastikan untuk memberikan ruang yang cukup bagi tanaman untuk tumbuh dan berkembang dengan baik.",
            "Bunga anggrek biasanya ditempatkan di tempat yang mendapatkan cahaya yang cukup, tetapi tidak terpapar langsung sinar matahari. Anggrek tumbuh baik di tempat dengan suhu yang stabil dan tidak terlalu panas atau terlalu dingin.",
            "Mawar biasanya ditempatkan di area yang mendapatkan sinar matahari penuh. Mereka membutuhkan setidaknya enam jam sinar matahari langsung setiap hari untuk pertumbuhan dan pembungaan yang optimal. Pastikan juga ada ruang yang cukup untuk pertumbuhan vertikal dan penyebaran cabang Mawar.",
            "Matahari membutuhkan paparan sinar matahari penuh untuk pertumbuhan yang optimal. Penempatan bunga Matahari sebaiknya dilakukan di tempat yang terkena sinar matahari langsung sepanjang hari. Pilihlah area di kebun atau pekarangan yang tidak terhalang oleh pepohonan atau struktur lain yang dapat memblokir sinar matahari.",
            "Tulip biasanya ditempatkan di area yang mendapatkan sinar matahari penuh atau setengah hari. Mereka membutuhkan sinar matahari yang cukup untuk membantu pertumbuhan dan pembungaan yang optimal. Hindari penempatan bunga Tulip di tempat yang terlalu teduh atau terlalu panas, karena hal ini dapat mempengaruhi pertumbuhan mereka.",
            "Teratai membutuhkan penempatan di tempat yang terpapar sinar matahari penuh. Mereka memerlukan sinar matahari langsung selama sebagian besar hari untuk pertumbuhan dan pembungaan yang optimal. Hindari penempatan di tempat yang terlalu teduh, karena ini dapat menghambat pertumbuhan dan pembungaan bunga Teratai."
    };

    String[] perawatan = {"Penyiraman:\nPastikan tanah tetap lembab, tetapi tidak tergenang air. Siram Astilbe secara teratur, terutama selama musim panas yang kering. Jaga agar tanah tidak mengering sepenuhnya antara penyiraman.\n" +
                                "\nPemangkasan:\nSetelah bunga mati, potong tangkai bunga yang layu hingga ke dasar untuk mempromosikan pertumbuhan baru dan menjaga penampilan yang rapi.\n" +
                                "\nGulma:\n Bersihkan gulma di sekitar Astilbe secara teratur untuk menghindari persaingan yang tidak perlu dengan tanaman",
            "Penyiraman:\nSelama musim panas yang kering, pastikan untuk menyiram Bellflower secara teratur untuk menjaga kelembaban tanah yang seimbang. Hindari penyiraman berlebihan yang dapat menyebabkan genangan air dan memicu penyakit akar.\n" +
                    "\nPemangkasan:\nSetelah berbunga, potong tangkai bunga yang layu untuk mendorong pertumbuhan baru dan menjaga penampilan yang rapi. Pemangkasan juga dapat membantu mencegah penyebaran biji yang berlebihan.\n" +
                    "\nGulma:\nJaga kebersihan area tanam dari gulma yang dapat bersaing dengan Bellflower untuk mendapatkan nutrisi dan air.",
            "Penyiraman:\nSelama musim panas yang kering, pastikan untuk menyiram bunga secara teratur, terutama jika tanah terlihat kering. Jaga agar tanah tetap lembab, tetapi hindari penyiraman berlebihan yang dapat menyebabkan genangan air.\n" +
                    "\nPemangkasan:\nSetelah berbunga, potong tangkai bunga yang layu untuk merangsang pertumbuhan baru dan mencegah penyebaran biji yang berlebihan.\n" +
                    "\nGulma:\nJaga kebersihan area tanam dari gulma yang dapat bersaing dengan Black-Eyed Susan untuk mendapatkan nutrisi dan air",
            "Penyiraman:\nCalendula perlu disiram secara teratur, terutama saat musim panas yang kering. Pastikan tanah tetap lembab, tetapi hindari penyiraman berlebihan yang dapat menyebabkan genangan air.\n" +
                    "\nPemangkasan:\nPemangkasan tangkai bunga layu atau mati dapat merangsang pertumbuhan baru dan memperpanjang masa berbunga. Juga, memangkas bunga yang sudah layu membantu mencegah penyebaran biji berlebihan.\n" +
                    "\nGulma:\nPastikan area tanam bebas dari gulma yang dapat bersaing dengan Calendula untuk mendapatkan nutrisi dan air.",
            "Penyiraman:\nCalifornia Poppy adalah tanaman yang tahan kekeringan, sehingga tidak memerlukan penyiraman rutin. Siram hanya ketika tanah terlihat kering, dan pastikan tidak memberi terlalu banyak air agar tidak memicu pembusukan akar.\n" +
                    "\nPemangkasan:\nCalifornia Poppy tidak memerlukan pemangkasan rutin. Namun, jika ada bunga yang layu atau tangkai yang mati, potong dengan hati-hati untuk menjaga penampilan tanaman yang rapi.\n" +
                    "\nGulma:\nJaga area tanam bebas dari gulma agar California Poppy tidak bersaing dengan gulma dalam hal nutrisi dan air.",
            "Penyiraman:\nAnyelir membutuhkan penyiraman secara teratur untuk menjaga kelembaban tanah yang seimbang. Hindari penyiraman berlebihan yang dapat menyebabkan genangan air dan pembusukan akar. Pastikan tanah tidak terlalu kering atau terlalu basah.\n" +
                    "\nPemangkasan:\nPemangkasan bunga layu dan pemangkasan tangkai bunga yang telah mekar akan merangsang pertumbuhan baru dan memperpanjang masa berbunga. Pemangkasan juga membantu menjaga kepadatan dan bentuk tanaman.\n" +
                    "\nGulma:\nJaga area tanam bebas dari gulma agar Anyelir tidak bersaing dengan gulma dalam hal nutrisi dan air.",
            "Penyiraman:\nDaisy perlu disiram secara teratur untuk menjaga kelembaban tanah yang seimbang. Hindari penyiraman berlebihan yang dapat menyebabkan pembusukan akar. Pastikan tanah tetap lembab tetapi tidak tergenang air.\n" +
                    "\nPemangkasan:\nPemangkasan Daisy yang telah mekar dan pemangkasan tangkai bunga yang layu akan mendorong pertumbuhan baru dan memperpanjang masa berbunga. Pemangkasan juga membantu menjaga bentuk dan kepadatan tanaman.\n" +
                    "\nGulma:\nJaga area tanam Daisy bebas dari gulma agar tidak bersaing dengan gulma dalam hal nutrisi dan air.",
            "Penyiraman:\nCoreopsis adalah tanaman yang tahan kekeringan, sehingga tidak memerlukan penyiraman rutin. Siram hanya ketika tanah terlihat kering, dan pastikan tidak memberi terlalu banyak air agar tidak memicu pembusukan akar.\n" +
                    "\nPemangkasan:\nPemangkasan Coreopsis yang telah mekar dan pemangkasan tangkai bunga yang layu akan mendorong pertumbuhan baru dan memperpanjang masa berbunga. Pemangkasan juga membantu menjaga bentuk dan kepadatan tanaman.\n" +
                    "\nGulma:\nJaga area tanam Coreopsis bebas dari gulma agar tidak bersaing dengan gulma dalam hal nutrisi dan air.",
            "Penyiraman:\nDaffodil biasanya tidak memerlukan penyiraman rutin setelah tanam. Mereka lebih baik bertahan dalam kondisi tanah yang sedikit kering daripada terlalu basah. Siram hanya ketika tanah terlihat kering, terutama selama musim kemarau yang panjang.\n" +
                    "\nPemangkasan:\nSetelah Daffodil mekar dan daun mulai layu, biarkan daunnya tetap ada. Ini memungkinkan daun menyerap energi melalui fotosintesis yang akan disimpan dalam umbi untuk pertumbuhan tahun depan. Pemangkasan dilakukan setelah daun benar-benar mengering.\n" +
                    "\nGulma:\nJaga area tanam Daffodil bebas dari gulma agar tidak bersaing dengan gulma dalam hal nutrisi dan air.",
            "Penyiraman:\nDandelion adalah tanaman yang tahan kekeringan dan tidak memerlukan penyiraman rutin. Mereka mampu bertahan dalam kondisi tanah yang sedikit kering. Siram hanya jika tanah terlihat sangat kering atau selama periode kekeringan yang berkepanjangan.\n" +
                    "\nPemangkasan:\nDandelion tidak memerlukan pemangkasan khusus. Anda dapat memangkas bunga yang sudah layu untuk menjaga tampilan estetika dan mencegah penyebaran biji-biji dandelion.\n" +
                    "\nGulma:\nJaga area tanam dari pertumbuhan gulma yang berlebihan agar Dandelion dapat tumbuh dengan baik.",
            "Penyiraman:\nIris tidak memerlukan penyiraman yang berlebihan. Mereka lebih baik tumbuh dalam kondisi tanah yang sedikit kering daripada terlalu basah. Siram secara teratur saat tanah terlihat kering, terutama selama musim panas yang kering.\n" +
                    "\nPemangkasan:\nSetelah bunga Iris selesai mekar, potong tangkai bunga yang layu dekat dengan pangkal tanaman. Biarkan daun-daunnya tetap ada untuk menyimpan energi ke dalam rimpang untuk pertumbuhan berikutnya.\n" +
                    "\nPembagian:\nSetiap beberapa tahun, rimpang Iris dapat dibagi untuk mencegah kepadatan tanaman. Hal ini dapat dilakukan setelah tanaman mengalami dormansi di musim dingin.",
            "Penyiraman:\nMagnolia membutuhkan penyiraman yang cukup untuk menjaga tanah tetap lembab, terutama pada musim panas yang kering. Pastikan untuk menghindari genangan air yang berlebihan. Setelah tanaman dewasa, mereka lebih tahan terhadap kekeringan.\n" +
                    "\nPemangkasan:\nPemangkasan Magnolia biasanya dilakukan setelah berbunga pada musim panas atau musim gugur. Potong tangkai bunga layu atau cabang yang rusak. Hindari pemangkasan yang berlebihan karena ini dapat mempengaruhi pertumbuhan bunga di musim berikutnya.\n",
            "Penyiraman:\nAnggrek membutuhkan penyiraman yang cukup tetapi tidak berlebihan. Biarkan media tanam agak kering sebelum menyiram kembali.\n" +
                    "\nPemupukan:\nBerikan pupuk khusus anggrek dengan dosis yang disarankan pada interval yang tepat. Pupuk ini biasanya mengandung nutrisi yang diperlukan untuk pertumbuhan dan pembungaan yang baik.\n" +
                    "\nPemangkasan:\nJika ada bagian tanaman yang rusak atau mati, potonglah dengan hati-hati untuk menjaga kebersihan dan kesehatan tanaman.",
            "Penyiraman:\nMawar membutuhkan penyiraman yang cukup untuk menjaga tanah tetap lembab. Siram secara merata dan hindari genangan air. Penting untuk menghindari penyiraman daun pada malam hari karena ini dapat menyebabkan perkembangan penyakit jamur.\n" +
                    "\nPemangkasan:\nPemangkasan Mawar dilakukan pada awal musim semi sebelum pertumbuhan baru dimulai. Potong tangkai bunga yang layu atau rusak serta cabang yang saling bersilangan untuk mempromosikan pertumbuhan yang sehat.\n",
            "Penyiraman:\nMatahari membutuhkan penyiraman yang cukup, terutama selama musim panas yang kering. Siram secara merata dan pastikan tanah tetap lembab, tetapi hindari genangan air. Setelah tanaman dewasa, mereka lebih toleran terhadap kekeringan.\n" +
                    "\nPenyangga:\nBunga Matahari yang tinggi membutuhkan penyangga untuk menjaga stabilitas mereka. Gunakan tali atau tongkat penyangga yang kuat dan pasang di sekitar tanaman saat mereka mulai tumbuh tinggi.\n" +
                    "\nPemangkasan:\nPemangkasan pada bunga Matahari biasanya dilakukan setelah berbunga. Potong tangkai bunga yang layu atau rusak untuk menjaga tampilan estetika tanaman.",
            "Penyiraman:\nTulip membutuhkan penyiraman yang cukup saat tanah kering. Siram secara merata dan hindari genangan air yang berlebihan. Setelah bunga Tulip mekar dan daunnya mulai menguning, perlahan-lahan kurangi penyiraman dan biarkan umbi mengering secara alami.\n" +
                    "\nPemangkasan:\nSetelah bunga Tulip layu dan daunnya menguning, biarkan daun berenergi dan mati secara alami. Jangan memotong daun secara prematur karena ini dapat mengurangi kemampuan umbi untuk menyimpan energi untuk pertumbuhan di musim berikutnya.\n",
            "Penyiraman:\nTeratai membutuhkan air yang cukup untuk tumbuh dan berkembang. Pastikan media tanam atau air tempat bunga Teratai ditanam selalu terendam, tetapi hindari genangan air yang terlalu lama. Jaga agar air tetap bersih dan terhindar dari gangguan alga yang berlebihan.\n" +
                    "\nPemupukan:\nBunga Teratai membutuhkan pupuk yang kaya akan nutrisi. Pupuk organik atau pupuk khusus untuk tanaman air dapat diberikan secara berkala sesuai dengan petunjuk pemupukan yang disarankan. Pemberian pupuk dapat membantu meningkatkan pertumbuhan dan keindahan bunga Teratai.\n" +
                    "\nPemangkasan:\nPemangkasan pada bunga Teratai umumnya tidak diperlukan. Namun, jika ada daun atau bunga yang mati, Anda dapat memotongnya untuk menjaga penampilan estetika tanaman."
    };



}
