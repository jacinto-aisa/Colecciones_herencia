import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
class Escrito
{
    private String texto;
    private int FechaAnual;

    public Escrito(String texto, int fechaAnual) {
        setTexto(texto);
        setFechaAnual(fechaAnual);
    }

    public Escrito(String texto) {
        setTexto(texto);
        FechaAnual = 2023;
    }

    public Escrito()
    {
        texto = "patata";
        FechaAnual = 2023;
    }
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        if (texto == "")
            this.texto = "vacio";
        else
            this.texto = texto;
    }

    public int getFechaAnual() {
        return FechaAnual;
    }

    public void setFechaAnual(int fechaAnual) {
        if (fechaAnual > 2023)
            FechaAnual = 2023;
        else
            FechaAnual = fechaAnual;
    }

    @Override
    public String toString() {
        return "Escrito{" +
                "texto='" + texto + '\'' +
                ", FechaAnual=" + FechaAnual +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        Escrito EscritoDelMarMuerto = new Escrito("El mar muerto esta calmado",-560);
        Escrito EscritoFuturista = new Escrito("el futuro ya estça aquo",3000);
        Escrito EscritoActual = new Escrito("el presente ya está aquí");
        Escrito EscritoRepetido = new Escrito();
        Escrito ClonEscritoDelMarMuerto = new Escrito("El mar muerto esta calmado",-560);

        ArrayList<Escrito> ColeccionEscritos = new ArrayList<Escrito>();
        ColeccionEscritos.add(EscritoDelMarMuerto);
        ColeccionEscritos.add(0,EscritoFuturista);
        ColeccionEscritos.add(EscritoActual);
        ColeccionEscritos.add(EscritoRepetido);
        ColeccionEscritos.add(ClonEscritoDelMarMuerto);

        System.out.println("La posición del Escrito Repetido es la: "+ColeccionEscritos.indexOf(EscritoRepetido));
        System.out.println("La coleccion ha encontrado el EscritoActual: "+ColeccionEscritos.contains(EscritoActual));

        Escrito ElementoNoIntroducido = new Escrito();
        System.out.println("La coleccion ha encontrado el No introducido: "+ColeccionEscritos.contains(ElementoNoIntroducido));

        for(Escrito escritoQueEstoyLimpiando : ColeccionEscritos)
        {
            System.out.println(escritoQueEstoyLimpiando);
        }

        System.out.println("Tamaño de colección es: "+ColeccionEscritos.size());
    }
}