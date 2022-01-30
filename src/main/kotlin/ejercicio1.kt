import javax.swing.JOptionPane

fun main(args: Array<String>) {
    notas()
}
fun notas() {
    var nota = JOptionPane.showInputDialog("Ingresa una nota").toInt()
    when {
        nota < 0 -> println("el valor introducido no es correcto")
        nota < 5 -> println("suspenso")
        nota < 7 -> println("aprobado")
        nota <= 8 -> println("notable")
        nota < 11 -> println("sobresaliente")
        nota >= 11 -> println("el valor introducido no es correcto")
    }
}