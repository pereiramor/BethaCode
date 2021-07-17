public class PessoaJuridica extends Pessoa{
    private String cnpj;
    private String incricaoestadual;
    private String cnae;

    public PessoaJuridica(Integer id, String nome, String endereco, String telefone, String cnpj, String incricaoestadual, String cnae) {
        super(id, nome, endereco, telefone);
        this.cnpj = cnpj;
        this.incricaoestadual = incricaoestadual;
        this.cnae = cnae;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIncricaoestadual() {
        return incricaoestadual;
    }

    public void setIncricaoestadual(String incricaoestadual) {
        this.incricaoestadual = incricaoestadual;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    }

    @Override
    public String getDocumentoPrincipal(){
        return cnpj;
    }
}
