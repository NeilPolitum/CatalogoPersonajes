package catalogo;

public class FabricaElfo extends FabricaPersonajes{

    @Override
    public ArmaAbstracta crearArma() {
        return new Arco();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Reno();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoElfo();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Elfo();
    }
}