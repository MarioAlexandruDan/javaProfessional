package jc;

public class LivelockClass {

	static class Criminal {
		private boolean hostageReleased = false;

		public void releaseHostage(Police police) {
			while (!police.moneySend()) {
				System.out.println("Criminal waiting for the money!");
				try {
					Thread.sleep(600);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			hostageReleased = true;
			System.out.println("Hostage released!");
		}

		public boolean hostageReleased() {
			return hostageReleased;
		}
	}

	static class Police {
		private boolean moneySend = false;

		public void sendMoney(Criminal criminal) {
			while (!criminal.hostageReleased()) {
				System.out.println("Police waiting for the hostage!");
				try {
					Thread.sleep(600);
				} catch (InterruptedException ex) {
					ex.printStackTrace();
				}
			}
			moneySend = true;
			System.out.println("Money send!");
		}

		public boolean moneySend() {
			return moneySend;
		}
	}

	public static void main(String[] args) {

		Police police = new Police();
		Criminal criminal = new Criminal();

		new Thread(new Runnable() {
			@Override
			public void run() {
				police.sendMoney(criminal);
			}
		}).start();

		new Thread(new Runnable() {
			@Override
			public void run() {
				criminal.releaseHostage(police);
			}
		}).start();

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// making sure the program closes so you don't forget it running forever
		System.exit(0);
	}
}
