package com.example.comiccharacters.dummies;

import com.example.comiccharacters.entities.ComicCharacter;

public interface ComicCharacterDummy
{
	static ComicCharacter[] buildDummies() {
		return new ComicCharacter[]{buildDummy1(), buildDummy2()};
	}

	static ComicCharacter buildDummy1() {
		var data = new ComicCharacter.Data("GOOD", true, "FEMALE", "UNKNOWN", "tempor veniam", "MARVEL", -93524860,
				"occaecat", "in exercit", "non", "TRANSVESTITE", -77112888, -16853342, 84528313);
		return new ComicCharacter("94018e0a-1351-043d-0eb3-fb871e654001", "2007-10-04T21:27:13.533Z",
				"1971-11-06T15:42:58.903Z", data);
	}

	static ComicCharacter buildDummy2() {
		var data = new ComicCharacter.Data("NEUTRAL", true, "TRANSGENDER", "SECRET", "nulla enim", "MARVEL", 61782584,
				"adipisicing labore", "tempor", "qui reprehenderit Ut", "TRANSVESTITE", 90323085, -32927562, 62881176);
		return new ComicCharacter("a3b7c4ee-b6a0-3673-d036-2101e962bd64", "1980-06-09T11:14:19.669Z",
				"1974-01-25T21:52:25.296Z", data);
	}
}
