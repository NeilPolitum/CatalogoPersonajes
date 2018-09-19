package catalogo;

public class FabricaHumano extends FabricaPersonajes {

    @Override
    public ArmaAbstracta crearArma() {
        return new Espada();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Caballo();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoHumano();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Humano();
    }
}