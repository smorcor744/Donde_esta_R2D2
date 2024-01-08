package org.example
fun main() {
    var r2d2ps: List<Int>

    r2d2ps = movimiento(10,5,-2)
    println("x: ${r2d2ps[0]},y: ${r2d2ps[1]},direction: ${orientacion(r2d2ps[2])}")

    r2d2ps = movimiento(0,0,0)
    println("x: ${r2d2ps[0]},y: ${r2d2ps[1]},direction: ${orientacion(r2d2ps[2])}")


    r2d2ps = movimiento()
    println("x: ${r2d2ps[0]},y: ${r2d2ps[1]},direction: ${orientacion(r2d2ps[2])}")

    r2d2ps = movimiento(-10,-5,2)
    println("x: ${r2d2ps[0]},y: ${r2d2ps[1]},direction: ${orientacion(r2d2ps[2])}")

    r2d2ps = movimiento(-10,-5,2,4,-8)
    println("x: ${r2d2ps[0]},y: ${r2d2ps[1]},direction: ${orientacion(r2d2ps[2])}")


}

fun orientacion(dir:Int) = when (dir){
        0 -> "POSITIVEY"
        1 -> "NEGATIVEX"
        2 -> "NEGATIVEY"
        3 -> "POSITIVEX"
        else -> ""
    }


/**
 * Descripcion
 * @param movs List<Int> Lista
 */
fun movimiento(vararg movs: Int): List<Int> {

    var posx = 0
    var posy = 0
    var dir = 0 //0 -> POSITIVEY 1-> NEGATIVEX 2-> NEGATIVEY 3-> POSITIVEX

    for (pasos in movs ) {
        when (dir){
            0 -> posy += pasos
            1 -> posx -= pasos
            2 -> posy -= pasos
            3 -> posx += pasos

        }
        if (dir == 3) dir = 0 else dir++
    }

    return listOf(posx, posy, dir)


}


