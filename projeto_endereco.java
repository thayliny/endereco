public class TipoLogradouro {
    public static final String ALAMEDA = "Alameda";
    public static final String AVENIDA = "Avenida";
    public static final String MARGINAL = "Marginal";
    public static final String RUA = "Rua";
    public static final String RODOVIA = "Rodovia";
}

public class TipoEndereco {
    public static final String COMERCIAL = "Comercial";
    public static final String RESIDENCIAL = "Residencial";
}

class PessoaFisica {
    private String nome;
    private String sexo;
    private Logradouro logradouro;
    private Date dataNascimento;
}

class Logradouro {
    private String nome;
    private String tipo;
    private Endereco endereco;
}

class Endereco {
    private int numero;
    private String complemento;
    private int cep;
    private Bairro bairro;
    private String tipo;
}

class Bairro {
    private String nome;
}

class Cidade {
    private String nome;
}

class Estado {
    private String sigla;
    private String nome;
}

class Pais {
    private String nome;
}