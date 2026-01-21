package model

class Gos {
    private var nom: String
    private var especie: String
    private var xip: Int
    private var pes: Float
    private var color: String
    private var teRabia: Boolean
    private var mossega: Boolean
    private var cadells: MutableList<Gos>

    /**
     * Constructor específic pel qual es necessita el nom del Gos
     * @param pNom String del nom del Gos
     */
    constructor(pNom: String){
        this.nom = pNom
        this.especie = ""
        this.xip = 0
        this.pes = 0f
        this.color = "Blanc"
        this.teRabia = false
        this.mossega = false
        this.cadells = mutableListOf()
    }

    /**
     * Constructor específic que rep els atributs...
     * @param nom
     * @param especie
     * @param xip
     */
    constructor(nom: String, especie: String, xip: Int){
        this.nom = nom
        this.especie = especie
        this.xip = xip
        this.pes = 0f
        this.color = "Blanc"
        this.teRabia = false
        this.mossega = false
        this.cadells = mutableListOf()
    }

    constructor(nom: String, especie: String, xip: Int, pes: Float, color: String, teRabia: Boolean, mossega: Boolean){
        this.nom = nom
        this.especie = especie
        this.xip = xip
        this.pes = pes
        this.color = color
        this.teRabia = teRabia
        this.mossega = mossega
        this.cadells = mutableListOf()
    }

    fun afegirCadell(gos: Gos){
        this.cadells.add(gos)
    }

    @Override
    override fun toString(): String {
        var impressioGos = "El gos es diu: ${this.nom} i la espècie és: ${this.especie}"

        return impressioGos
    }

}