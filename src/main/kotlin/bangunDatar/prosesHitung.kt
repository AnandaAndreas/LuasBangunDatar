package bangunDatar

fun main() {

    println("1. Menghitung luas Lingkaran")
    println("2. Menghitung luas Persegi Panjang")
    println("3. Menghitung luas Persegi")
    println("4. Menghitung luas Segitiga")
    println("5. Tutup Menu")
    do {
        print("Masukan Pilihan : ")
        val pilih = readln().toInt()
        when(pilih) {
                1 -> {
                    print("Masukan jari-jari : ")
                    val jari = readln().toInt()
                    val luasLingkaran: String = Lingkaran(jari).let {"Luas lingkaran = ${it.luas}"}
                    println("$luasLingkaran \n")
                }
                2 -> {
                    print("Masukan Panjang : ") ; val panjang = readln().toInt()
                    print("Masukan Lebar : "); val lebar = readln().toInt()
                    val persegiPanjang: String = PersegiPanjang(panjang,lebar).let{"Luas Persegi Panjang = ${it.luas}"}
                    println("$persegiPanjang \n")
                }
                3 -> {
                    print("Masukan Sisi : "); val sisi = readln().toInt()
                    val luasPersegi = {sisi:Int ->  val luas = sisi*sisi
                        "luas Persegi = $luas"}
                    println("${luasPersegi(sisi)}\n")
                }
                4 -> {
                    print("Masukan Alas : "); val alas = readln().toDouble()
                    print("Masukan Tinggi : "); val tinggi = readln().toDouble()
                    val segitiga= {alas:Double, tinggi:Double -> val luas = (alas * tinggi)/2
                        "Luas Segitiga = $luas"}
                    println("${segitiga(alas,tinggi)}\n")
                }
        }
    }while (pilih != 5)
    println("Program selesai")

}