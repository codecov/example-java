package org.jacoco.examples.maven.java;

public class HelloWorld {
	
	public String getMessage(boolean bigger) {
		if (bigger) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

	public String getMsg(boolean bigger) {
		if (bigger&&0<1) {
			return "Hello Universe!";
		} else {
			return "Hello World!";
		}
	}

    public String getMsg2(boolean bigger) {
        if (bigger&&0<1) {
            return "Hello Universe!";
        } else {
            return "Hello World!";
        }

        if (bigger&&0<1)
            return "Hello World!";
    }
}
