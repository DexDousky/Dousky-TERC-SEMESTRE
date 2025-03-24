public class Proprietario
{
    private String nome;
    private String email;
    private String cpf;
    private String datanascimento;
    private int telefone;
    private String cidade;
    private String qtdmorador;
    private String uf;
    private String cep;
    private String pais;
    private String bairro;
    private int numero;
    private int logradouro;

    public Proprietario (String nome, String email, String cpf, String datanascimento, int telefone, String cidade, String qtdmorador, String uf,String cep,String pais, String bairro, int numero, int logradouro)
    {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.datanascimento = datanascimento;
        this.cidade = cidade;
        this.qtdmorador = qtdmorador;
        this.uf = uf;
        this.cep = cep;
        this.pais = pais;
        this.bairro = bairro;
        this.numero = numero;
        this.logradouro = logradouro;
    }
    public String getNome()
    {
        return nome;
    }
    public void setNome(String nome)
    {
        this.nome = nome;
    }
    public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }
    public String getCpf()
    {
        return cpf;
    }
    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }
    public int getTelefone()
    {
        return telefone;
    }
    public void setTelefone(int telefone)
    {
        this.telefone = telefone;
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