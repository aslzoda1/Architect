import java.util.Scanner
fun main() {
    val architect = AsciiArt()
    val scanner = Scanner(System.`in`)

    println("🎨 ASCII Architect: Terminalda chizish laboratoriyasi!")

    while (true) {
        println("\n--- 🛠 SHAKLLAR MENYUSI ---")
        println("1. Kvadrat | 2. Uchburchak | 3. Piramida | 0. Chiqish")
        print("Tanlang: ")

        when (scanner.next()) {
            "1" -> {
                print("O'lchamini kiriting: ")
                val s = scanner.nextInt()
                architect.drawSquare(s)
            }
            "2" -> {
                print("Balandligini kiriting: ")
                val h = scanner.nextInt()
                architect.drawTriangle(h)
            }
            "3" -> {
                print("Piramida balandligi: ")
                val h = scanner.nextInt()
                architect.drawPyramid(h)
            }
            "0" -> {
                println("Ijodingizga baraka! Xayr! 👋")
                return
            }
            else -> println("⚠️ Bunday shakl yo'q!")
        }
    }
}