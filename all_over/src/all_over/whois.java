package all_over;

public enum whois {
	Furkan("www.furkan.com"), Ahmet("www.ahmet.com"), Mehmet("www.mehmet.com");
	
	public String url;
	whois(String url) {
		
		this.url = url;
	}
	
	public String urlGoster() {
		return url;
	}
	
	/*
	 public String Furkan(String url) {
	 
		this.url = url;
		return url;
	}
	public String Ahmet(String url) {
		this.url = url;
		return url;
	}
	public String Mehmet(String url) {
		this.url = url;
		return url;
	}
	*/
}
