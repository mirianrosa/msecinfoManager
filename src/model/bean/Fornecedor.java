package model.bean;

/**
 *
 * @author mirian.rosa
 */
public class Fornecedor {
    
    private int id;
    private String empresa;
    private String cnpj;
    private String fornecimento;
    private double preco;
    private String statuspagamento;
    private String vencimento;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getFornecimento() {
        return fornecimento;
    }

    public void setFornecimento(String fornecimento) {
        this.fornecimento = fornecimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getStatuspagamento() {
        return statuspagamento;
    }

    public void setStatuspagamento(String statuspagamento) {
        this.statuspagamento = statuspagamento;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
    
    
    
}
