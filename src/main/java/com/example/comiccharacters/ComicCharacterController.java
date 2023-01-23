package com.example.comiccharacters;

import com.example.comiccharacters.dummies.ComicCharacterDummy;
import com.example.comiccharacters.entities.ComicCharacter;
import com.example.comiccharacters.entities.ComicCharactersResultShape;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(path = "/v1/characters")
public class ComicCharacterController
{
	ComicCharacter[] dummies = ComicCharacterDummy.buildDummies();

	@GetMapping(path = "/", produces = MediaType.APPLICATION_JSON_VALUE)
	public ComicCharactersResultShape getComicCharacters()
	{
		long total = 244 / dummies.length + 1;
		return new ComicCharactersResultShape(dummies, 244, 1, dummies.length, total);
	}

	@GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ComicCharacter getComicCharacter(@PathVariable String id)
	{
		return Arrays.stream(dummies)
				.filter(d -> d.getUuid().equals(id))
				.findFirst()
				.orElse(dummies[0]);
	}
}
