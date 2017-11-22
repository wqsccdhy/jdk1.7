package serializable.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SerializableHelper {

	/**
	 * 将对象进行序列化，存入磁盘
	 * 
	 * @param object
	 */
	public static void serializeObj(Object obj, String filePath, String fileName) {

		ObjectOutputStream outputStream = null;
		try {
			OutputStream out = new FileOutputStream(filePath + fileName);
			outputStream = new ObjectOutputStream(out);
			outputStream.writeObject(obj);
			outputStream.flush();
			System.out.println("序列化成功...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (outputStream != null) {
				try {
					outputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					outputStream = null;
				}
			}
		}

	}

	/**
	 * 将对象进行反序列化
	 * 
	 * @param filePath
	 * @param fileName
	 * @return
	 */
	public static Object deserializeObject(String filePath, String fileName) {

		Object object = null;
		ObjectInputStream inputStream = null;
		try {
			InputStream in = new FileInputStream(filePath + fileName);
			inputStream = new ObjectInputStream(in);
			object = inputStream.readObject();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (inputStream != null) {
				try {
					inputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					inputStream = null;
				}
			}
		}

		return object;

	}

}
