public class Endereco
{
    private String cidade;
    private String qtdmorador;
    private String uf;
    private String cep;
    private String pais;
    private String bairro;
    private int numero;
    private int logradouro;

    public Endereco (String cidade, String qtdmorador, String uf,String cep,String pais, String bairro, int numero, int logradouro)
    {
        this.cidade = cidade;
        this.qtdmorador = qtdmorador;
        this.uf = uf;
        this.cep = cep;
        this.pais = pais;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
    }
    public String getCidade()
    {
        return cidade;
    }
    public void setCidade(String cidade)
    {
        this.cidade = cidade;
    }
    public String getQtdmorador()
    {
        return qtdmorador;
    }
    public void setQtdmorador(String qtdmorador)
    {
        this.qtdmorador = qtdmorador;
    }
    public String Pais()
    {
        return pais;
    }
    public void setPais(String pais)
    {
        this.pais = pais;   
    }
    public String Bairro()
    {
        return bairro;
    }
    public void setBairro(String bairro)
    {
        this.bairro = bairro;
    }
    public int numero()
    {
        return numero;
    }
    public void setPais( int numero )
    {
        this.numero = numero;   
    }
    public int Logradouro()
    {
        return numero;
    }
    public void setLogradouro(int logradouro)
    {
        this.logradouro = logradouro;   
    }
}