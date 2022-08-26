package springcore.no_xml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class kingOfPirate {
	@Value("Gold D Roger")
	private String king;

	@Override
	public String toString() {
		return "kingOfPirate [king=" + king + "]";
	}

	public kingOfPirate() {
		super();
		// TODO Auto-generated constructor stub
	}

	public kingOfPirate(String king) {
		super();
		this.king = king;
	}

	public String getKing() {
		return king;
	}

	public void setKing(String king) {
		this.king = king;
	}

}
