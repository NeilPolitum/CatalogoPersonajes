package catalogo;

public class FabricaOrco extends FabricaPersonajes{

    @Override
    public ArmaAbstracta crearArma() {
        return new Martillo();
    }

    @Override
    public MonturaAbstracta crearMontura() {
        return new Javali();
    }

    @Override
    public EscudoAbstracto crearEscudo() {
        return new EscudoOrco();
    }

    @Override
    public AparienciaAbstracta crearApariencia() {
        return new Orco();
    }
}