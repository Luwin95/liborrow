package org.liborrow.webservice.model.transformer.impl;

import java.util.HashSet;
import java.util.Set;

import org.liborrow.webservice.model.dto.AuthorDTO;
import org.liborrow.webservice.model.dto.CitizenshipDTO;
import org.liborrow.webservice.model.entities.Author;
import org.liborrow.webservice.model.entities.Citizenship;
import org.liborrow.webservice.model.transformer.contract.AuthorTransformer;
import org.liborrow.webservice.model.transformer.contract.CitizenshipTransformer;

public class CitizenshipTransformerImpl implements CitizenshipTransformer {
	
	@Override
	public CitizenshipDTO toCitizenshipDTO(Citizenship citizenship, boolean isParent) {
		CitizenshipDTO citizenshipTransformed = new CitizenshipDTO();
		citizenshipTransformed.setCountryName(citizenship.getCountryName());
		
		if(citizenship.getAuthors() !=null && isParent)
		{
			Set<AuthorDTO> authorsTransformed= new HashSet<>();
			AuthorTransformer authorTransformer = new AuthorTransformerImpl();
			for(Author author: citizenship.getAuthors())
			{
				authorsTransformed.add(authorTransformer.toAuthorDto(author, false));
			}
			citizenshipTransformed.setAuthors(authorsTransformed);
		}
		return citizenshipTransformed;
	}
	
	@Override
	public Set<CitizenshipDTO> toCitizenshipsDTO(Set<Citizenship> citizenships, boolean isParent) {
		Set<CitizenshipDTO> citizenshipsTransformed = new HashSet<>();
		for(Citizenship citizenship : citizenships)
		{
			citizenshipsTransformed.add(toCitizenshipDTO(citizenship, isParent));
		}
		return citizenshipsTransformed;
	}

}