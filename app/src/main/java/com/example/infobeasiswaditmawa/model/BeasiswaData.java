package com.example.infobeasiswaditmawa.model;

import java.util.ArrayList;

public class BeasiswaData {
    private static String[][] data = new String [][]{
            {"Djarum Beasiswa Plus",
                    "Djarum Foundation" ,
                    "Beasiswa prestasi bagi mahasiswa dari berbagai jurusan yang tengah menempuh program studi Strata 1/ Diploma 4 di perguruan tinggi negeri maupun swasta. \n \n" +
                    "Beasiswa dalam negeri ini diberikan bagi mahasiswa berprestasi, dimana fasilitas yang diberikan bukan hanya berbentuk uang saja. Dengan menjadi penerima beasiswa Djarum (Beswan Djarum), kalian bisa mendapatkan ilmu dari pelatihan softskills.",
                    "http://www.scholarsofficial.com/wp-content/uploads/2018/04/Djarum-2-600x380.jpg"},

            {"Beasiswa Juara Kompas Batch III - Generasi Hebat",
                    "Harian Kompas w/ Avaian Brands \n\n"+"PT Kompas Media Nusantara - Kompas Gramedia",
                    "Program Beasiswa Juara Batch III adalah program yang berinisiatif untuk membangkitkan motivasi mahasiswa agar menjadi generasi muda bangsa berkualitas, berprestasi, dan berguna bagi bangsa. Oleh karena itu Program Beasiswa Juara Batch III hadir dengan rangkaian program. \n \n" +
                            "Selain memberikan dukungan dalam bentuk dana, program ini juga memberikan pengembangan potensi diri melalui pelatihan ketrampilan agar semakin memperkaya softskill maupun hardskill guna mempersiapkan mereka menjadi generasi hebat",
                    "https://i1.wp.com/www.scholarsofficial.com/wp-content/uploads/2018/05/beasiswa-juara-1.jpg?fit=630%2C380"},

            {"Tokopedia DevCamp 2019",
                    "Tokopedia",
                    "Tokopedia DevCamp merupakan program pelatihan IT dan Hackathon intensif selama 6 hari untuk mahasiswa tingkat akhir atau mahasiswa pascasarjanan dari jurusan yang berkaitan dengan teknologi dan sekaligus mengikuti hackathon memperebutkan hadiah total Rp 69 juta. \n \n" +
                            "Selain mengikuti pelatihan intensif, para peserta juga akan mendapatkan bimbingan langsung dari para pakar dibidangnya, kesempatan magang dan berpeluang diangkat menjadi karyawan di Tokopedia. Seluruh biaya transportasi dan akomodasi selama mengikuti kegiatan ini ditanggung oleh Tokopedia.",
                    "https://ecs7.tokopedia.net/img/microsite-brand-resource/mascot-toped-new.png"},

            {"Beasiswa PPA dan BBP PPA 2019/2020",
                    "Kementerian Ristekdikti - Untuk D3, DIV, dan S1 ",
                    "Beasiswa Peningkatan Prestasi Akademik (Beasiswa-PPA) dan Bantuan Biaya Pendidikan Peningkatan Prestasi Akademik (BPP-PPA). Tahun akademik 2019 - 2020, Kementerian Ristekdikti menyiapkan beasiswa tersebut untuk ribuan mahasiswa di Tanah Air. Baik PTN maupun PTS. Pada periode sebelumnya kuota yang disediakan sebanyak 130 ribu beasiswa.\n \n"+
                            "Beasiswa PPA 2019 dan BPP PPA 2019 ditujukan bagi mahasiswa aktif yang berada di jenjang S1/DIV atau mahasiswa D3 \n \n" +
                            "Penerima beasiswa dan bantuan biaya pendidikan PPA akan memperoleh dana sebesar Rp 400 ribu/bulan, Beasiswa tersebut diberikan untuk pertama kalinya di periode tahun angggaran berjalan sekurangnya selama 6 bulan.",
                    "https://4.bp.blogspot.com/-haKOla3anX0/XEAj5XIP0kI/AAAAAAAAEew/4M1lxm3fWN4ECa6QacWaEd58ebltu4b8ACLcBGAs/s640/pendaftaran-beasiswa-ppa-bpp-ppa.jpg"},

            {"Digital Talent Scholarship 2019",
                    "Beasiswa Pemerintah - Kominfo Teknologi",
                    "Program Digital Talent Scholarship Tahun 2019 (DTS 2019) merupakan program pengembangan sumber daya manusia (SDM) yang dilaksanakan Kementerian Komunikasi dan Informatika (Kemenkominfo) sebagai bagian dari program pembangunan prioritas nasional. Pelatihan intensif gratis ini bertujuan meningkatkan daya saing sumberdaya manusia Indonesia dalam bidang teknologi informatika dan komunikasi menuju revolusi industri 4.0 \n \n"+
                            "Peserta program akan dilatih secara intensif untuk menguasai hardskill dan softskill sesuai dengan peminatan di bidang teknis Artifical Intelligence, Big Data, Cloud Computing, Cyber Security, Internet of Things, dan Machine Learning serta beberapa tema pelatihan lainnya. \n \n" +
                            "Beasiswa ini dikelola oleh Badan Penelitian dan Pengembangan SDM Kementerian Kominfo berkerja sama dengan 31 perguruan tinggi terkemuka di Indonesia,  23 Politeknik  dan 4 perusahaan teknologi global antara lain AWS, Cisco, Google dan Microsoft.",
                    "https://kabarkota.com/wp-content/uploads/2019/02/20190216_103735.png"},

            {"Beasiswa Dicoding Academy untuk Dosen dan Mahasiswa",
                    "Dicoding.com bersama Google Indonesia - Beasiswa Peningkatan Developer Indonesia",
                    "Dicoding didirikan pada Januari 2015 oleh Narenda Wicaksono, Kevin Kurniawan, Adib Toriq, dan Akbar Hidayat sebagai tempat untuk menjembatani developer Indonesia dengan kebutuhan dan permintaan pasar yang semakin kompetitif \n \n"+
                        "Tawaran beasiswa Dosen dan Mahasiswa diberikan dalam bentuk kelas gratis untuk Menjadi Android Developer Expert (MADE). Dicoding Indonesia sendiri merupakan kelas online yang membantu mahasiswa dan dosen untuk belajar bahasa pemrograman, terutama android. Kelas di Dicoding Academy ini dapat diakses dan dipelajari 7 hari x 24 jam, dimanapun, kapanpun selama dapat terkoneksi dengan internet.",
                    "https://i0.wp.com/rizqy.me/wp/wp-content/uploads/2018/04/dicoding.jpg?fit=1200%2C900"},

            {"Yayasan AAB ORBIT Hasri Ainun Habibie",
                    "Yayasan Amal Abadi ORBIT HAH",
                    "Yayasan Amal Abadi Beasiswa ORBIT Hasri Ainun Habibie kembali membuka pendaftaran beasiswa untuk tahun 2019, dengan nilai beasiswa yang lebih besar dan beragam. Mulai tahun 2016 ini, Yayasan Orbit memberikan 2 jenis beasiswa, yaitu Beasiswa Reguler. \n \n" +
                        "Perbedaan utama beasiswa yang diberikan oleh Yayasan Orbit dengan beasiswa lain adalah beasiswa orbit tidak semata-mata memberi bantuan dana, tetapi juga bantuan pelatihan dan pembekalan pada setiap Anbim, agar mereka menjadi lulusan yang tidak hanya cerdas di bidang akademis, tetapi juga menjadi SDM yang beriman, taqwa, terampil dan profesional yang mampu mengubah masa depan Indonesia menjadi lebih baik.",
                    "http://www.scholarsofficial.com/wp-content/uploads/2018/04/Beasiswa-SMA-dan-S1-Yayasan-Orbit.png"},

            {"Beasiswa LPDP (Lembaga Pengelola Dana Pendidikan) 2019-2020",
                    "Layanan Beasiswa dan Pendanaan Riset Indonesia - Untuk S2, S3, Riset",
                    "LPDP menyelenggarakan program beasiswa magister/doktoral untuk putra-putri terbaik Indonesia, pendanaan riset komersial/implementatif untuk mendorong inovasi, serta rehabilitasi fasilitas pendidikan yang rusak karena bencana alam \n \n"+
                        "Beasiswa yang dikelola Lembaga Pengelola Dana Pendidikan (LPDP) ini memiliki beragam pilihan beasiswa yang dinamai Beasiswa Pendidikan Indonesia (BPI). Umumnya memang beasiswa pascasarjana. Selain berupa beasiswa kuliah, ada pula dalam bentuk pendanaan riset. Kedua jenis pembiayaan tersebut dapat Anda manfaatkan untuk rencana studi 2019 – 2020. \n \n"+
                        "Beasiswa LPDP dibuka setiap tahun. Biasanya pendaftaran dilakukan per periodik. Pendaftaran juga dibuka berdasarkan tingginya jumlah peminat.",
                    "https://www.kalderanews.com/wp-content/uploads/2019/05/Beasiswa-LPDP-2019-600x381.jpg"},

            {"Program Coding Indosat Ooredoo Digital Camp (IDCamp)",
                    "Corporate Social Responsibility (CSR) Indosat Ooredoo",
                    "Sebuah program beasiswa dari Indosat Ooredoo untuk mencetak developer/programmer muda Indonesia yang siap bersaing di dunia ekonomi digital. Program IDcamp dapat di ikuti oleh pemuda dan pemudi seluruh indonesia dengan ketentuan syarat maksimal 29 tahun. \n \n"+
                            "Melalui program ini, Indosat Ooredoo mengajak generasi muda Indonesia untuk menggeluti bidang teknologi digital dengan memberikan pelatihan online yang mencakup kelas developer Android, Kotlin, dan Progressive Web Apps di level beginner dan expert. Tersedia fasilitator dan forum diskusi online sebagai sarana bagi peserta IDCamp untuk membantu mereka menyelesaikan semua modul belajar secara online. \n \n"+
                            "Di akhir program, Indosat Ooredoo dan Dicoding akan membantu talenta digital terbaik lulusan IDCamp untuk mendapatkan akses pekerjaan.",
                    "https://cdn.akurat.co/images/uploads/images/medium/akurat_20171114062503_023w61.jpg"},

            {"Beasiswa BIDIKMISI",
                    "Kementerian Ristekdikti ",
                    "Bantuan biaya pendidikan bagi calon mahasiswa tidak mampu secara ekonomi dan memiliki potensi akademik baik untuk menempuh pendidikan di perguruan tinggi pada program studi unggulan sampai lulus tepat waktu \n \n"+
                            "Bidikmisi adalah bantuan dana pendidikan berupa pembebasan biaya pendidikan, yang meliputi pembebasan biaya pendaftaran seleksi masuk SNMPTN dan SBMPTN serta seleksi lain yang ditetapkan oleh masing-masing panitia dan perguruan tinggi, kemudian penggantian biaya kedatangan pertamakali bagi penerima Bidikmisi, serta pembebasan biaya pendidikan yang dibayarkan ke perguruan tinggi. \n \n"+
                            "Selain itu Bidikmisi juga memberikan subsidi biaya hidup bagi penerima terpilih. Besaran subsidi biaya hidup yang diberikan sebesar Rp 650 ribu per bulan. Sedangkan pembebasan biaya pendidikan mencakup semua biaya yang dibayarkan ke Perguruan Tinggi untuk kepentingan pendidikan.",
                    "https://www.uinjkt.ac.id/wp-content/uploads/2016/09/bidikmisi.png"},
        };

    public static ArrayList<Beasiswa> getListData(){
        ArrayList<Beasiswa> list = new ArrayList<>();
        for (String[] aData : data) {
                Beasiswa beasiswa = new Beasiswa();
                beasiswa.setNama(aData[0]);
                beasiswa.setAsal(aData[1]);
                beasiswa.setIsi(aData[2]);
                beasiswa.setPhoto(aData[3]);
                list.add(beasiswa);
        }
        return list;
    }
}
