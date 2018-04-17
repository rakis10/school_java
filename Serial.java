package pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Serial implements Serializable{
	public Data data;
	
	 public static  void save(Data dataa) {
		 
			FileOutputStream fos;
			try {
				fos = new FileOutputStream("data.out");
				ObjectOutputStream oos1 = new ObjectOutputStream(fos);
				
				oos1.writeObject(dataa);
				oos1.flush();
				oos1.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
	 public  Data load() throws IOException {
		 FileInputStream fis = null;
		 Data daata = null;
		try {
			fis = new FileInputStream("data.out");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			ObjectInputStream oin = null;
			try {
				oin = new ObjectInputStream(fis);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				daata = (Data) oin.readObject();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return daata;
	 }
}
