package com.example.comiccharacters.dummies;

import com.example.comiccharacters.entities.ComicCharacter;

// Source https://datahub.io/five-thirty-eight/comic-characters
public interface ComicCharacterDummy
{
	static ComicCharacter[] buildDummies() {
		return new ComicCharacter[]{buildReal1(), buildReal2(), buildDummy1(), buildDummy2()};
	}

	// ----- REAL

	static ComicCharacter buildReal1() {
		var data = new ComicCharacter.Data("GOOD", false, "MALE", "SECRET", "Spider-Man (Peter Parker)",
				"MARVEL", 1678,
				"/spider-man_(peter_parker)", "hazel", "brown", "", 4043, 8, 1962);
		return new ComicCharacter("3343434-627d-9275-409d-f9e19be8efaa", "2021-11-02T05:49:18.165Z",
				"1993-07-31T23:57:25.759Z", data);
	}

	static ComicCharacter buildReal2() {
		var data = new ComicCharacter.Data("GOOD", true, "MALE", "PUBLIC", "Captain America (Steven Rogers)",
				"MARVEL", 7139,
				"/captain_america_(steven_rogers)", "blue", "white", "", 3360, 3, 1941);
		return new ComicCharacter("332aa24-627d-9275-409d-f9e19be8eccc", "2021-09-02T05:49:18.165Z",
				"1994-07-31T23:57:25.759Z", data);
	}

	// ----- DUMMY

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
