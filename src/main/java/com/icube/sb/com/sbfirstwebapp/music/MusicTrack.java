package com.icube.sb.com.sbfirstwebapp.music;

public class MusicTrack {
	private String album;
	private String singer;
	private String movie;
	private String telugusong;
	
	public MusicTrack() {
		
}

	public MusicTrack(String album, String singer, String movie, String telugusong) {
		super();
		this.album = album;
		this.singer = singer;
		this.movie = movie;
		this.telugusong = telugusong;
	}

	public String getalbum() {
		return album;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getMovie() {
		return movie;
	}

	public void setMovie(String movie) {
		this.movie = movie;
	}

	public String getTelugusong() {
		return telugusong;
	}

	public void setTelugusong(String telugusong) {
		this.telugusong = telugusong;
	}
	

}


