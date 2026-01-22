import model.Gos

fun main() {
    var milu: Gos = Gos("Milu")

    var snoopy: Gos
    snoopy = Gos("Snoopy", "Mileches", 1234)

    var pepe: Gos = Gos("Pepe", "Pepe", 123123)

    milu.afegirCadell(snoopy)
    milu.afegirCadell(pepe)

    println(milu)

    for (gos in milu.getCadells()) {
        println(gos)
    }

    println(milu.getXip())
    var xipNou: Int = readln().toInt()

    var xipCanviat: Boolean = milu.setXip(xipNou)

    if (xipCanviat) {
        println("Hem canviat el xip correctament")
    }else{
        println("Numero de xip erroni")
    }

    println(milu.getXip())

}