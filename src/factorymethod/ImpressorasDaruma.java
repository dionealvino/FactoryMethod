package factorymethod;

public class ImpressorasDaruma implements FabricaImpressora{

    @Override
    public ImpressoraFiscal adicionaImpressora() {
        return new FS700();
    }
    
}
