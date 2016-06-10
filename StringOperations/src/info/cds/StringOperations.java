package info.cds;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringOperations {

	public static void main(String[] args) throws IOException,FileNotFoundException{
		FileOutputStream fis=new FileOutputStream("abc.txt");
		DataOutputStream dis=new DataOutputStream(fis);
		
	dis.writeInt(97);
	dis.writeFloat(3.14f);
	dis.writeChar('a');
	dis.writeBoolean(true);
	dis.writeUTF("SURYAMovva");
	FileInputStream fis1=new FileInputStream("abc.txt");
	DataInputStream dis1=new DataInputStream(fis1);
	
int i=dis1.readInt();
float f=dis1.readFloat();
char ch=dis1.readChar();
boolean b=dis1.readBoolean();
String s=dis1.readUTF();
System.out.println(i);
System.out.println(f);
System.out.println(ch);
System.out.println("hi");
	}
}
