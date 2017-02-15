package top.alision.www;

public class SayHello {
	public static interface Callback {
		void onResult(String s);
	}

	private Callback callback;

	public SayHello(Callback callback) {
		this.callback = callback;
	}

	public void say(String userName) {
		callback.onResult(userName);
	}
}
