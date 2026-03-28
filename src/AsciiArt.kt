class AsciiArt {
     fun drawSquare(size: Int, symbol: String = "*") {
        for (i in 1..size) {
            for (j in 1..size) {
                print("$symbol ")
            }
            println()
        }
    }

     fun drawTriangle(height: Int, symbol: String = "*") {
        for (i in 1..height) {
            for (j in 1..i) {
                print("$symbol ")
            }
            println()
        }
    }

     fun drawPyramid(height: Int, symbol: String = "*") {
        for (i in 1..height) {
             for (j in 1..height - i) {
                print(" ")
            }
             for (k in 1..(2 * i - 1)) {
                print(symbol)
            }
            println()
        }
    }
}