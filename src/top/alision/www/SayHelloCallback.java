package top.alision.www;

import top.alision.www.SayHello.Callback;

public class SayHelloCallback {

	private SayHello sayHello;
	private Callback callback = new Callback() {
		
		@Override
		public void onResult(String s) {
			// TODO Auto-generated method stub
			System.out.println(s);
		}
	};
	public SayHelloCallback(){
		sayHello = new SayHello(callback);
	}
	
	public void username(String user){
		sayHello.say(user);
	}
}
