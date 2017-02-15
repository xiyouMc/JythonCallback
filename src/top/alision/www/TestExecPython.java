package top.alision.www;

import java.util.HashMap;
import java.util.Map;

public enum TestExecPython {
	INSTANCE;

	public synchronized void test() {
		String scriptFile = "test.py";
		Map<String, String> properties = new HashMap<String, String>();
		properties.put("userName", "Demo");
		ExecPython.INSTANCE.execute(scriptFile, properties);
	}
}
