package br.com.praias.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.praias.models.PraiaModel;

@Service
public class PraiaService {
	public Map<Integer, PraiaModel> praias = new HashMap<Integer, PraiaModel>();
	{
		{
			praias.put (1, new PraiaModel("1.Bonete (Ilha Bela)", "https://naturam.com.br/ilhabela/wp-content/uploads/sites/8/2016/10/1praia-do-bonete-ilhabela.jpg", "São 800 metros de orla, com um rio no lado esquerdo e ondas boas para surfe - as canoas da vila caiçara completam o cenário."));
			praias.put (2, new PraiaModel("2. Maresias (São Sebastião)", "https://travelpedia.com.br/wp-content/uploads/2018/06/praias-do-litoral-norte.jpg", "Durante o dia, surfistas aproveitam o mar de ondas fortes, e muita gente bonita curte o clima de paquera na areia."));	
			praias.put (3, new PraiaModel("3. Praia do Cedro (Ubatuba)", "https://abrilviagemeturismo.files.wordpress.com/2017/01/12_sp26.jpg?quality=70&strip=info&w=922", "Uma das praias mais lindas da cidade do litoral norte de São Paulo se mantém preservada (e vazia) por causa da dificuldade de acesso. É preciso encarar 40 minutos de trilha a partir da Praia Grande do Bonete."));
		}};
		
	
		public Collection<PraiaModel> praias (){
			return this.praias.values();
			
		}
}
