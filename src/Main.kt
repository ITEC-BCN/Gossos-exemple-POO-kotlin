import model.Gos

fun main() {
    var milu: Gos = Gos("Milu")

    var snoopy: Gos
    snoopy = Gos("Snoopy", "Mileches", 1234)

    var pepe: Gos = Gos("Pepe", "Pepe", 123123)

    milu.afegirCadell(snoopy)
    milu.afegirCadell(pepe)

    println(milu)

    for (gos in milu.cadells) {
        println(gos)
    }

}