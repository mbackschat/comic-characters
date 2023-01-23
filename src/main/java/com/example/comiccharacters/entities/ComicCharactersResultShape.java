package com.example.comiccharacters.entities;

public class ComicCharactersResultShape
{
	public ComicCharactersResultShape(ComicCharacter[] characters, long elements_total, long page_number,
	                                  long page_size, long page_total)
	{
		this.characters = characters;
		this.elements_total = elements_total;
		this.page_number = page_number;
		this.page_size = page_size;
		this.page_total = page_total;
	}

	private ComicCharacter[] characters;
	private long elements_total;
	private long page_number;
	private long page_size;
	private long page_total;

	public ComicCharacter[] getCharacters() {
		return characters;
	}

	public long getElements_total() {
		return elements_total;
	}

	public long getPage_number() {
		return page_number;
	}

	public long getPage_size() {
		return page_size;
	}

	public long getPage_total() {
		return page_total;
	}
}
