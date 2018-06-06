
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobileTelephone telephone = new MobileTelephone();
		SIM sim = new SIMOfChinaMobile();
		sim.setNumber("13887656432");
		telephone.useSIM(sim);
		telephone.showMess();
		sim = new SIMOfChinaUnicom();
		sim.setNumber("13097656437");
		telephone.useSIM(sim);
		telephone.showMess();
	}

}
