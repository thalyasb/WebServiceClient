package br.dominio;

import java.rmi.RemoteException;

import org.apache.axis2.AxisFault;

import br.dominio.HelloWorldImplServiceStub.SayHelloWorld;

public class Start {
	
	public static void main(String[] args) {
		
		HelloWorldImplServiceStub.SayHelloWorldE helloWorld = new HelloWorldImplServiceStub.SayHelloWorldE();
		
		SayHelloWorld name = new SayHelloWorld();
		name.setArg0(" Thalya");
		helloWorld.setSayHelloWorld(name);
		
		try {
			HelloWorldImplServiceStub.SayHelloWorldResponseE resposta = new HelloWorldImplServiceStub().sayHelloWorld(helloWorld);
			
			System.out.println(resposta.getSayHelloWorldResponse().get_return());
			
		} catch (AxisFault e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
