package factorymethod;

public class ImpressorasEpson implements FabricaImpressora{

    @Override
    public ImpressoraFiscal adicionaImpressora() {
        return new TMT81();
    }
    
}
