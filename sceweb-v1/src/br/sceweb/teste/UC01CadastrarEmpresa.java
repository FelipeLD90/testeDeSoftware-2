package br.sceweb.teste;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import br.sceweb.modelo.Empresa;
import br.sceweb.modelo.EmpresaDAO;

public class UC01CadastrarEmpresa {
	static Empresa empresa;
	static EmpresaDAO empresaDAO;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		empresaDAO = new EmpresaDAO();
		empresa = new Empresa();
		
		empresa.setNome("empresa1");
		empresa.setCnpj("1234567890");
		empresa.setNomeFantasia("fantasia1");
		empresa.setEndereco("Rua Taquari");
		empresa.setTelefone("111111");
		
		
	}
	/**
	 * objetivo - verificar o comportamento do sistema na inclusão de 
	 * uma empresa com sucesso
	 */
	@Test
	public void CT01UC01FBCadastra_com_sucesso() {
		assertEquals("cadastro realizado com sucesso", empresaDAO.adiciona(empresa));
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		
	}



}
