package com.example.comiccharacters.entities;

public class ComicCharacter
{
	public String getUuid() {
		return uuid;
	}

	public String getCreated_at() {
		return created_at;
	}

	public String getUpdated_at() {
		return updated_at;
	}

	public Data getData() {
		return data;
	}

	public ComicCharacter(String uuid, String created_at, String updated_at, Data data) {
		this.uuid = uuid;
		this.created_at = created_at;
		this.updated_at = updated_at;
		this.data = data;
	}

	private String uuid;
	private String created_at;
	private String updated_at;
	private Data data;

	public static class Data
	{
		public Data() {
		}

		public Data(String align, boolean alive, String gender, String identity, String name, String origin,
		            long page_id,
		            String urlslug, String eye, String hair, String gsm, long appearances,
		            long first_appearance_month,
		            long first_appearance_year)
		{
			this.align = align;
			this.alive = alive;
			this.gender = gender;
			this.identity = identity;
			this.name = name;
			this.origin = origin;
			this.page_id = page_id;
			this.urlslug = urlslug;
			this.eye = eye;
			this.hair = hair;
			this.gsm = gsm;
			this.appearances = appearances;
			this.first_appearance_month = first_appearance_month;
			this.first_appearance_year = first_appearance_year;
		}

		private String align;
		private boolean alive;
		private String gender;
		private String identity;
		private String name;
		private String origin;
		private long page_id;
		private String urlslug;
		private String eye;
		private String hair;
		private String gsm;
		private long appearances;
		private long first_appearance_month;
		private long first_appearance_year;

		public String getAlign() {
			return align;
		}

		public boolean isAlive() {
			return alive;
		}

		public String getGender() {
			return gender;
		}

		public String getIdentity() {
			return identity;
		}

		public String getName() {
			return name;
		}

		public String getOrigin() {
			return origin;
		}

		public long getPage_id() {
			return page_id;
		}

		public String getUrlslug() {
			return urlslug;
		}

		public String getEye() {
			return eye;
		}

		public String getHair() {
			return hair;
		}

		public String getGsm() {
			return gsm;
		}

		public long getAppearances() {
			return appearances;
		}

		public long getFirst_appearance_month() {
			return first_appearance_month;
		}

		public long getFirst_appearance_year() {
			return first_appearance_year;
		}
	}
}
