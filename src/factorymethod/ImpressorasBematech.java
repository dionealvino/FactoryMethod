package factorymethod;

public class ImpressorasBematech implements FabricaImpressora{

    @Override
    public ImpressoraFiscal adicionaImpressora() {
        return new MP4000();
    }
    
}
