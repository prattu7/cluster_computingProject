package ClusterComputingTesting;

import java.io.IOException;

public class Kill_a_process {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Runtime.getRuntime().exec("taskkill /F /IM chromedriver_108*");

	}

}
