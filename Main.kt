import java.awt.SystemColor.menu
import java.util.*
public var input = Scanner(System.`in`);
fun main() {


    println("===============================")
    println("Silahkan Isi Data Diri Anda")
    println("===============================")

    print("Nama :")
    val nama: String? = input.nextLine()

    if (nama.isNullOrEmpty()) {
        println("Silahkan Diisi")
        main()
    }
    print("Kelas :")
    val kelas: String = input.nextLine()
    print("No Absen:")
    val Absen = input.nextInt()
    print("GitHub:")
    val git: String? = null
    val gitLength = git?.length ?: "FailanRahsya"
    println(gitLength)
    println("================================")
    menu()
}
fun menu(){
    println("================================");
    println("1. Volume Balok\n2. Volume Bola\n ")
    println("================================");
    print ("Pilih Menu Diatas dengan menginput nomer yang tersedia : ")
    val pill:Int? = input.nextInt()
    when (pill) {
        1 -> balok()
        2 -> bola()
        else -> {
            println("Maaf Pilihan tidak tersedia")
            menu()
        }
    }
}
fun balok() {
    println("================================");
    print("Masukan Panjang Balok : ");
    val panjang: Double = input.nextDouble();
    print("Masukan Lebar Balok : ");
    val lebar: Double = input.nextDouble();
    print("Masukan Tinggi Balok :");
    val tinggi:Double = input.nextDouble();

    val v = panjang * lebar* tinggi;
    println("================================");
    print("Volume Blok adalah = ");
    System.out.printf("%.2f", v);
    println()
    println("================================");
    menu()

}
fun bola() {
    println("================================");
    print("Masukan jari-jari bola: ");
    var jari: Double? = null
    jari = input.nextDouble();

    val v: Double = 4 * Math.PI * jari * jari * jari/3
    println("================================");
    print("Volume Bola adalah = ");
    System.out.printf("%.2f", v);
    println()



}