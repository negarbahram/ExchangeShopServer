
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ClientManager implements Runnable {
	Socket clientHolder;
	Server serverHolder;
	InputStream fromClientStream;
	OutputStream toClientStream;
	DataInputStream reader;
	PrintWriter writer;

	public ClientManager(Server server,Socket client) {
		serverHolder = server;
		clientHolder = client;	
	}

	public void run() {
		try {
			fromClientStream = clientHolder.getInputStream();

			toClientStream = clientHolder.getOutputStream();

			reader = new DataInputStream(fromClientStream);
			writer = new PrintWriter(toClientStream, true);
			
			while (true) {

			}
		} catch (Exception e) {
		}
	}
}