package springcore.no_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Garp")
public class OnePiece {
	@Value("Monkey D Luffy")
	private String NewkingOfPirates;
	@Autowired
	private kingOfPirate kingofpirate;
	@Autowired
	private ViceCaptain viceCaptain;
	public ViceCaptain getViceCaptain() {
		return viceCaptain;
	}
	public void setViceCaptain(ViceCaptain viceCaptain) {
		this.viceCaptain = viceCaptain;
	}
	@Override
	public String toString() {
		return "OnePiece [NewkingOfPirates=" + NewkingOfPirates + ", kingofpirate=" + kingofpirate + "]";
	}
	public OnePiece() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OnePiece(String newkingOfPirates, kingOfPirate kingofpirate) {
		super();
		NewkingOfPirates = newkingOfPirates;
		this.kingofpirate = kingofpirate;
	}
	public String getNewkingOfPirates() {
		return NewkingOfPirates;
	}
	public void setNewkingOfPirates(String newkingOfPirates) {
		NewkingOfPirates = newkingOfPirates;
	}
	public kingOfPirate getKingofpirate() {
		return kingofpirate;
	}
	public void setKingofpirate(kingOfPirate kingofpirate) {
		this.kingofpirate = kingofpirate;
	}

}
